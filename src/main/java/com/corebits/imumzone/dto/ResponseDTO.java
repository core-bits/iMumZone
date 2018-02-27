package com.corebits.imumzone.dto;

import com.corebits.imumzone.type.ResponseStatusType;
import com.corebits.imumzone.util.CommonUtils;


/**
 *
 * @author Tommy
 */
public class ResponseDTO {
    private String code;
    private String description;
    private Object data;
    
    public ResponseDTO(){}
    
    public ResponseDTO(String code, String description){
        this.code = code;
        this.description = description;
    }
    
    public ResponseDTO(ResponseStatusType responseType){
        this.code = responseType.getCode();
        this.description = responseType.getDescription();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return CommonUtils.toString(this);
    }    
}
