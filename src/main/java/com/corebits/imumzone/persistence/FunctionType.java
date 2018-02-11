/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corebits.imumzone.persistence;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Oche
 */
@Entity
@Table(name = "function_type")
@NamedQueries({
    @NamedQuery(name = "FunctionType.findAll", query = "SELECT f FROM FunctionType f")
    , @NamedQuery(name = "FunctionType.findById", query = "SELECT f FROM FunctionType f WHERE f.id = :id")
    , @NamedQuery(name = "FunctionType.findByAdvanced", query = "SELECT f FROM FunctionType f WHERE f.advanced = :advanced")
    , @NamedQuery(name = "FunctionType.findByName", query = "SELECT f FROM FunctionType f WHERE f.name = :name")})
public class FunctionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ADVANCED")
    private boolean advanced;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NAME")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "functionType")
    private Set<Functions> functionsSet;

    public FunctionType() {
    }

    public FunctionType(Integer id) {
        this.id = id;
    }

    public FunctionType(Integer id, boolean advanced, String name) {
        this.id = id;
        this.advanced = advanced;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getAdvanced() {
        return advanced;
    }

    public void setAdvanced(boolean advanced) {
        this.advanced = advanced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Functions> getFunctionsSet() {
        return functionsSet;
    }

    public void setFunctionsSet(Set<Functions> functionsSet) {
        this.functionsSet = functionsSet;
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
        if (!(object instanceof FunctionType)) {
            return false;
        }
        FunctionType other = (FunctionType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corebits.imumzone.entity.FunctionType[ id=" + id + " ]";
    }
    
}
