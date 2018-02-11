package com.corebits.imumzone.dto;

import com.corebits.imumzone.util.CommonUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oche
 */
public class MenuDTO {
    private Integer id;
    private String name;
    private String description;
    private String icon;
    private List<SubMenuDTO> sub = new ArrayList<>();
    
    public MenuDTO(){
        
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<SubMenuDTO> getSub() {
        return sub;
    }

    public void setSub(List<SubMenuDTO> sub) {
        this.sub = sub;
    }
    
    @Override
    public String toString() {
        return CommonUtils.toString(this);
    }
    
}
