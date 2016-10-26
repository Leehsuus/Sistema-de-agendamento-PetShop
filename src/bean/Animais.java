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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Leticia
 */
@Entity
@Table(name = "animais", catalog = "dbPet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Animais.findAll", query = "SELECT a FROM Animais a"),
    @NamedQuery(name = "Animais.findByIdAnimais", query = "SELECT a FROM Animais a WHERE a.idAnimais = :idAnimais"),
    @NamedQuery(name = "Animais.findByClientesidClientes", query = "SELECT a FROM Animais a WHERE a.clientesidClientes = :clientesidClientes"),
    @NamedQuery(name = "Animais.findByNomeAnimal", query = "SELECT a FROM Animais a WHERE a.nomeAnimal = :nomeAnimal"),
    @NamedQuery(name = "Animais.findByTipoAnimal", query = "SELECT a FROM Animais a WHERE a.tipoAnimal = :tipoAnimal"),
    @NamedQuery(name = "Animais.findByPorte", query = "SELECT a FROM Animais a WHERE a.porte = :porte"),
    @NamedQuery(name = "Animais.findByIdade", query = "SELECT a FROM Animais a WHERE a.idade = :idade"),
    @NamedQuery(name = "Animais.findByRa\u00e7a", query = "SELECT a FROM Animais a WHERE a.ra\u00e7a = :ra\u00e7a"),
    @NamedQuery(name = "Animais.findByObserva\u00e7\u00e3o", query = "SELECT a FROM Animais a WHERE a.observa\u00e7\u00e3o = :observa\u00e7\u00e3o")})
public class Animais implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAnimais")
    private Integer idAnimais;
    
    @JoinColumn(name = "Clientes_idClientes")
    @ManyToOne
    private Clientes clientesidClientes;
    
    @Column(name = "NomeAnimal")
    private String nomeAnimal;
    @Column(name = "TipoAnimal")
    private String tipoAnimal;
    @Column(name = "Porte")
    private String porte;
    @Column(name = "Idade")
    private Integer idade;
    @Column(name = "Ra\u00e7a")
    private String raça;
    @Column(name = "Observa\u00e7\u00e3o")
    private String observação;

    public Animais() {
    }

    public Animais(Integer idAnimais) {
        this.idAnimais = idAnimais;
    }

    public Integer getIdAnimais() {
        return idAnimais;
    }

    public void setIdAnimais(Integer idAnimais) {
        Integer oldIdAnimais = this.idAnimais;
        this.idAnimais = idAnimais;
        changeSupport.firePropertyChange("idAnimais", oldIdAnimais, idAnimais);
    }

    public Clientes getClientesidClientes() {
        return clientesidClientes;
    }

    public void setClientesidClientes(Clientes clientesidClientes) {
        Clientes oldClientesidClientes = this.clientesidClientes;
        this.clientesidClientes = clientesidClientes;
        changeSupport.firePropertyChange("clientesidClientes", oldClientesidClientes, clientesidClientes);
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        String oldNomeAnimal = this.nomeAnimal;
        this.nomeAnimal = nomeAnimal;
        changeSupport.firePropertyChange("nomeAnimal", oldNomeAnimal, nomeAnimal);
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        String oldTipoAnimal = this.tipoAnimal;
        this.tipoAnimal = tipoAnimal;
        changeSupport.firePropertyChange("tipoAnimal", oldTipoAnimal, tipoAnimal);
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        String oldPorte = this.porte;
        this.porte = porte;
        changeSupport.firePropertyChange("porte", oldPorte, porte);
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        Integer oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        String oldRaça = this.raça;
        this.raça = raça;
        changeSupport.firePropertyChange("ra\u00e7a", oldRaça, raça);
    }

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        String oldObservação = this.observação;
        this.observação = observação;
        changeSupport.firePropertyChange("observa\u00e7\u00e3o", oldObservação, observação);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnimais != null ? idAnimais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animais)) {
            return false;
        }
        Animais other = (Animais) object;
        if ((this.idAnimais == null && other.idAnimais != null) || (this.idAnimais != null && !this.idAnimais.equals(other.idAnimais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nomeAnimal;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
