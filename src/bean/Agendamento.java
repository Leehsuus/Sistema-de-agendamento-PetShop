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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Leticia
 */
@Entity
@Table(name = "agendamento", catalog = "dbPet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Agendamento.findAll", query = "SELECT a FROM Agendamento a"),
    @NamedQuery(name = "Agendamento.findByIdAgendamento", query = "SELECT a FROM Agendamento a WHERE a.idAgendamento = :idAgendamento"),
    @NamedQuery(name = "Agendamento.findByClientesidClientes", query = "SELECT a FROM Agendamento a WHERE a.clientesidClientes = :clientesidClientes"),
    @NamedQuery(name = "Agendamento.findByAnimaisidAnimais", query = "SELECT a FROM Agendamento a WHERE a.animaisidAnimais = :animaisidAnimais"),
    @NamedQuery(name = "Agendamento.findByServi\u00e7osidServi\u00e7os", query = "SELECT a FROM Agendamento a WHERE a.servi\u00e7osidServi\u00e7os = :servi\u00e7osidServi\u00e7os"),
    @NamedQuery(name = "Agendamento.findByDia", query = "SELECT a FROM Agendamento a WHERE a.dia = :dia"),
    /*@NamedQuery(name= "Agendamento.findByReferenciaHoraidRef", query ="SELECT a.horaRef,b.horasMarcadas FROM referenciaHora as A left join HorasMarcadas as B on a.horaRef=b.horasMarcadas WHERE b.horasMarcadas is null"),
    /*@NamedQuery(name = "Agendamento.findByHora", query = "SELECT a FROM Agendamento a WHERE a.hora = :hora")*/})
public class Agendamento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAgendamento")
    private Integer idAgendamento;
    
    @JoinColumn(name = "Clientes_idClientes")
    @ManyToOne
    private Clientes clientesidClientes;
    
    @JoinColumn(name = "Animais_idAnimais")
    @ManyToOne
    private Animais animaisidAnimais;
    
    @JoinColumn(name = "Servi\u00e7os_idServi\u00e7os")
    @ManyToOne
    private Serviços serviçosidServiços;
    
    /*@JoinColumn (name="ReferenciaHoras_idRef")
    @OneToOne
    private Referenciahora referenciahorasidRef;*/
    
    @Column(name = "dia")
    @Temporal(TemporalType.DATE)
    private Date dia;
    /*@Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;*/

    public Agendamento() {
    }

    public Agendamento(Integer idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public Integer getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(Integer idAgendamento) {
        Integer oldIdAgendamento = this.idAgendamento;
        this.idAgendamento = idAgendamento;
        changeSupport.firePropertyChange("idAgendamento", oldIdAgendamento, idAgendamento);
    }

    public Clientes getClientesidClientes() {
        return clientesidClientes;
    }

    public void setClientesidClientes(Clientes clientesidClientes) {
        Clientes oldClientesidClientes = this.clientesidClientes;
        this.clientesidClientes = clientesidClientes;
        changeSupport.firePropertyChange("clientesidClientes", oldClientesidClientes, clientesidClientes);
    }

    public Animais getAnimaisidAnimais() {
        return animaisidAnimais;
    }

    public void setAnimaisidAnimais(Animais animaisidAnimais) {
        Animais oldAnimaisidAnimais = this.animaisidAnimais;
        this.animaisidAnimais = animaisidAnimais;
        changeSupport.firePropertyChange("animaisidAnimais", oldAnimaisidAnimais, animaisidAnimais);
    }

    public Serviços getServiçosidServiços() {
        return serviçosidServiços;
    }

    public void setServiçosidServiços(Serviços serviçosidServiços) {
        Serviços oldServiçosidServiços = this.serviçosidServiços;
        this.serviçosidServiços = serviçosidServiços;
        changeSupport.firePropertyChange("servi\u00e7osidServi\u00e7os", oldServiçosidServiços, serviçosidServiços);
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        Date oldDia = this.dia;
        this.dia = dia;
        changeSupport.firePropertyChange("dia", oldDia, dia);
    }
    
    /*public Referenciahora getReferenciaHoraidRef() {
        return referenciahorasidRef;
    }

    public void setReferenciaHoraidRef(Referenciahora referenciahorasidRef) {
        Referenciahora oldReferenciaHoraidRef = this.referenciahorasidRef;
        this.referenciahorasidRef = referenciahorasidRef;
        changeSupport.firePropertyChange("referenciahorasidRef", oldReferenciaHoraidRef, referenciahorasidRef);
    }*/

   /* public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        Date oldHora = this.hora;
        this.hora = hora;
        changeSupport.firePropertyChange("hora", oldHora, hora);
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgendamento != null ? idAgendamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agendamento)) {
            return false;
        }
        Agendamento other = (Agendamento) object;
        if ((this.idAgendamento == null && other.idAgendamento != null) || (this.idAgendamento != null && !this.idAgendamento.equals(other.idAgendamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Agendamento[ idAgendamento=" + idAgendamento + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
