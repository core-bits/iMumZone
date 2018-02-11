/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corebits.imumzone.ejb;

import com.corebits.imumzone.dto.ChildProfileDTO;
import com.corebits.imumzone.exception.IMumZoneException;
import javax.ejb.Local;

/**
 *
 * @author Oche
 */
@Local
public interface ChildProfileEngineLocal{
    
    public void createChildProfile(ChildProfileDTO profile) throws IMumZoneException;
    public void updateChildProfile(ChildProfileDTO profile) throws IMumZoneException;
    
}
