package com.corebits.imumzone.ejb;

import com.corebits.imumzone.converter.DTOMapper;
import com.corebits.imumzone.converter.EntityMapper;
import com.corebits.imumzone.dto.ChildProfileDTO;
import com.corebits.imumzone.exception.IMumZoneException;
import com.corebits.imumzone.persistence.ChildProfile;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Oche
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class ChildProfileEngine implements ChildProfileEngineLocal {

    private static final Logger logger = LoggerFactory.getLogger(ChildProfileEngine.class);

    @Inject
    AbstractEngine bean;

    @Inject
    DTOMapper dtoMapper;

    @Inject
    EntityMapper entityMapper;

    @Override
    public void createChildProfile(ChildProfileDTO profile) throws IMumZoneException {
        ChildProfile entity = entityMapper.mapToChildProfile(profile);
        System.out.println("Id = " + entity.getId());
        logger.info("dto -> {}", profile);
        entity.setDateCreated(new Date());
        logger.info("entity -> {}", entity);
        bean.create(entity);
    }

    @Override
    public void updateChildProfile(ChildProfileDTO profile) throws IMumZoneException {
        ChildProfile entity = entityMapper.mapToChildProfile(profile);
        bean.update(entity);
    }

    @Override
    public ChildProfileDTO getChildProfile(Integer profileId) throws IMumZoneException {
        ChildProfile aChild = bean.find(ChildProfile.class, profileId);
        ChildProfileDTO dto = new ChildProfileDTO();
        if (aChild != null) {
            dto.setDateCreated(aChild.getDateCreated());
            dto.setDateOfBirth(aChild.getDateOfBirth());
            dto.setFirstName(aChild.getFirstName());
            dto.setHeight(aChild.getHeight());
            dto.setId(aChild.getId());
            dto.setImage(aChild.getImage());
            dto.setLastName(aChild.getLastName());
            dto.setOtherName(aChild.getOtherName());
            dto.setWeight(aChild.getWeight());
        }
        return dto;
    }
    
    @Override
    public ChildProfile getChildProfileEnt(Integer profileId) throws IMumZoneException {
        ChildProfile aChild = bean.find(ChildProfile.class, profileId);        
        return aChild;
    }

}
