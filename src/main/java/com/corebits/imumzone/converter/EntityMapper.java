package com.corebits.imumzone.converter;

import com.corebits.imumzone.dto.ChildProfileDTO;
import com.corebits.imumzone.persistence.ChildProfile;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Oche
 */
@ApplicationScoped
public class EntityMapper {

    public ChildProfile mapToChildProfileDTO(ChildProfileDTO dto) {
        ChildProfile profile = new ChildProfile();
        profile.setId(dto.getId());
        profile.setFirstName(dto.getFirstName());
        profile.setLastName(dto.getLastName());
        profile.setOtherName(dto.getOtherName());
        profile.setDateOfBirth(dto.getDateOfBirth());
        profile.setHeight(dto.getHeight());
        profile.setWeight(dto.getWeight());
        profile.setDateCreated(dto.getDateCreated());
        return profile;
    }
}
