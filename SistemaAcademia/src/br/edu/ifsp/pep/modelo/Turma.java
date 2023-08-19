package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "turma")
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t"),
    @NamedQuery(name = "Turma.findById", query = "SELECT t FROM Turma t WHERE t.id = :id"),
    @NamedQuery(name = "Turma.findByNome", query = "SELECT t FROM Turma t WHERE UPPER (t.nome) LIKE UPPER(:nome)")})
public class Turma implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "descricao", length = 100)
    private String descricao;
    
    @Column(name = "capacidade_maxima", nullable = false)
    private int capacidadeMaxima;
    
    @Column(name = "quantidade_matriculados", nullable = false)
    private int quantidadeMatriculados = 0;
    
    @Column(name = "horario_inicio", nullable = false)
    private Time horarioInicio;
    
    @Column(name = "horario_fim", nullable = false)
    private Time horarioFim;

    @JoinColumn(name = "modalidade_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Modalidade modalidadeId;

    @OneToMany(mappedBy = "turma")
    private List<Matricula> matriculaList;

    public Turma() {
    }

    public Turma(int id) {
        this.id = id;
    }

    public Turma(String nome, String descricao, int capacidadeMaxima, Time horarioInicio, Time horarioFim, Modalidade modalidadeId) {
        this.nome = nome;
        this.descricao = descricao;
        this.capacidadeMaxima = capacidadeMaxima;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.modalidadeId = modalidadeId;
    }

    
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Time getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Time horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Time getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Time horarioFim) {
        this.horarioFim = horarioFim;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Modalidade getModalidadeId() {
        return modalidadeId;
    }

    public void setModalidadeId(Modalidade modalidadeId) {
        this.modalidadeId = modalidadeId;
    }

    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
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
        final Turma other = (Turma) obj;
        return this.id == other.id;
    }

    public int getQuantidadeMatriculados() {
        return quantidadeMatriculados;
    }

    public void setQuantidadeMatriculados(int quantidadeMatriculados) {
        this.quantidadeMatriculados = quantidadeMatriculados;
    }

    

}
