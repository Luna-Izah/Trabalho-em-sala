package br.com.rff.trabalho;

import br.com.rff.contracts.ICriteria;
import br.com.rff.contracts.IFilter;
import br.com.rff.contracts.ISqlUpdate;

/**
 *
 * @author izahR
 */
public class TesteAtualizaNome {
    public static void main(String[] args) {
        
        ISqlUpdate update = new ISqlUpdate("usuario");
        update.addRowData("nome", "Pedro");
        
        
        ICriteria criterio = new ICriteria();
        criterio.addExpressions(new IFilter("nome", "=", "João"));

        update.setCriterio(criterio);
        
        System.out.println(update.getSql());
    }
    
    
}
