/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Funcionario;
import java.util.List;

/**
 *
 * @author muril
 */
public class FuncionarioDAO extends AbstractDAO<Funcionario>{

    public List<Funcionario> findAll() {
       return getEntityManager()
                .createNamedQuery("Funcionario.findAll", Funcionario.class)
                .getResultList();
    }
    
    public List<Funcionario> findByNome(String nome) {
        return getEntityManager()
                .createNamedQuery("Funcionario.findByNome", Funcionario.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
    public List<Funcionario> findBySexo (String sexo) {
        return getEntityManager()
                .createNamedQuery("Funcionario.findBySexo", Funcionario.class)
                .setParameter("sexo", "%" + sexo + "%")
                .getResultList();
    }
    
    public List<Funcionario> findByCpf (String cpf) {
        return getEntityManager()
                .createNamedQuery("Funcionario.findByCpf", Funcionario.class)
                .setParameter("cpf", "%" + cpf + "%")
                .getResultList();
    }
    
    public List<Funcionario> findByCargo (String cargo) {
        return getEntityManager()
                .createNamedQuery("Funcionario.findByCargo", Funcionario.class)
                .setParameter("cargo", "%" + cargo + "%")
                .getResultList();
    }
    
    public List<Funcionario> findByLogin(String login) {
        return getEntityManager()
                .createNamedQuery("Funcionario.findByLogin", Funcionario.class)
                .setParameter("login", login)
                .getResultList();
    }
    
    public List<Funcionario> findById (int id) {
        return getEntityManager()
                .createNamedQuery("Funcionario.findById", Funcionario.class)
                .setParameter("id", id)
                .getResultList();
    }
   
}
