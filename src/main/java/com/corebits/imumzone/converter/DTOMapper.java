package com.corebits.imumzone.converter;

import com.corebits.imumzone.dto.ChildProfileDTO;
import com.corebits.imumzone.persistence.ChildProfile;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Oche
 */
@ApplicationScoped
public class DTOMapper {

    public ChildProfileDTO mapToChildProfileDTO(ChildProfile profile) {
        ChildProfileDTO dto = new ChildProfileDTO();
        dto.setId(profile.getId());
        dto.setFirstName(profile.getFirstName());
        dto.setLastName(profile.getLastName());
        dto.setOtherName(profile.getOtherName());
        dto.setDateOfBirth(profile.getDateOfBirth());
        dto.setHeight(profile.getHeight());
        dto.setWeight(profile.getWeight());
        dto.setDateCreated(profile.getDateCreated());
        return dto;
    }

}
