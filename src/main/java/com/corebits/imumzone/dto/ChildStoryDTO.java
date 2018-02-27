package com.corebits.imumzone.dto;

import com.corebits.imumzone.persistence.*;
import java.util.Date;

public class ChildStoryDTO {

    private Integer id;
    private String storyId;
    private String storyPeriod;
    private Double height;
    private Double weight;
    private String recentPicture;
    private Date dateStoryCreated;
    private String storyDescription;
    private String linkedStoryId;
    private String heightStatus;
    private String ageGroup;
    private String weightStatus;
    private ChildProfile childProfileId;

    public ChildStoryDTO() {
    }

    public ChildStoryDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoryId() {
        return storyId;
    }

    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }

    public String getStoryPeriod() {
        return storyPeriod;
    }

    public void setStoryPeriod(String storyPeriod) {
        this.storyPeriod = storyPeriod;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRecentPicture() {
        return recentPicture;
    }

    public void setRecentPicture(String recentPicture) {
        this.recentPicture = recentPicture;
    }

    public Date getDateStoryCreated() {
        return dateStoryCreated;
    }

    public void setDateStoryCreated(Date dateStoryCreated) {
        this.dateStoryCreated = dateStoryCreated;
    }

    public String getStoryDescription() {
        return storyDescription;
    }

    public void setStoryDescription(String storyDescription) {
        this.storyDescription = storyDescription;
    }

    public String getLinkedStoryId() {
        return linkedStoryId;
    }

    public void setLinkedStoryId(String linkedStoryId) {
        this.linkedStoryId = linkedStoryId;
    }

    public String getHeightStatus() {
        return heightStatus;
    }

    public void setHeightStatus(String heightStatus) {
        this.heightStatus = heightStatus;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getWeightStatus() {
        return weightStatus;
    }

    public void setWeightStatus(String weightStatus) {
        this.weightStatus = weightStatus;
    }

    public ChildProfile getChildProfileId() {
        return childProfileId;
    }

    public void setChildProfileId(ChildProfile childProfileId) {
        this.childProfileId = childProfileId;
    }

    @Override
    public String toString() {
        return "com.corebits.imumzone.persistence.ChildStory[ id=" + id + " ]";
    }
    
}
