
package punto4.inicio;

import java.util.Scanner;
import punto4.dominio.Productoria;
import punto4.dominio.Sumatoria;

/**
 *
 * @author Oscar
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Productoria objProductoria = new Productoria() ;
        Sumatoria objSumatoria = new Sumatoria() ;
        int valor, M ;
        
        System.out.println("Calculando Sumatoria :");
        System.out.print("Ingrese el valor de M: ");
        M = teclado.nextInt();
        if( objSumatoria.validar(M) ){
            System.out.println("Resultado: " + objSumatoria.calcularSumatoria(M) );
        }else{
            System.out.println("Ingreso un negativo.");
        }
        
        System.out.println("Calculando Productoria :");     
        System.out.print("Ingrese valor: ");
        valor = teclado.nextInt() ;
        if( objProductoria.validar(valor) ){
            System.out.println("Resultado: " + objProductoria.calcularProductoria(valor) );
        }else{
            System.out.println("Ingreso un negativo.");
        }  
    }
}
