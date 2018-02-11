package com.corebits.imumzone.dto;

import com.corebits.imumzone.util.CommonUtils;

/**
 *
 * @author Oche
 */
public class SubMenuDTO {
    private Integer id;
    private String name;
    private String description;
    private String pageLink;
    private String icon;
    
    public SubMenuDTO(){
        
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

    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    @Override
    public String toString() {
        return CommonUtils.toString(this);
    }
}
