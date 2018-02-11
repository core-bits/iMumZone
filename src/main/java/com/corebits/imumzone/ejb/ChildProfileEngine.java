package com.corebits.imumzone.ejb;

import com.corebits.imumzone.dto.ChildProfileDTO;
import com.corebits.imumzone.exception.IMumZoneException;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Oche
 */
@Stateless
public class ChildProfileEngine implements ChildProfileEngineLocal{
    @Inject
    AbstractEngine bean;

    @Override
    public void createChildProfile(ChildProfileDTO profile) throws IMumZoneException {
        bean.create(profile);
    }

    @Override
    public void updateChildProfile(ChildProfileDTO profile) throws IMumZoneException {
        bean.update(profile);
    }

    
    
}
