package com.corebits.imumzone.dto;

import com.corebits.imumzone.util.CommonUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oche
 */
public class UserRoleDTO {
    private Integer id;
    private String name;
    private String description;
    private List<MenuDTO> menu = new ArrayList<>();
    
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

    public List<MenuDTO> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuDTO> menu) {
        this.menu = menu;
    }
    
    @Override
    public String toString() {
        return CommonUtils.toString(this);
    }
}
