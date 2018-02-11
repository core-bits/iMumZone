package com.corebits.imumzone.persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "region_profile")
@NamedQueries({
    @NamedQuery(name = "RegionProfile.findAll", query = "SELECT r FROM RegionProfile r")
    , @NamedQuery(name = "RegionProfile.findById", query = "SELECT r FROM RegionProfile r WHERE r.id = :id")
    , @NamedQuery(name = "RegionProfile.findByContinent", query = "SELECT r FROM RegionProfile r WHERE r.continent = :continent")
    , @NamedQuery(name = "RegionProfile.findByCountry", query = "SELECT r FROM RegionProfile r WHERE r.country = :country")
    , @NamedQuery(name = "RegionProfile.findByState", query = "SELECT r FROM RegionProfile r WHERE r.state = :state")
    , @NamedQuery(name = "RegionProfile.findByAgeGroup", query = "SELECT r FROM RegionProfile r WHERE r.ageGroup = :ageGroup")
    , @NamedQuery(name = "RegionProfile.findByHeight", query = "SELECT r FROM RegionProfile r WHERE r.height = :height")
    , @NamedQuery(name = "RegionProfile.findByWeight", query = "SELECT r FROM RegionProfile r WHERE r.weight = :weight")
    , @NamedQuery(name = "RegionProfile.findByTribe", query = "SELECT r FROM RegionProfile r WHERE r.tribe = :tribe")
    , @NamedQuery(name = "RegionProfile.findByHeightStatus", query = "SELECT r FROM RegionProfile r WHERE r.heightStatus = :heightStatus")
    , @NamedQuery(name = "RegionProfile.findByWeightStatus", query = "SELECT r FROM RegionProfile r WHERE r.weightStatus = :weightStatus")})
public class RegionProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CONTINENT")
    private String continent;
    @Size(max = 40)
    @Column(name = "COUNTRY")
    private String country;
    @Size(max = 40)
    @Column(name = "STATE")
    private String state;
    @Size(max = 25)
    @Column(name = "AGE_GROUP")
    private String ageGroup;
    @Size(max = 15)
    @Column(name = "HEIGHT")
    private String height;
    @Size(max = 45)
    @Column(name = "WEIGHT")
    private String weight;
    @Size(max = 45)
    @Column(name = "TRIBE")
    private String tribe;
    @Size(max = 15)
    @Column(name = "HEIGHT_STATUS")
    private String heightStatus;
    @Size(max = 15)
    @Column(name = "WEIGHT_STATUS")
    private String weightStatus;

    public RegionProfile() {
    }

    public RegionProfile(Integer id) {
        this.id = id;
    }

    public RegionProfile(Integer id, String continent) {
        this.id = id;
        this.continent = continent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
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

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public String getHeightStatus() {
        return heightStatus;
    }

    public void setHeightStatus(String heightStatus) {
        this.heightStatus = heightStatus;
    }

    public String getWeightStatus() {
        return weightStatus;
    }

    public void setWeightStatus(String weightStatus) {
        this.weightStatus = weightStatus;
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
        if (!(object instanceof RegionProfile)) {
            return false;
        }
        RegionProfile other = (RegionProfile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corebits.imumzone.entity.RegionProfile[ id=" + id + " ]";
    }
    
}
