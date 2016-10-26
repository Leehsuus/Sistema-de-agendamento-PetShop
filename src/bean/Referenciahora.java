/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Leticia
 */
@Entity
@Table(name = "referenciahora", catalog = "dbPet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Referenciahora.findAll", query = "SELECT r FROM Referenciahora r"),
    @NamedQuery(name = "Referenciahora.findByIdRef", query = "SELECT r FROM Referenciahora r WHERE r.idRef = :idRef"),
    @NamedQuery(name = "Referenciahora.findByHoraRef", query = "SELECT r FROM Referenciahora r WHERE r.horaRef = :horaRef")})
public class Referenciahora implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRef")
    private Integer idRef;
    @Column(name = "horaRef")
    @Temporal(TemporalType.TIME)
    private Date horaRef;

    public Referenciahora() {
    }

    public Referenciahora(Integer idRef) {
        this.idRef = idRef;
    }

    public Integer getIdRef() {
        return idRef;
    }

    public void setIdRef(Integer idRef) {
        Integer oldIdRef = this.idRef;
        this.idRef = idRef;
        changeSupport.firePropertyChange("idRef", oldIdRef, idRef);
    }

    public Date getHoraRef() {
        return horaRef;
    }

    public void setHoraRef(Date horaRef) {
        Date oldHoraRef = this.horaRef;
        this.horaRef = horaRef;
        changeSupport.firePropertyChange("horaRef", oldHoraRef, horaRef);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRef != null ? idRef.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Referenciahora)) {
            return false;
        }
        Referenciahora other = (Referenciahora) object;
        if ((this.idRef == null && other.idRef != null) || (this.idRef != null && !this.idRef.equals(other.idRef))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Referenciahora[ idRef=" + idRef + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
