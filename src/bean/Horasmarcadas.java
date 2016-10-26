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
@Table(name = "horasmarcadas", catalog = "dbPet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Horasmarcadas.findAll", query = "SELECT h FROM Horasmarcadas h"),
    @NamedQuery(name = "Horasmarcadas.findByIdHorasMarcadas", query = "SELECT h FROM Horasmarcadas h WHERE h.idHorasMarcadas = :idHorasMarcadas"),
    @NamedQuery(name = "Horasmarcadas.findByHorasMarcadas", query = "SELECT h FROM Horasmarcadas h WHERE h.horasMarcadas = :horasMarcadas")})
public class Horasmarcadas implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHorasMarcadas")
    private Integer idHorasMarcadas;
    @Column(name = "HorasMarcadas")
    @Temporal(TemporalType.TIME)
    private Date horasMarcadas;

    public Horasmarcadas() {
    }

    public Horasmarcadas(Integer idHorasMarcadas) {
        this.idHorasMarcadas = idHorasMarcadas;
    }

    public Integer getIdHorasMarcadas() {
        return idHorasMarcadas;
    }

    public void setIdHorasMarcadas(Integer idHorasMarcadas) {
        Integer oldIdHorasMarcadas = this.idHorasMarcadas;
        this.idHorasMarcadas = idHorasMarcadas;
        changeSupport.firePropertyChange("idHorasMarcadas", oldIdHorasMarcadas, idHorasMarcadas);
    }

    public Date getHorasMarcadas() {
        return horasMarcadas;
    }

    public void setHorasMarcadas(Date horasMarcadas) {
        Date oldHorasMarcadas = this.horasMarcadas;
        this.horasMarcadas = horasMarcadas;
        changeSupport.firePropertyChange("horasMarcadas", oldHorasMarcadas, horasMarcadas);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorasMarcadas != null ? idHorasMarcadas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horasmarcadas)) {
            return false;
        }
        Horasmarcadas other = (Horasmarcadas) object;
        if ((this.idHorasMarcadas == null && other.idHorasMarcadas != null) || (this.idHorasMarcadas != null && !this.idHorasMarcadas.equals(other.idHorasMarcadas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Horasmarcadas[ idHorasMarcadas=" + idHorasMarcadas + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
