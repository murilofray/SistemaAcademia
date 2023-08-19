package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "matricula")
@NamedQueries({
    @NamedQuery(name = "Matricula.findAll", query = "SELECT m FROM Matricula m"),
    @NamedQuery(name = "Matricula.findByTurma", query = "SELECT m FROM Matricula m WHERE UPPER(m.turma.nome) LIKE UPPER(:nome)"),
    @NamedQuery(name = "Matricula.findByAluno", query = "SELECT m FROM Matricula m WHERE m.aluno.id = :id"),
    @NamedQuery(name = "Matricula.findByNome", query = "SELECT m FROM Matricula m WHERE UPPER (m.aluno.nome) LIKE UPPER(:nome)"),
    @NamedQuery(name = "Matricula.findByMatricula", query = "SELECT m FROM Matricula m WHERE m.matricula = :matricula")})
public class Matricula implements Serializable {

    @Column(name = "matricula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int matricula;

    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @JoinColumn(name = "aluno_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Aluno aluno;
    
    @JoinColumn(name = "turma_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Turma turma;

    public Matricula() {
    }

    public Matricula(Date data, Aluno aluno, Turma turma) {
        this.data = data;
        this.aluno = aluno;
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Matricula = " + matricula + " Turma = " + turma;
    }

   
    
    
}
