package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "aluno")
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a"),
    @NamedQuery(name = "Aluno.findById", query = "SELECT a FROM Aluno a WHERE a.id = :id"),
    @NamedQuery(name = "Aluno.findByCpf",query = "SELECT a FROM Aluno a WHERE a.cpf LIKE :cpf"),
    @NamedQuery(name = "Aluno.findBySexo",query = "SELECT a FROM Aluno a WHERE UPPER(a.sexo) LIKE UPPER(:sexo)"),
    @NamedQuery(name = "Aluno.findByNome",query = "SELECT a FROM Aluno a WHERE UPPER(a.nome) LIKE UPPER(:nome)")})
public class Aluno implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    
    @Column(name = "cpf", nullable = false,length = 11)
    private String cpf;
    
    @Column(name = "telefone",length = 11)
    private String telefone;
    
    @Column(name = "cep",length = 8)
    private String cep;
    
    @Column(name = "sexo", nullable = false,length = 10)
    private String sexo;
    
    @JoinColumn(name = "frequencia", referencedColumnName = "id", insertable=false, updatable=false)
    @OneToMany(mappedBy = "alunoId")
    private List<Frequencia> frequenciaList;
    
    @JoinColumn(name = "matricula", referencedColumnName = "matricula", insertable=false, updatable=false)
    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculaList;

    public Aluno() {
    }

    public Aluno(int id) {
        this.id = id;
    }

    public Aluno(String nome, Date dataNascimento, String cpf, String telefone, String cep, String sexo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cep = cep;
        this.sexo = sexo;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public List<Frequencia> getFrequenciaList() {
        return frequenciaList;
    }

    public void setFrequenciaList(List<Frequencia> frequenciaList) {
        this.frequenciaList = frequenciaList;
    }

    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
