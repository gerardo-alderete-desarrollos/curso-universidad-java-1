/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile2;

import java.util.Scanner;

/**
 *
 * @author gerardo
 */
public class CicloWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Por favor introduce el número de elementos a iterar:");
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in); //Creacion de objeto Scanner para leer datos
        maxElementos = entradaEscaner.nextInt(); //Leemos el valor proporcionado por el usuario
        int contador = 0;//Inicializamos el contador
        while (contador < maxElementos) {
            System.out.println("contador = " + contador);
            contador++;
        }
    }
    
}
