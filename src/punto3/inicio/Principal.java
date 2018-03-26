/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.inicio;

import java.util.Scanner;
import punto3.dominio.VisualizadorDePrimos;

/**
 *
 * @author Oscar
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        VisualizadorDePrimos objVisualizador = new VisualizadorDePrimos();
        int extremoA, extremoB ;
        
        System.out.print("Ingrese un extremo: ");
        extremoA = teclado.nextInt() ;
        System.out.print("Ingrese otro extremo: ");
        extremoB = teclado.nextInt();
        
        //Visualizador.mostrarPrimosDelRango(extremoA, extremoB);
        if( objVisualizador.validarExtremos(extremoA,extremoB) ){
            if(extremoB < extremoA){
                objVisualizador.mostrarPrimos(extremoB,extremoA) ;
            }else{
                objVisualizador.mostrarPrimos(extremoA,extremoB) ;
            }
        }else{
            System.out.println("Se ingreso un extremo negativo.");
        }
        
    }
    
}
