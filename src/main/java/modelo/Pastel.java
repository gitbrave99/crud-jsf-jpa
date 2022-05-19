/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author georg
 */
@Entity
@Table(name = "pastel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pastel.findAll", query = "SELECT p FROM Pastel p"),
    @NamedQuery(name = "Pastel.findByIdPastel", query = "SELECT p FROM Pastel p WHERE p.idPastel = :idPastel"),
    @NamedQuery(name = "Pastel.findByNombre", query = "SELECT p FROM Pastel p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Pastel.findByExistencia", query = "SELECT p FROM Pastel p WHERE p.existencia = :existencia")})
public class Pastel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pastel")
    private Integer idPastel;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "existencia")
    private Integer existencia;

    public Pastel() {
    }

    public Pastel(Integer idPastel) {
        this.idPastel = idPastel;
    }

    public Integer getIdPastel() {
        return idPastel;
    }

    public void setIdPastel(Integer idPastel) {
        this.idPastel = idPastel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPastel != null ? idPastel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pastel)) {
            return false;
        }
        Pastel other = (Pastel) object;
        if ((this.idPastel == null && other.idPastel != null) || (this.idPastel != null && !this.idPastel.equals(other.idPastel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pastel[ idPastel=" + idPastel + " ]";
    }
    
}
