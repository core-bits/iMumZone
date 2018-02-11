package com.corebits.imumzone.ejb;

import com.corebits.imumzone.converter.DTOMapper;
import com.corebits.imumzone.converter.EntityMapper;
import com.corebits.imumzone.dto.ChildProfileDTO;
import com.corebits.imumzone.exception.IMumZoneException;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

/**
 *
 * @author Oche
 */
@Stateless
@Local(ChildProfileEngineLocal.class)
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class ChildProfileEngine implements ChildProfileEngineLocal{
    @EJB
    AbstractEngine bean;
    
    @Inject
    DTOMapper dtoMapper;
    
    @Inject
    EntityMapper entityMapper;

    @Override
    public void createChildProfile(ChildProfileDTO profile) throws IMumZoneException {
        bean.create(profile);
    }

    @Override
    public void updateChildProfile(ChildProfileDTO profile) throws IMumZoneException {
        bean.update(profile);
    }

    
    
}
