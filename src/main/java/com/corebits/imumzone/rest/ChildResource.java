package com.corebits.imumzone.rest;

import com.corebits.imumzone.dto.ResponseDTO;
import com.corebits.imumzone.exception.IMumZoneException;
import com.corebits.imumzone.service.IIMumZoneManagementFacade;
import com.corebits.imumzone.type.ResponseStatusType;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Oche
 */
@Path("protected/child")
public class ChildResource {
    @EJB
    IIMumZoneManagementFacade iMumZoneManagementFacade;
    
    @GET 
    @Path("status")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDTO getOutstandingBalanceByHospital(@PathParam("id") Integer id) throws IMumZoneException{
        return new ResponseDTO(ResponseStatusType.SUCCESS);
    }
    
}
