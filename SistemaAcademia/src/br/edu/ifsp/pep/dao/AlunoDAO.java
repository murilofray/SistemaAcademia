/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Aluno;
import java.util.List;

/**
 *
 * @author muril
 */
public class AlunoDAO extends AbstractDAO<Aluno>{

    public List<Aluno> findByNome(String nome) {
        return getEntityManager()
                .createNamedQuery("Aluno.findByNome", Aluno.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
    public List<Aluno> findBySexo (String sexo) {
        return getEntityManager()
                .createNamedQuery("Aluno.findBySexo", Aluno.class)
                .setParameter("sexo", "%" + sexo + "%")
                .getResultList();
    }
    
    public List<Aluno> findByCpf (String cpf) {
        return getEntityManager()
                .createNamedQuery("Aluno.findByCpf", Aluno.class)
                .setParameter("cpf", "%" + cpf + "%")
                .getResultList();
    }
    
    public List<Aluno> findById (int id) {
        return getEntityManager()
                .createNamedQuery("Aluno.findById", Aluno.class)
                .setParameter("id", id)
                .getResultList();
    }

    public List<Aluno> findAll() {
       return getEntityManager()
                .createNamedQuery("Aluno.findAll", Aluno.class)
                .getResultList();
    }
    
    
}
