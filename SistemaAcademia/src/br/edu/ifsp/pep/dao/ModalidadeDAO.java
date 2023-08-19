/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Modalidade;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author muril
 */
public class ModalidadeDAO extends AbstractDAO<Modalidade>{
    public List<Modalidade> findAll() {
       return getEntityManager()
                .createNamedQuery("Modalidade.findAll", Modalidade.class)
                .getResultList();
    }
    
    public List<Modalidade> findById (int id) {
        return getEntityManager()
                .createNamedQuery("Modalidade.findById", Modalidade.class)
                .setParameter("id", id)
                .getResultList();
    }
    
    public List<Modalidade> findByNome(String nome) {
        return getEntityManager()
                .createNamedQuery("Modalidade.findByNome", Modalidade.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
    public List<Modalidade> findByValor (BigDecimal valor) {
        return getEntityManager()
                .createNamedQuery("Modalidade.findByValor", Modalidade.class)
                .setParameter("valor", valor)
                .getResultList();
    }
    
}
