/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Matricula;
import java.util.List;

/**
 *
 * @author muril
 */
public class MatriculaDAO extends AbstractDAO<Matricula>{
    
    public List<Matricula> findAll() {
       return getEntityManager()
                .createNamedQuery("Matricula.findAll", Matricula.class)
                .getResultList();
    }
    
    public List<Matricula> findByMatricula (int matricula) {
        return getEntityManager()
                .createNamedQuery("Matricula.findByMatricula", Matricula.class)
                .setParameter("matricula", matricula)
                .getResultList();
    }
    
    public List<Matricula> findByNome(String nome) {
        return getEntityManager()
                .createNamedQuery("Matricula.findByNome", Matricula.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
    public List<Matricula> findByTurma(String nome) {
       return getEntityManager()
                .createNamedQuery("Matricula.findByTurma", Matricula.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
    public List<Matricula> findByAluno (int id) {
        return getEntityManager()
                .createNamedQuery("Matricula.findByAluno", Matricula.class)
                .setParameter("id", id)
                .getResultList();
    }
    
    
}
