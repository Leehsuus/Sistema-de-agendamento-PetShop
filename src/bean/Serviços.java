/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Leticia
 */
@Entity
@Table(name = "servi\u00e7os", catalog = "dbPet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Servi\u00e7os.findAll", query = "SELECT s FROM Servi\u00e7os s"),
    @NamedQuery(name = "Servi\u00e7os.findByIdServi\u00e7os", query = "SELECT s FROM Servi\u00e7os s WHERE s.idServi\u00e7os = :idServi\u00e7os"),
    @NamedQuery(name = "Servi\u00e7os.findByNomeServi\u00e7o", query = "SELECT s FROM Servi\u00e7os s WHERE s.nomeServi\u00e7o = :nomeServi\u00e7o"),
    @NamedQuery(name = "Servi\u00e7os.findByPre\u00e7o", query = "SELECT s FROM Servi\u00e7os s WHERE s.pre\u00e7o = :pre\u00e7o")})
public class Serviços implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idServi\u00e7os")
    private Integer idServiços;
    @Column(name = "nomeServi\u00e7o")
    private String nomeServiço;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pre\u00e7o")
    private Double preço;

    public Serviços() {
    }

    public Serviços(Integer idServiços) {
        this.idServiços = idServiços;
    }

    public Integer getIdServiços() {
        return idServiços;
    }

    public void setIdServiços(Integer idServiços) {
        Integer oldIdServiços = this.idServiços;
        this.idServiços = idServiços;
        changeSupport.firePropertyChange("idServi\u00e7os", oldIdServiços, idServiços);
    }

    public String getNomeServiço() {
        return nomeServiço;
    }

    public void setNomeServiço(String nomeServiço) {
        String oldNomeServiço = this.nomeServiço;
        this.nomeServiço = nomeServiço;
        changeSupport.firePropertyChange("nomeServi\u00e7o", oldNomeServiço, nomeServiço);
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        Double oldPreço = this.preço;
        this.preço = preço;
        changeSupport.firePropertyChange("pre\u00e7o", oldPreço, preço);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServiços != null ? idServiços.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Serviços)) {
            return false;
        }
        Serviços other = (Serviços) object;
        if ((this.idServiços == null && other.idServiços != null) || (this.idServiços != null && !this.idServiços.equals(other.idServiços))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nomeServiço;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
