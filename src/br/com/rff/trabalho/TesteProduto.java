package br.com.rff.trabalho;

import br.com.rff.contracts.ICriteria;
import br.com.rff.contracts.IFilter; 
import br.com.rff.contracts.ISqlSelect;

/**
 *
 * @author izahR
 */
public class TesteProduto {
    
     public static void main(String[] args){
           
        ISqlSelect select = new ISqlSelect("produto");
        select.getCols().add("nome");
        select.getCols().add("valor");

        ICriteria criterio = new ICriteria();
        criterio.addExpressions(new IFilter("situacao", "=", "Ativo"));

        criterio.getProperties().put("limit", 3);
        criterio.getProperties().put("order", "valor desc");

        select.setCriterio(criterio);
        
        System.out.println(select.getSql());
    }
}




