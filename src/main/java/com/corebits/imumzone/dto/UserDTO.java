package com.corebits.imumzone.dto;

import com.corebits.imumzone.type.UserType;
import com.corebits.imumzone.util.CommonUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Oche
 */
public class UserDTO {
    private Integer id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String loginName;
    private String auth_token;
    private List<UserRoleDTO> roles = new ArrayList<>();
    private UserType userType;
    private Integer userUniqueReferenceId;
    private Boolean firstTimeLogin;
    private Date dateCreated;
    private Date dateLastLogin;
    private String sessionId;
    private boolean status;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }  

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    public String getAuthToken() {
        return auth_token;
    }
    
    public void setAuthToken(String auth_token) {
        this.auth_token = auth_token;
    }

    public List<UserRoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRoleDTO> roles) {
        this.roles = roles;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }    

    public Integer getUserUniqueReferenceId() {
        return userUniqueReferenceId;
    }

    public void setUserUniqueReferenceId(Integer userUniqueReferenceId) {
        this.userUniqueReferenceId = userUniqueReferenceId;
    }    

    public Boolean getFirstTimeLogin() {
        return firstTimeLogin;
    }

    public void setFirstTimeLogin(Boolean firstTimeLogin) {
        this.firstTimeLogin = firstTimeLogin;
    }
    
    public String getFullName(){
        return String.format("%s %s", this.lastName != null ? this.lastName : "", this.firstName != null ? this.firstName : "");
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateLastLogin() {
        return dateLastLogin;
    }

    public void setDateLastLogin(Date dateLastLogin) {
        this.dateLastLogin = dateLastLogin;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return CommonUtils.toString(this);
    }
}
