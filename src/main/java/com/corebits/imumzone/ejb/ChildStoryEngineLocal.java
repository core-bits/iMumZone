/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corebits.imumzone.ejb;

import com.corebits.imumzone.dto.ChildStoryDTO;
import com.corebits.imumzone.exception.IMumZoneException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thomas.Matthew
 */
@Local
public interface ChildStoryEngineLocal {
    
    public List<Object> getChildStories(String storyId) throws IMumZoneException;
    
    public void createChildStories(ChildStoryDTO storyDTO) throws IMumZoneException;
    
}
