
package punto4.dominio;

/**
 *
 * @author Oscar
 */
public class Sumatoria {
    
    /**
     * Recibe un valor entero M y calcula la sumatoria. 
     * @param valorM
     * @return 
     */
    public int calcularSumatoria( int valorM ){
        int acumulador = 0;
        for(int i = 1; i <= valorM ; i++){
            acumulador = acumulador + (2 * i - 1) ;
        }
        return acumulador ;
    }
    
    /**
     * Controla que el valor que recibira no es negativo.
     * @param numero
     * @return 
     */
    public boolean validar(int numero){
        boolean valido = true ;
        if(numero <= 0){
            valido = false ;
        }
        return valido;
    }
    
}
