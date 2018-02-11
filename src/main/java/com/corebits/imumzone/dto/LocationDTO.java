package com.corebits.imumzone.dto;

import com.corebits.imumzone.util.CommonUtils;

/**
 *
 * @author Thomas.Matthew
 */
public class LocationDTO {

    private Integer id;
    private String name;
    private StateDTO state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StateDTO getState() {
        return state;
    }

    public void setState(StateDTO state) {
        this.state = state;
    }    

    @Override
    public String toString(){
        return CommonUtils.toString(this);
    }
}
