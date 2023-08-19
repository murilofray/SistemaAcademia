/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "frequencia")
@NamedQueries({
    @NamedQuery(name = "Frequencia.findAll", query = "SELECT f FROM Frequencia f"),
    @NamedQuery(name = "Frequencia.findByCpf", query = "SELECT f FROM Frequencia f WHERE f.alunoId.cpf = :cpf"),
    @NamedQuery(name = "Frequencia.findById", query = "SELECT f FROM Frequencia f WHERE f.id = :id")})
public class Frequencia implements Serializable {

    @EmbeddedId
    private FrequenciaPK frequenciaPK;
    
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @JoinColumn(name = "aluno_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Aluno alunoId;

    public Frequencia() {
    }

    public Frequencia(Date data, Aluno alunoId) {
        this.data = data;
        this.alunoId = alunoId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aluno getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Aluno alunoId) {
        this.alunoId = alunoId;
    }

    public FrequenciaPK getFrequenciaPK() {
        return frequenciaPK;
    }

    public void setFrequenciaPK(FrequenciaPK frequenciaPK) {
        this.frequenciaPK = frequenciaPK;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.frequenciaPK);
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.data);
        hash = 47 * hash + Objects.hashCode(this.alunoId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Frequencia other = (Frequencia) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.frequenciaPK, other.frequenciaPK)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return Objects.equals(this.alunoId, other.alunoId);
    }


}
