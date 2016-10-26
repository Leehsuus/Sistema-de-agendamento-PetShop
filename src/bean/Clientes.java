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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Leticia
 */
@Entity
@Table(name = "clientes", catalog = "dbPet", schema = "")
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByIdClientes", query = "SELECT c FROM Clientes c WHERE c.idClientes = :idClientes"),
    @NamedQuery(name = "Clientes.findByNomeDono", query = "SELECT c FROM Clientes c WHERE c.nomeDono = :nomeDono"),
    @NamedQuery(name = "Clientes.findByTelefone", query = "SELECT c FROM Clientes c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Clientes.findByTelefone2", query = "SELECT c FROM Clientes c WHERE c.telefone2 = :telefone2"),
    @NamedQuery(name = "Clientes.findByCpf", query = "SELECT c FROM Clientes c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Clientes.findByRg", query = "SELECT c FROM Clientes c WHERE c.rg = :rg"),
    @NamedQuery(name = "Clientes.findByCnpj", query = "SELECT c FROM Clientes c WHERE c.cnpj = :cnpj"),
    @NamedQuery(name = "Clientes.findByEmail", query = "SELECT c FROM Clientes c WHERE c.email = :email"),
    @NamedQuery(name = "Clientes.findByRua", query = "SELECT c FROM Clientes c WHERE c.rua = :rua"),
    @NamedQuery(name = "Clientes.findByNumero", query = "SELECT c FROM Clientes c WHERE c.numero = :numero"),
    @NamedQuery(name = "Clientes.findByComplemento", query = "SELECT c FROM Clientes c WHERE c.complemento = :complemento"),
    @NamedQuery(name = "Clientes.findByBairro", query = "SELECT c FROM Clientes c WHERE c.bairro = :bairro"),
    @NamedQuery(name = "Clientes.findByMunicipio", query = "SELECT c FROM Clientes c WHERE c.municipio = :municipio"),
    @NamedQuery(name = "Clientes.findByEstado", query = "SELECT c FROM Clientes c WHERE c.estado = :estado"),
    @NamedQuery(name = "Clientes.findByCep", query = "SELECT c FROM Clientes c WHERE c.cep = :cep"),
    @NamedQuery(name = "Clientes.findByPontoReferencia", query = "SELECT c FROM Clientes c WHERE c.pontoReferencia = :pontoReferencia")})
public class Clientes implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idClientes")
    private Integer idClientes;
    @Column(name = "NomeDono")
    private String nomeDono;
    @Column(name = "Telefone")
    private Long telefone;
    @Column(name = "Telefone2")
    private Long telefone2;
    @Column(name = "CPF")
    private Long cpf;
    @Column(name = "RG")
    private Long rg;
    @Column(name = "CNPJ")
    private Long cnpj;
    @Column(name = "Email")
    private String email;
    @Column(name = "Rua")
    private String rua;
    @Column(name = "Numero")
    private Long numero;
    @Column(name = "Complemento")
    private String complemento;
    @Column(name = "Bairro")
    private String bairro;
    @Column(name = "Municipio")
    private String municipio;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "CEP")
    private Long cep;
    @Column(name = "PontoReferencia")
    private String pontoReferencia;

    public Clientes() {
    }

    public Clientes(Integer idClientes) {
        this.idClientes = idClientes;
    }

    public Integer getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(Integer idClientes) {
        Integer oldIdClientes = this.idClientes;
        this.idClientes = idClientes;
        changeSupport.firePropertyChange("idClientes", oldIdClientes, idClientes);
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        String oldNomeDono = this.nomeDono;
        this.nomeDono = nomeDono;
        changeSupport.firePropertyChange("nomeDono", oldNomeDono, nomeDono);
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        Long oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public Long getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(Long telefone2) {
        Long oldTelefone2 = this.telefone2;
        this.telefone2 = telefone2;
        changeSupport.firePropertyChange("telefone2", oldTelefone2, telefone2);
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        Long oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        Long oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        Long oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        String oldRua = this.rua;
        this.rua = rua;
        changeSupport.firePropertyChange("rua", oldRua, rua);
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        Long oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        String oldMunicipio = this.municipio;
        this.municipio = municipio;
        changeSupport.firePropertyChange("municipio", oldMunicipio, municipio);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        Long oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        String oldPontoReferencia = this.pontoReferencia;
        this.pontoReferencia = pontoReferencia;
        changeSupport.firePropertyChange("pontoReferencia", oldPontoReferencia, pontoReferencia);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClientes != null ? idClientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idClientes == null && other.idClientes != null) || (this.idClientes != null && !this.idClientes.equals(other.idClientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nomeDono;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
