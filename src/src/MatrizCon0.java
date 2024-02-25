package src;

import java.util.Random;
import java.util.Scanner;

public class MatrizCon0 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las dimensiones de la matriz: ");

        // Se podrían validar M y N, en caso de que el enunciado especifique un límite ej. max 5
        int M = entrada.nextInt();
        int N = entrada.nextInt();

        int[][] matriz = new int[M][N];

        cargar_matriz(matriz);
        mostrar_matriz(matriz);

        //Opción Función Encontró cero:
        if (Encontro0_Proced(matriz)) {
            System.out.println("La matriz contiene 0");
        } else {
            System.out.println("No se encontraron 0 en la matriz");
        }
    }

    // m.length cuenta el N de filas de la M
    // m[i].length; j++)// Cantidad de elementos de la fila  que le indiquemos en [], o sea las columnas 
    public static void cargar_matriz(int[][] m) {
        //hay que recorrerla entera para cargarla y sabemos la dimensión entonces Combinamos FOR y FOR
        Random random = new Random();
        for (int i = 0; i < m.length; i++) // m.length cuenta el N de filas de la M
            for (int j = 0; j < m[i].length; j++)// Cantidad de elementos de la primer fila:" + mat[0].length
                m[i][j] = random.nextInt(10); //entre 0 y 9
    }

    public static void mostrar_matriz(int[][] m) {

        System.out.println("Matriz: ");
        System.out.println("======= ");
        for (int i = 0; i < m.length; i++) {      // Por cada fila... 
            for (int j = 0; j < m[i].length; j++) // Recorrre todos los elementos
                System.out.print(m[i][j] + " ");  // No le pongo el ln para que vatan quedando uno al lado del otro   
            System.out.println();                 // Le doy el espacio para que simule un enter luego de obtener los valores de la fila
        }
    }

    public static boolean Encontro0_Proced(int[][] m) {
        
        boolean encontro0 = false;
        //int primerFilaCon0; //que pasa si no la inicializo aca?
        int i = 0;
        int j = 0;
        int iteraciones=0;

        while (encontro0 == false && i < m.length) { //para recorrer filas

            while (encontro0 == false && j < m[i].length) {//para recorrer elementos de fila (columnas)
                iteraciones++;
                if (m[i][j] == 0) 
                    encontro0 = true;
                else 
                    j++;//para recorrer el elemento siguiente                
            }
            i++; // Incremento la fila para que recorra la que sigue.-
            j = 0; //reinicio el contador de elementos(columnas)
        }
        
        System.out.println("Se resolvió en " + iteraciones + " iteraciones.");
        return encontro0;
    }
}

/*
5 7 
1 2 
*/
