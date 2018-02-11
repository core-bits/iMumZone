/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corebits.imumzone.persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "audit_trail")
@NamedQueries({
    @NamedQuery(name = "AuditTrail.findAll", query = "SELECT a FROM AuditTrail a")
    , @NamedQuery(name = "AuditTrail.findById", query = "SELECT a FROM AuditTrail a WHERE a.id = :id")
    , @NamedQuery(name = "AuditTrail.findByAdminUsersStaffId", query = "SELECT a FROM AuditTrail a WHERE a.adminUsersStaffId = :adminUsersStaffId")
    , @NamedQuery(name = "AuditTrail.findByOperation", query = "SELECT a FROM AuditTrail a WHERE a.operation = :operation")
    , @NamedQuery(name = "AuditTrail.findBySourceIp", query = "SELECT a FROM AuditTrail a WHERE a.sourceIp = :sourceIp")
    , @NamedQuery(name = "AuditTrail.findByStatus", query = "SELECT a FROM AuditTrail a WHERE a.status = :status")
    , @NamedQuery(name = "AuditTrail.findByTrailDate", query = "SELECT a FROM AuditTrail a WHERE a.trailDate = :trailDate")})
public class AuditTrail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ADMIN_USERS_STAFF_ID")
    private String adminUsersStaffId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OPERATION")
    private String operation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "SOURCE_IP")
    private String sourceIp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "STATUS")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRAIL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trailDate;

    public AuditTrail() {
    }

    public AuditTrail(Integer id) {
        this.id = id;
    }

    public AuditTrail(Integer id, String adminUsersStaffId, String operation, String sourceIp, String status, Date trailDate) {
        this.id = id;
        this.adminUsersStaffId = adminUsersStaffId;
        this.operation = operation;
        this.sourceIp = sourceIp;
        this.status = status;
        this.trailDate = trailDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminUsersStaffId() {
        return adminUsersStaffId;
    }

    public void setAdminUsersStaffId(String adminUsersStaffId) {
        this.adminUsersStaffId = adminUsersStaffId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTrailDate() {
        return trailDate;
    }

    public void setTrailDate(Date trailDate) {
        this.trailDate = trailDate;
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
        if (!(object instanceof AuditTrail)) {
            return false;
        }
        AuditTrail other = (AuditTrail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corebits.imumzone.entity.AuditTrail[ id=" + id + " ]";
    }
    
}
