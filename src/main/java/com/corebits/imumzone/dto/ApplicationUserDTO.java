package com.corebits.imumzone.dto;

import com.corebits.imumzone.util.CommonUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Tommy
 */
public class ApplicationUserDTO {
    private Integer id;
    private String approvedBy;
    private String createdBy;
    private Date dateApproved;
    private Date dateCreated;
    private Date dateLastLogon;
    private String email;
    private Boolean firstLogin;
    private String sessionId;
    private Boolean status;
    private String userFirstName;
    private String userLastName;
    private String userLoginName;
    private String userType;
    private String userPassword;
    private List<UserRoleDTO> roles = new ArrayList<>();
    private String plainPassword;

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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }   

    public List<UserRoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRoleDTO> roles) {
        this.roles = roles;
    }

    public String getPlainPassword() {
        return plainPassword;
    }

    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword;
    }
    
    public String getFullName(){
        return String.format("%s %s", this.userLastName != null ? this.userLastName : "", this.userFirstName != null ? this.userFirstName : "");
    }
    
    @Override
    public String toString(){
        return CommonUtils.toString(this);
    }
    
}
