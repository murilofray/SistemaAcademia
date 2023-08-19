/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
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

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "funcionario")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findById", query = "SELECT f FROM Funcionario f WHERE f.id = :id"),
    @NamedQuery(name = "Funcionario.findByNome", query = "SELECT f FROM Funcionario f WHERE UPPER (f.nome) LIKE UPPER (:nome)"),
    @NamedQuery(name = "Funcionario.findByCpf", query = "SELECT f FROM Funcionario f WHERE UPPER (f.cpf) LIKE UPPER (:cpf)"),
    @NamedQuery(name = "Funcionario.findBySexo",query = "SELECT f FROM Funcionario f WHERE UPPER(f.sexo) LIKE UPPER (:sexo)"),
    @NamedQuery(name = "Funcionario.findByLogin",query = "SELECT f FROM Funcionario f WHERE f.login = :login"),
    @NamedQuery(name = "Funcionario.findByCargo", query = "SELECT f FROM Funcionario f WHERE UPPER (f.cargo) LIKE UPPER (:cargo)")})
public class Funcionario implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nome", nullable = false,length = 100)
    private String nome;
    
    @Column(name = "cpf", nullable = false,length = 11)
    private String cpf;
    
    @Column(name = "telefone",length = 11)
    private String telefone;
    
    @Column(name = "cargo", nullable = false,length = 20)
    private String cargo;
    
    @Column(name = "login", nullable = false,length = 20)
    private String login;
    
    @Column(name = "senha", nullable = false,length = 15)
    private String senha;
    
    @Column(name = "sexo", nullable = false,length = 10)
    private String sexo;
    
    @Column(name = "data_nascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    public Funcionario() {
    }

    public Funcionario(int id) {
        this.id = id;
    }

    public Funcionario(String nome, String cpf, String telefone, String cargo, String login, String senha, String sexo, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
