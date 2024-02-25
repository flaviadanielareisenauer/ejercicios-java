package src;

import java.util.Random;
import java.util.Scanner;

public class TFisicoTLogico {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Declaro el arreglo con la dimensión dada por tope físico
        final int tFisico = 8;
        int[] vector = new int[tFisico];
        System.out.println("El tamaño físico del vector es: " + vector.length);
        
        // Trabajando con tope lógico
        int tLogico;
        System.out.print("Ingrese el tope lógico: ");
        tLogico=entrada.nextInt();
        
        // Valido que no sea menor a 1 ni mayor al tope fisico
        while(tLogico<1 || tLogico>tFisico) {
            System.out.println("El tamaño lógico no puede ser menor a 1 ni superar el tamaño físico (" + tFisico + "). Volvé a intentarlo.");
            System.out.print("Ingrese el tope lógico: ");
            tLogico=entrada.nextInt();            
        }        
        
        cargar_vector(vector, tLogico);
        mostrar_vector(vector, tLogico);        
    }
    
    public static void cargar_vector(int[] v, int tl) {
        Random random = new Random();
        for (int i = 0; i < tl; i++) 
            v[i] = random.nextInt(10); 
    }

    public static void mostrar_vector(int[] v, int tl) {
        System.out.println("Vector: ");
        System.out.println("======  ");
        for (int i = 0; i < tl; i++) {  
                System.out.print(v[i] + " "); 
        }
        System.out.println();                 
        System.out.println();        
    }        
}





/*
        Trabajando con tope lógico
        int tLogico;
        System.out.print("Ingrese el tope lógico: ");
        tLogico=entrada.nextInt();
        
        Valido que no sea menor a 1 ni mayor al tFisico
        while(tLogico<1 || tLogico>tFisico) {
            System.out.println("El tamaño lógico no puede ser menor a 1 ni superar el tamaño físico (" + tFisico + "). Volvé a intentarlo:");
            System.out.print("Ingrese el tope lógico: ");
            tLogico=entrada.nextInt();            
        }

*/
