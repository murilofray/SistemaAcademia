/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Frequencia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author muril
 */
public class FrequenciaDAO extends AbstractDAO<Frequencia>{
    public List<Frequencia> findByCpf (String cpf) {
        return getEntityManager()
                .createNamedQuery("Frequencia.findByCpf", Frequencia.class)
                .setParameter("cpf",cpf)
                .getResultList();
    }
    
    public String frequencia(int id){
        EntityManager conexao = getEntityManager();
        StoredProcedureQuery consulta = conexao.createStoredProcedureQuery("calcula_frequencia");
        consulta.registerStoredProcedureParameter("aluno_id", Integer.class, ParameterMode.IN);
        consulta.registerStoredProcedureParameter("frequencia", Float.class, ParameterMode.INOUT);
        consulta.setParameter("aluno_id", id);
        consulta.execute();
        String retorno = consulta.getOutputParameterValue("frequencia").toString();
        if(Float.parseFloat(retorno) > 0)
            retorno = retorno.substring(0, 4);
        return retorno;
    }
    
}
