package com.corebits.imumzone.converter;

import com.corebits.imumzone.dto.ChildProfileDTO;
import com.corebits.imumzone.dto.ChildStoryDTO;
import com.corebits.imumzone.persistence.ChildProfile;
import com.corebits.imumzone.persistence.ChildStory;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Oche
 */
@ApplicationScoped
public class EntityMapper {

    public ChildProfile mapToChildProfile(ChildProfileDTO dto) {
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

    public ChildStory mapToChildStory(ChildStoryDTO dto) {
        ChildStory story = new ChildStory();
        story.setId(dto.getId());
        story.setAgeGroup(dto.getAgeGroup());
        story.setChildProfileId(dto.getChildProfileId());
        story.setDateStoryCreated(dto.getDateStoryCreated());
        story.setHeight(dto.getHeight());
        story.setLinkedStoryId(dto.getLinkedStoryId());
        story.setRecentPicture(dto.getRecentPicture().getBytes());
        story.setStoryDescription(dto.getStoryDescription());
        story.setStoryId(dto.getStoryId());
        story.setStoryPeriod(dto.getStoryPeriod());
        story.setWeight(dto.getWeight());
        story.setWeightStatus(dto.getWeightStatus());
        return story;
    }
}
