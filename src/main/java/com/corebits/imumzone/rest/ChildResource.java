package com.corebits.imumzone.rest;

import com.corebits.imumzone.dto.ChildProfileDTO;
import com.corebits.imumzone.dto.ResponseDTO;
import com.corebits.imumzone.ejb.ChildProfileEngineLocal;
import com.corebits.imumzone.exception.IMumZoneException;
import com.corebits.imumzone.type.ResponseStatusType;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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

    static final Logger LOG = Logger.getLogger(ChildResource.class.getName());

    @Inject
    ChildProfileEngineLocal cpel;

    @GET
    @Path("getChildProfile/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDTO getChildProfile(
            @PathParam("id") Integer id) {
        ResponseDTO responseDTO;
        try {
            ChildProfileDTO childProfile = cpel.getChildProfile(id);
            responseDTO = new ResponseDTO(ResponseStatusType.SUCCESS);
            responseDTO.setData(childProfile);
        } catch (IMumZoneException ex) {
            LOG.log(Level.SEVERE, "IMumZoneException caught in getChildProfile ", ex);
            responseDTO = new ResponseDTO(ResponseStatusType.ERROR);
        }
        return responseDTO;
    }
    
    @GET
    @Path("getChildren")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDTO getChildren(
            @PathParam("id") Integer id) {
        ResponseDTO responseDTO;
        try {
            ChildProfileDTO childProfile = cpel.getChildProfile(id);
            responseDTO = new ResponseDTO(ResponseStatusType.SUCCESS);
            responseDTO.setData(childProfile);
        } catch (IMumZoneException ex) {
            LOG.log(Level.SEVERE, "IMumZoneException caught in getChildProfile ", ex);
            responseDTO = new ResponseDTO(ResponseStatusType.ERROR);
        }
        return responseDTO;
    }

    @POST
    @Path("new-child-profile")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDTO createChildProfile(
            ChildProfileDTO childProfileDTO
    ) {
        ResponseDTO responseDTO;
        try {
            cpel.createChildProfile(childProfileDTO);
            responseDTO = new ResponseDTO(ResponseStatusType.SUCCESS);
        } catch (IMumZoneException ex) {
            LOG.log(Level.SEVERE, "IMumZoneException caught in createChildProfile ", ex);
            responseDTO = new ResponseDTO(ResponseStatusType.ERROR);
        }
        return responseDTO;
    }

    @POST
    @Path("update-child-profile")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDTO updateChildProfile(
            ChildProfileDTO childProfileDTO
    ) {
        ResponseDTO responseDTO;
        try {
            cpel.updateChildProfile(childProfileDTO);
            responseDTO = new ResponseDTO(ResponseStatusType.SUCCESS);
        } catch (IMumZoneException ex) {
            LOG.log(Level.SEVERE, "IMumZoneException caught in updateChildProfile ", ex);
            responseDTO = new ResponseDTO(ResponseStatusType.ERROR);
        }
        return responseDTO;
    }

}
