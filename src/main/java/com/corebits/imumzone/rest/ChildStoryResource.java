/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corebits.imumzone.rest;

import com.corebits.imumzone.dto.ChildProfileQueryDTO;
import com.corebits.imumzone.dto.ChildStoryDTO;
import com.corebits.imumzone.dto.ResponseDTO;
import com.corebits.imumzone.ejb.ChildStoryEngineLocal;
import com.corebits.imumzone.exception.IMumZoneException;
import com.corebits.imumzone.type.ResponseStatusType;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Thomas.Matthew
 */
@Path("protected/story")
public class ChildStoryResource {

    static final Logger LOG = Logger.getLogger(ChildStoryResource.class.getName());

    @Inject
    ChildStoryEngineLocal bean;

    @GET
    @Path("get-child-stories/{childId}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDTO getChildStory(
            @PathParam("childId") String childId
    ) {
        ResponseDTO response;
        try {
            //TODO return proper representation object
            List<Object> childStories = bean.getChildStories(childId);
            response = new ResponseDTO(ResponseStatusType.SUCCESS);
            response.setData(childStories);
        } catch (IMumZoneException ex) {
            LOG.log(Level.SEVERE, null, ex);
            response = new ResponseDTO(ResponseStatusType.ERROR);
        }
        return response;
    }

    @GET
    @Path("create-child-story")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDTO createChildStory(
            ChildStoryDTO childStoryDTO
    ) {
        ResponseDTO response;
        try {
            //TODO return proper representation object
            bean.createChildStories(childStoryDTO);
            response = new ResponseDTO(ResponseStatusType.SUCCESS);
        } catch (IMumZoneException ex) {
            LOG.log(Level.SEVERE, "exception in createChildStory : ", ex);
            response = new ResponseDTO(ResponseStatusType.ERROR);
        }
        return response;
    }

}
