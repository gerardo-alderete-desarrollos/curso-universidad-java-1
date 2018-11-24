/*
 *Derechos reservados
 */
package com.gm.javadoc;

/**
 *Clase para probar el concepto de JavaDoc
 * @author gerardo
 * @version 1.0
 */
public class EjemploJavaDoc {
    /**
     * Metodo para ejecutar la prueba de la clase Aritmetica
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args){
        int resultado = new Aritmetica(3,2).sumar();
        
        System.out.println("resultado:" + resultado);
    }
             
}
