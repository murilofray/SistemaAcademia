/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "modalidade")
@NamedQueries({
    @NamedQuery(name = "Modalidade.findAll", query = "SELECT m FROM Modalidade m"),
    @NamedQuery(name = "Modalidade.findById", query = "SELECT m FROM Modalidade m WHERE m.id = :id"),
    @NamedQuery(name = "Modalidade.findByNome", query = "SELECT m FROM Modalidade m WHERE UPPER (m.nome) LIKE UPPER (:nome)"),
    @NamedQuery(name = "Modalidade.findByValor", query = "SELECT m FROM Modalidade m WHERE m.valor >= :valor")})
public class Modalidade implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @OneToMany(mappedBy = "modalidadeId")
    private List<Turma> turmaList;

    public Modalidade() {
    }

    public Modalidade(int id) {
        this.id = id;
    }

    public Modalidade(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<Turma> getTurmaList() {
        return turmaList;
    }

    public void setTurmaList(List<Turma> turmaList) {
        this.turmaList = turmaList;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
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
        final Modalidade other = (Modalidade) obj;
        return this.id == other.id;
    }


  

    

}
