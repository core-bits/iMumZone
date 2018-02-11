package com.corebits.imumzone.service;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author Oche
 */
@Stateless
@Local(IIMumZoneManagementFacade.class)
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class IMumZoneManagementFacade implements IIMumZoneManagementFacade{
    
}
