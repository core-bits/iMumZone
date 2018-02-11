/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corebits.imumzone.persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Oche
 */
@Entity
@Table(name = "child_story")
@NamedQueries({
    @NamedQuery(name = "ChildStory.findAll", query = "SELECT c FROM ChildStory c")
    , @NamedQuery(name = "ChildStory.findById", query = "SELECT c FROM ChildStory c WHERE c.id = :id")
    , @NamedQuery(name = "ChildStory.findByStoryId", query = "SELECT c FROM ChildStory c WHERE c.storyId = :storyId")
    , @NamedQuery(name = "ChildStory.findByStoryPeriod", query = "SELECT c FROM ChildStory c WHERE c.storyPeriod = :storyPeriod")
    , @NamedQuery(name = "ChildStory.findByHeight", query = "SELECT c FROM ChildStory c WHERE c.height = :height")
    , @NamedQuery(name = "ChildStory.findByWeight", query = "SELECT c FROM ChildStory c WHERE c.weight = :weight")
    , @NamedQuery(name = "ChildStory.findByDateStoryCreated", query = "SELECT c FROM ChildStory c WHERE c.dateStoryCreated = :dateStoryCreated")
    , @NamedQuery(name = "ChildStory.findByStoryDescription", query = "SELECT c FROM ChildStory c WHERE c.storyDescription = :storyDescription")
    , @NamedQuery(name = "ChildStory.findByLinkedStoryId", query = "SELECT c FROM ChildStory c WHERE c.linkedStoryId = :linkedStoryId")
    , @NamedQuery(name = "ChildStory.findByHeightStatus", query = "SELECT c FROM ChildStory c WHERE c.heightStatus = :heightStatus")
    , @NamedQuery(name = "ChildStory.findByAgeGroup", query = "SELECT c FROM ChildStory c WHERE c.ageGroup = :ageGroup")
    , @NamedQuery(name = "ChildStory.findByWeightStatus", query = "SELECT c FROM ChildStory c WHERE c.weightStatus = :weightStatus")})
public class ChildStory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "STORY_ID")
    private String storyId;
    @Size(max = 25)
    @Column(name = "STORY_PERIOD")
    private String storyPeriod;
    @Size(max = 15)
    @Column(name = "HEIGHT")
    private String height;
    @Size(max = 45)
    @Column(name = "WEIGHT")
    private String weight;
    @Lob
    @Column(name = "RECENT_PICTURE")
    private byte[] recentPicture;
    @Size(max = 45)
    @Column(name = "DATE_STORY_CREATED")
    private String dateStoryCreated;
    @Size(max = 250)
    @Column(name = "STORY_DESCRIPTION")
    private String storyDescription;
    @Size(max = 45)
    @Column(name = "LINKED_STORY_ID")
    private String linkedStoryId;
    @Size(max = 15)
    @Column(name = "HEIGHT_STATUS")
    private String heightStatus;
    @Size(max = 15)
    @Column(name = "AGE_GROUP")
    private String ageGroup;
    @Size(max = 15)
    @Column(name = "WEIGHT_STATUS")
    private String weightStatus;
    @JoinColumn(name = "CHILD_PROFILE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ChildProfile childProfileId;

    public ChildStory() {
    }

    public ChildStory(Integer id) {
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public byte[] getRecentPicture() {
        return recentPicture;
    }

    public void setRecentPicture(byte[] recentPicture) {
        this.recentPicture = recentPicture;
    }

    public String getDateStoryCreated() {
        return dateStoryCreated;
    }

    public void setDateStoryCreated(String dateStoryCreated) {
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
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChildStory)) {
            return false;
        }
        ChildStory other = (ChildStory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corebits.imumzone.entity.ChildStory[ id=" + id + " ]";
    }
    
}
