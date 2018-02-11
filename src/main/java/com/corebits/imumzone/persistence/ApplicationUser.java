/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Oche
 */
@Entity
@Table(name = "application_user")
@NamedQueries({
    @NamedQuery(name = "ApplicationUser.findAll", query = "SELECT a FROM ApplicationUser a")
    , @NamedQuery(name = "ApplicationUser.findById", query = "SELECT a FROM ApplicationUser a WHERE a.id = :id")
    , @NamedQuery(name = "ApplicationUser.findByApprovedBy", query = "SELECT a FROM ApplicationUser a WHERE a.approvedBy = :approvedBy")
    , @NamedQuery(name = "ApplicationUser.findByCreatedBy", query = "SELECT a FROM ApplicationUser a WHERE a.createdBy = :createdBy")
    , @NamedQuery(name = "ApplicationUser.findByDateApproved", query = "SELECT a FROM ApplicationUser a WHERE a.dateApproved = :dateApproved")
    , @NamedQuery(name = "ApplicationUser.findByDateCreated", query = "SELECT a FROM ApplicationUser a WHERE a.dateCreated = :dateCreated")
    , @NamedQuery(name = "ApplicationUser.findByDateLastLogon", query = "SELECT a FROM ApplicationUser a WHERE a.dateLastLogon = :dateLastLogon")
    , @NamedQuery(name = "ApplicationUser.findByEmail", query = "SELECT a FROM ApplicationUser a WHERE a.email = :email")
    , @NamedQuery(name = "ApplicationUser.findByFirstLogin", query = "SELECT a FROM ApplicationUser a WHERE a.firstLogin = :firstLogin")
    , @NamedQuery(name = "ApplicationUser.findBySessionId", query = "SELECT a FROM ApplicationUser a WHERE a.sessionId = :sessionId")
    , @NamedQuery(name = "ApplicationUser.findByStatus", query = "SELECT a FROM ApplicationUser a WHERE a.status = :status")
    , @NamedQuery(name = "ApplicationUser.findByUserFirstName", query = "SELECT a FROM ApplicationUser a WHERE a.userFirstName = :userFirstName")
    , @NamedQuery(name = "ApplicationUser.findByUserLastName", query = "SELECT a FROM ApplicationUser a WHERE a.userLastName = :userLastName")
    , @NamedQuery(name = "ApplicationUser.findByUserLoginName", query = "SELECT a FROM ApplicationUser a WHERE a.userLoginName = :userLoginName")
    , @NamedQuery(name = "ApplicationUser.findByUserPassword", query = "SELECT a FROM ApplicationUser a WHERE a.userPassword = :userPassword")
    , @NamedQuery(name = "ApplicationUser.findByUserType", query = "SELECT a FROM ApplicationUser a WHERE a.userType = :userType")
    , @NamedQuery(name = "ApplicationUser.findByUserUniqueReferenceId", query = "SELECT a FROM ApplicationUser a WHERE a.userUniqueReferenceId = :userUniqueReferenceId")})
public class ApplicationUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "APPROVED_BY")
    private String approvedBy;
    @Size(max = 255)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "DATE_APPROVED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApproved;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "DATE_LAST_LOGON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastLogon;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "FIRST_LOGIN")
    private Boolean firstLogin;
    @Size(max = 255)
    @Column(name = "SESSION_ID")
    private String sessionId;
    @Column(name = "STATUS")
    private Boolean status;
    @Size(max = 255)
    @Column(name = "USER_FIRST_NAME")
    private String userFirstName;
    @Size(max = 255)
    @Column(name = "USER_LAST_NAME")
    private String userLastName;
    @Size(max = 255)
    @Column(name = "USER_LOGIN_NAME")
    private String userLoginName;
    @Size(max = 255)
    @Column(name = "USER_PASSWORD")
    private String userPassword;
    @Size(max = 255)
    @Column(name = "USER_TYPE")
    private String userType;
    @Column(name = "USER_UNIQUE_REFERENCE_ID")
    private Integer userUniqueReferenceId;
    @JoinTable(name = "user_role", joinColumns = {
        @JoinColumn(name = "USER_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")})
    @ManyToMany
    private Set<Roles> rolesSet;

    public ApplicationUser() {
    }

    public ApplicationUser(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(Date dateApproved) {
        this.dateApproved = dateApproved;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateLastLogon() {
        return dateLastLogon;
    }

    public void setDateLastLogon(Date dateLastLogon) {
        this.dateLastLogon = dateLastLogon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getUserUniqueReferenceId() {
        return userUniqueReferenceId;
    }

    public void setUserUniqueReferenceId(Integer userUniqueReferenceId) {
        this.userUniqueReferenceId = userUniqueReferenceId;
    }

    public Set<Roles> getRolesSet() {
        return rolesSet;
    }

    public void setRolesSet(Set<Roles> rolesSet) {
        this.rolesSet = rolesSet;
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
        if (!(object instanceof ApplicationUser)) {
            return false;
        }
        ApplicationUser other = (ApplicationUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corebits.imumzone.entity.ApplicationUser[ id=" + id + " ]";
    }
    
}
