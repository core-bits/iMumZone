/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corebits.imumzone.ejb;

import com.corebits.imumzone.converter.DTOMapper;
import com.corebits.imumzone.converter.EntityMapper;
import com.corebits.imumzone.dto.ChildProfileQueryDTO;
import com.corebits.imumzone.dto.ChildStoryDTO;
import com.corebits.imumzone.exception.IMumZoneException;
import com.corebits.imumzone.persistence.ChildProfile;
import com.corebits.imumzone.persistence.ChildStory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Thomas.Matthew
 */
@Stateless
public class ChildStoryEngine implements ChildStoryEngineLocal {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChildProfileEngine.class);

    @Inject
    AbstractEngine bean;
    @Inject
    DTOMapper dtoMapper;
    @Inject
    EntityMapper entityMapper;
    @Inject
    ChildProfileEngineLocal childProfile;

    public List<Object> getStories(ChildProfileQueryDTO queryDTO) {
        Map<String, Object> params = filterOutNull(queryDTO);
        String name = "ChildStory.findByStoryId";
        List<Object> findWithNamedQuery = bean.findWithNamedQuery(name, params, 0, 0);
        return findWithNamedQuery;
    }

    @Override
    public List<Object> getChildStories(String storyId) throws IMumZoneException {
        Map<String, Object> params = new HashMap<>();
        params.put("storyId", storyId);
        String name = "ChildStory.findByStoryId";
        List<Object> findWithNamedQuery = bean.findWithNamedQuery(name, params);
        return findWithNamedQuery;
    }

    @Override
    public void createChildStories(ChildStoryDTO storyDTO) throws IMumZoneException {
        ChildProfile childProfileEnt = childProfile.getChildProfileEnt(storyDTO.getChildProfileId().getId());
        storyDTO.setChildProfileId(childProfileEnt);
        ChildStory childStory = entityMapper.mapToChildStory(storyDTO);
        bean.create(childStory);
    }

    private Map<String, Object> filterOutNull(ChildProfileQueryDTO queryDTO) {
        Map<String, Object> params = new HashMap<>();
        String query = "SELECT c FROM ChildStory c WHERE c.id = :id";
        if (queryDTO != null) {
            if (queryDTO.getDateCreated() != null) {
                params.put("dateCreated", queryDTO.getDateCreated());
            }
            if (queryDTO.getDateCreated() != null) {
                params.put("id", queryDTO.getId());
                query = query.concat("c.id = :") + queryDTO.getId();
            }
            if (queryDTO.getDateCreated() != null) {
                params.put("dateOfBirth", queryDTO.getDateOfBirth());
            }
            if (queryDTO.getDateCreated() != null) {
                params.put("firstName", queryDTO.getFirstName());
            }
            if (queryDTO.getDateCreated() != null) {
                params.put("height", queryDTO.getHeight());
            }
            if (queryDTO.getDateCreated() != null) {
                params.put("lastName", queryDTO.getLastName());
            }
            if (queryDTO.getDateCreated() != null) {
                params.put("otherName", queryDTO.getOtherName());
            }
            if (queryDTO.getDateCreated() != null) {
                params.put("weight", queryDTO.getWeight());
            }
        }
        return params;
    }
}
