package com.corebits.imumzone.ejb;

import com.corebits.imumzone.dto.ChildProfileDTO;
import com.corebits.imumzone.exception.IMumZoneException;
import com.corebits.imumzone.persistence.ChildProfile;
import javax.ejb.Local;

/**
 *
 * @author Oche
 */
@Local
public interface ChildProfileEngineLocal{
    
    public void createChildProfile(ChildProfileDTO profile) throws IMumZoneException;
    public void updateChildProfile(ChildProfileDTO profile) throws IMumZoneException;
    public ChildProfileDTO getChildProfile(Integer profileId) throws IMumZoneException;
    public ChildProfile getChildProfileEnt(Integer profileId) throws IMumZoneException;
}
