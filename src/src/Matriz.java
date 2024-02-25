package src;

import java.util.Random;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las dimensiones de la matriz: ");
        
        // Se podría validar M y N, en caso de que el enunciado especifique un límite.
        int M = entrada.nextInt();
        int N = entrada.nextInt();
        
        int[][] matriz = new int[M][N];

        cargar_matriz(matriz);
        mostrar_matriz(matriz);
        //System.out.println("La fila con mayor suma es: " + fila_mayor_suma_naturales(matriz));
        System.out.println("La fila con mayor suma es: " + fila_mayor_suma_enteros(matriz));
    }

    public static void cargar_matriz(int[][] m) {
        Random random = new Random();
        for (int i = 0; i < m.length; i++) 
            for (int j = 0; j < m[i].length; j++) 
               //m[i][j] = random.nextInt(100);    //entre 0 y 99
               //m[i][j] = random.nextInt(100) + 1;  //entre 1 y 100
               m[i][j] = random.nextInt(201) - 100; //entre -100 y 100
    }

    public static void mostrar_matriz(int[][] m) {
        
        System.out.println("Matriz: ");
        System.out.println("======= ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) 
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    public static int fila_mayor_suma_enteros(int[][] m) {
        int sumaFila=0, filaMax=0, sumaFilaMax=0;
        
        for(int j=0;j<m[0].length; j++)
            sumaFilaMax+=m[0][j];
        System.out.println("Suma fila 0 = " + sumaFilaMax);
        
        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) 
                sumaFila+=m[i][j];
            if(sumaFila>sumaFilaMax) {
                sumaFilaMax=sumaFila;
                filaMax=i;
            }
            System.out.println("Suma fila " + i + " = " + sumaFila);
            sumaFila=0;
        }
        return filaMax;
    }    
    
    public static int fila_mayor_suma_naturales(int[][] m) {
        int sumaFila=0, filaMax=0, sumaFilaMax=0;
        
        for(int j=0;j<m[0].length; j++)
            sumaFilaMax+=m[0][j];
        System.out.println("Suma fila " + filaMax + " = " + sumaFilaMax);
        
        for (int i = 1; i < m.length; i++) {
            int j=0, itFila=0;
            while(sumaFila<=sumaFilaMax && j<m[i].length) {
                sumaFila+=m[i][j++];
                itFila++;
            }
            if(sumaFila>sumaFilaMax) {
                sumaFilaMax=sumaFila;
                filaMax=i;
            }
            System.out.println("Suma fila " + i + " = " + sumaFila + " Iteraciones: " + itFila);
            sumaFila=0;
        }
        return filaMax;
    }        
}
