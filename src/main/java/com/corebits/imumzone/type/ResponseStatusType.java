package com.corebits.imumzone.type;

/**
 *
 * @author Oche
 */

public enum ResponseStatusType {
    SUCCESS("00", "Completed Successfully"), 
    NOT_FOUND("01", ""), 
    NOT_ASSOCIATED("02", ""), 
    ALREADY_EXIST("03", "Already exist"), 
    ALREADY_ASSOCIATED("04", ""),     
    ALREADY_REGISTERED_POLICY("05", "Account with policy number already registered"),     
    ERROR("100", ""),     
    PERSISTANCE_ERROR("100", "Internal Server Error"),
    PENDING("101", ""),
    FAILED("102", ""),
    AUTHENTICATION_ERROR("401", ""),
    INVALID_SELECTION("05", ""),
    INVALID_OLD_PASSWORD_SPECIFIED("06", "Invalid Old Password Specified"),
    INVALID_USERNAME_OR_PASSWORD_SPECIFIED("06", "Invalid Username or Password Specified");
    
    private final String code;
    private final String description;

    private ResponseStatusType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }   

    public String getDescription() {
        return description;
    }
}

