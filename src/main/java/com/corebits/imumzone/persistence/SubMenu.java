/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corebits.imumzone.persistence;

import java.io.Serializable;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Oche
 */
@Entity
@Table(name = "sub_menu")
@NamedQueries({
    @NamedQuery(name = "SubMenu.findAll", query = "SELECT s FROM SubMenu s")
    , @NamedQuery(name = "SubMenu.findById", query = "SELECT s FROM SubMenu s WHERE s.id = :id")
    , @NamedQuery(name = "SubMenu.findByIconImageName", query = "SELECT s FROM SubMenu s WHERE s.iconImageName = :iconImageName")
    , @NamedQuery(name = "SubMenu.findByPageLink", query = "SELECT s FROM SubMenu s WHERE s.pageLink = :pageLink")
    , @NamedQuery(name = "SubMenu.findBySubMenuDescription", query = "SELECT s FROM SubMenu s WHERE s.subMenuDescription = :subMenuDescription")
    , @NamedQuery(name = "SubMenu.findBySubMenuName", query = "SELECT s FROM SubMenu s WHERE s.subMenuName = :subMenuName")})
public class SubMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "ICON_IMAGE_NAME")
    private String iconImageName;
    @Size(max = 255)
    @Column(name = "PAGE_LINK")
    private String pageLink;
    @Size(max = 255)
    @Column(name = "SUB_MENU_DESCRIPTION")
    private String subMenuDescription;
    @Size(max = 255)
    @Column(name = "SUB_MENU_NAME")
    private String subMenuName;
    @JoinTable(name = "sub_menu_role", joinColumns = {
        @JoinColumn(name = "SUB_MENU_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")})
    @ManyToMany
    private Set<Roles> rolesSet;
    @ManyToMany(mappedBy = "subMenuSet")
    private Set<Functions> functionsSet;
    @JoinColumn(name = "MENU_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Menu menuId;

    public SubMenu() {
    }

    public SubMenu(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIconImageName() {
        return iconImageName;
    }

    public void setIconImageName(String iconImageName) {
        this.iconImageName = iconImageName;
    }

    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    public String getSubMenuDescription() {
        return subMenuDescription;
    }

    public void setSubMenuDescription(String subMenuDescription) {
        this.subMenuDescription = subMenuDescription;
    }

    public String getSubMenuName() {
        return subMenuName;
    }

    public void setSubMenuName(String subMenuName) {
        this.subMenuName = subMenuName;
    }

    public Set<Roles> getRolesSet() {
        return rolesSet;
    }

    public void setRolesSet(Set<Roles> rolesSet) {
        this.rolesSet = rolesSet;
    }

    public Set<Functions> getFunctionsSet() {
        return functionsSet;
    }

    public void setFunctionsSet(Set<Functions> functionsSet) {
        this.functionsSet = functionsSet;
    }

    public Menu getMenuId() {
        return menuId;
    }

    public void setMenuId(Menu menuId) {
        this.menuId = menuId;
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
        if (!(object instanceof SubMenu)) {
            return false;
        }
        SubMenu other = (SubMenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corebits.imumzone.entity.SubMenu[ id=" + id + " ]";
    }
    
}
