/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Turma;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author muril
 */
public class TurmaDAO extends AbstractDAO<Turma>{
    
    public List<Turma> findAll() {
       return getEntityManager()
                .createNamedQuery("Turma.findAll", Turma.class)
                .getResultList();
    }
    
    public List<Turma> findById (int id) {
        return getEntityManager()
                .createNamedQuery("Turma.findById", Turma.class)
                .setParameter("id", id)
                .getResultList();
    }
    
    public List<Turma> findByNome(String nome) {
        return getEntityManager()
                .createNamedQuery("Turma.findByNome", Turma.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
    public List<Turma> findByValor (BigDecimal valor) {
        return getEntityManager()
                .createNamedQuery("Turma.findByValor", Turma.class)
                .setParameter("valor", valor)
                .getResultList();
    }
    
}
