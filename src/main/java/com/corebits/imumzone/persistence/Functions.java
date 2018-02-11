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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Oche
 */
@Entity
@Table(name = "functions")
@NamedQueries({
    @NamedQuery(name = "Functions.findAll", query = "SELECT f FROM Functions f")
    , @NamedQuery(name = "Functions.findById", query = "SELECT f FROM Functions f WHERE f.id = :id")
    , @NamedQuery(name = "Functions.findByCreationDate", query = "SELECT f FROM Functions f WHERE f.creationDate = :creationDate")
    , @NamedQuery(name = "Functions.findByDescription", query = "SELECT f FROM Functions f WHERE f.description = :description")
    , @NamedQuery(name = "Functions.findByMask", query = "SELECT f FROM Functions f WHERE f.mask = :mask")
    , @NamedQuery(name = "Functions.findByName", query = "SELECT f FROM Functions f WHERE f.name = :name")})
public class Functions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MASK")
    private String mask;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NAME")
    private String name;
    @JoinTable(name = "sub_menu_function", joinColumns = {
        @JoinColumn(name = "FUNCTION_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "SUB_MENU_ID", referencedColumnName = "ID")})
    @ManyToMany
    private Set<SubMenu> subMenuSet;
    @JoinColumn(name = "FUNCTION_TYPE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private FunctionType functionType;

    public Functions() {
    }

    public Functions(Long id) {
        this.id = id;
    }

    public Functions(Long id, Date creationDate, String mask, String name) {
        this.id = id;
        this.creationDate = creationDate;
        this.mask = mask;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SubMenu> getSubMenuSet() {
        return subMenuSet;
    }

    public void setSubMenuSet(Set<SubMenu> subMenuSet) {
        this.subMenuSet = subMenuSet;
    }

    public FunctionType getFunctionType() {
        return functionType;
    }

    public void setFunctionType(FunctionType functionType) {
        this.functionType = functionType;
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
        if (!(object instanceof Functions)) {
            return false;
        }
        Functions other = (Functions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corebits.imumzone.entity.Functions[ id=" + id + " ]";
    }
    
}
