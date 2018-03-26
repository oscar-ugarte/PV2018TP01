package punto3.dominio;

/**
 *
 * @author Oscar
 */
public class VisualizadorDePrimos {

    /**
     * Recibe 2 numeros y verifica que no sean negativos.
     * @param extremoA
     * @param extremoB
     * @return Devuelve verdadero o falso.
     */
    public boolean validarExtremos (int extremoA, int extremoB){
        boolean valido = true ;
        if ( extremoA < 0 || extremoB < 0){
            valido = false;
        }
        return valido ;
    }
    
    /**
     * Recibe 2 numeros. Si son validos revisa cual es menor y mayor para enviarlos en ese orden.
     * Sino son valido muestra un mensaje de error.
     * @param A Un numero entero.
     * @param B Un numero entero
     */
    public void mostrarPrimosDelRango(int A, int B){
        if( validarExtremos(A,B) ){
            if(B < A){
                mostrarPrimos(B,A) ;
            }else{
                mostrarPrimos(A,B) ;
            }
        }else{
            System.out.println("Se ingreso un extremo negativo.");
        }
    }
    
    /**
     * Recibe los extremos ordenados de menor a mayor. Comienza el recorrido y si encuentra un primo lo muestra.
     * @param extremo1
     * @param extremo2 
     */
    public void mostrarPrimos(int extremo1, int extremo2){
        for(int i = extremo1; i <= extremo2 ; i++ ){
            if( verificarPrimo(i) ){
                System.out.println("Numero primo: " + i );
            }
        }
    }
    
    /**
     * Recibe un numero y comprueba si es primo o no.
     * @param num
     * @return Devuelve falso o verdadero.
     */
    public boolean verificarPrimo(int num){
        boolean valido = true ;
        int i = 2;
        while( valido == true && i < num ){
            if(num % i == 0){
                valido = false ;
            }else{
                i = i + 1 ;
            }
        }
        return valido;        
    }
}
