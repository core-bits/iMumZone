package com.corebits.imumzone.persistence;

import com.corebits.imumzone.util.CommonUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Oche
 */
@Entity
@Table(name = "child_profile")
@NamedQueries({
    @NamedQuery(name = "ChildProfile.findAll", query = "SELECT c FROM ChildProfile c")
    , @NamedQuery(name = "ChildProfile.findById", query = "SELECT c FROM ChildProfile c WHERE c.id = :id")
    , @NamedQuery(name = "ChildProfile.findByFirstName", query = "SELECT c FROM ChildProfile c WHERE c.firstName = :firstName")
    , @NamedQuery(name = "ChildProfile.findByLastName", query = "SELECT c FROM ChildProfile c WHERE c.lastName = :lastName")
    , @NamedQuery(name = "ChildProfile.findByOtherName", query = "SELECT c FROM ChildProfile c WHERE c.otherName = :otherName")
    , @NamedQuery(name = "ChildProfile.findByDateOfBirth", query = "SELECT c FROM ChildProfile c WHERE c.dateOfBirth = :dateOfBirth")
    , @NamedQuery(name = "ChildProfile.findByHeight", query = "SELECT c FROM ChildProfile c WHERE c.height = :height")
    , @NamedQuery(name = "ChildProfile.findByWeight", query = "SELECT c FROM ChildProfile c WHERE c.weight = :weight")
    , @NamedQuery(name = "ChildProfile.findByDateCreated", query = "SELECT c FROM ChildProfile c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "ChildProfile.findByImage", query = "SELECT c FROM ChildProfile c WHERE c.image = :image")})
public class ChildProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Size(max = 45)
    @Column(name = "OTHER_NAME")
    private String otherName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HEIGHT")
    private double height;
    @Basic(optional = false)
    @NotNull
    @Column(name = "WEIGHT")
    private double weight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Size(max = 45)
    @Column(name = "IMAGE")
    private String image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "childProfileId")
    private Set<ChildStory> childStoryList;
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    @ManyToOne
    private ZoneUser userId;

    public ChildProfile() {
    }

    public ChildProfile(Integer id) {
        this.id = id;
    }

    public ChildProfile(Integer id, String firstName, String lastName, Date dateOfBirth, double height, double weight, Date dateCreated) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.dateCreated = dateCreated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {        
        this.dateCreated = dateCreated;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<ChildStory> getChildStoryList() {
        return childStoryList;
    }

    public void setChildStoryList(Set<ChildStory> childStoryList) {
        this.childStoryList = childStoryList;
    }

    public ZoneUser getUserId() {
        return userId;
    }

    public void setUserId(ZoneUser userId) {
        this.userId = userId;
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
        if (!(object instanceof ChildProfile)) {
            return false;
        }
        ChildProfile other = (ChildProfile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return CommonUtils.toString(this);
    }
    
}
