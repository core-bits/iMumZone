package com.corebits.imumzone.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "zone_user")
@NamedQueries({
    @NamedQuery(name = "ZoneUser.findAll", query = "SELECT z FROM ZoneUser z")
    , @NamedQuery(name = "ZoneUser.findById", query = "SELECT z FROM ZoneUser z WHERE z.id = :id")
    , @NamedQuery(name = "ZoneUser.findByFirstName", query = "SELECT z FROM ZoneUser z WHERE z.firstName = :firstName")
    , @NamedQuery(name = "ZoneUser.findByLastName", query = "SELECT z FROM ZoneUser z WHERE z.lastName = :lastName")
    , @NamedQuery(name = "ZoneUser.findByOtherName", query = "SELECT z FROM ZoneUser z WHERE z.otherName = :otherName")
    , @NamedQuery(name = "ZoneUser.findByDateRegistered", query = "SELECT z FROM ZoneUser z WHERE z.dateRegistered = :dateRegistered")
    , @NamedQuery(name = "ZoneUser.findByGender", query = "SELECT z FROM ZoneUser z WHERE z.gender = :gender")
    , @NamedQuery(name = "ZoneUser.findByDateOfBirth", query = "SELECT z FROM ZoneUser z WHERE z.dateOfBirth = :dateOfBirth")
    , @NamedQuery(name = "ZoneUser.findByCountryOfResidence", query = "SELECT z FROM ZoneUser z WHERE z.countryOfResidence = :countryOfResidence")
    , @NamedQuery(name = "ZoneUser.findByStateOfResidence", query = "SELECT z FROM ZoneUser z WHERE z.stateOfResidence = :stateOfResidence")
    , @NamedQuery(name = "ZoneUser.findByLoginId", query = "SELECT z FROM ZoneUser z WHERE z.loginId = :loginId")
    , @NamedQuery(name = "ZoneUser.findByLoginPassword", query = "SELECT z FROM ZoneUser z WHERE z.loginPassword = :loginPassword")
    , @NamedQuery(name = "ZoneUser.findByLastLoginDate", query = "SELECT z FROM ZoneUser z WHERE z.lastLoginDate = :lastLoginDate")
    , @NamedQuery(name = "ZoneUser.findByCountryOfOrigin", query = "SELECT z FROM ZoneUser z WHERE z.countryOfOrigin = :countryOfOrigin")
    , @NamedQuery(name = "ZoneUser.findByStateOfOrigin", query = "SELECT z FROM ZoneUser z WHERE z.stateOfOrigin = :stateOfOrigin")
    , @NamedQuery(name = "ZoneUser.findByTribe", query = "SELECT z FROM ZoneUser z WHERE z.tribe = :tribe")})
public class ZoneUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "DATE_REGISTERED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistered;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "GENDER")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "COUNTRY_OF_RESIDENCE")
    private String countryOfResidence;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "STATE_OF_RESIDENCE")
    private String stateOfResidence;
    @Size(max = 45)
    @Column(name = "LOGIN_ID")
    private String loginId;
    @Size(max = 45)
    @Column(name = "LOGIN_PASSWORD")
    private String loginPassword;
    @Column(name = "LAST_LOGIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "COUNTRY_OF_ORIGIN")
    private String countryOfOrigin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "STATE_OF_ORIGIN")
    private String stateOfOrigin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TRIBE")
    private String tribe;
    @OneToMany(mappedBy = "userId")
    private Set<ChildProfile> childProfileSet;

    public ZoneUser() {
    }

    public ZoneUser(Integer id) {
        this.id = id;
    }

    public ZoneUser(Integer id, String firstName, String lastName, Date dateRegistered, String gender, Date dateOfBirth, String countryOfResidence, String stateOfResidence, String countryOfOrigin, String stateOfOrigin, String tribe) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateRegistered = dateRegistered;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.countryOfResidence = countryOfResidence;
        this.stateOfResidence = stateOfResidence;
        this.countryOfOrigin = countryOfOrigin;
        this.stateOfOrigin = stateOfOrigin;
        this.tribe = tribe;
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

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getStateOfResidence() {
        return stateOfResidence;
    }

    public void setStateOfResidence(String stateOfResidence) {
        this.stateOfResidence = stateOfResidence;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public Set<ChildProfile> getChildProfileSet() {
        return childProfileSet;
    }

    public void setChildProfileSet(Set<ChildProfile> childProfileSet) {
        this.childProfileSet = childProfileSet;
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
        if (!(object instanceof ZoneUser)) {
            return false;
        }
        ZoneUser other = (ZoneUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corebits.imumzone.persistence.ZoneUser[ id=" + id + " ]";
    }
    
}
