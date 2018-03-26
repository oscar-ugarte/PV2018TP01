package punto4.dominio;

/**
 *
 * @author Oscar
 */
public class Productoria {
    
    /**
     * Recibe un numero entero y devuelve el resultado dela productoria.
     * @param valor
     * @return 
     */
    public int calcularProductoria(int valor){
        int acumulador = 1;
        for(int k = 1; k <= valor ; k++){
            acumulador = acumulador * k ;
        }
        return acumulador;
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
