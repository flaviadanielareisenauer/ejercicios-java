package src;

import java.util.Scanner;

public class Promedio_while {

    public static void main(String[] args) {
        int n, cant = 0, suma = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        n = entrada.nextInt();

        while (n != 0) {
            suma = suma + n;
            cant = cant + 1;

            System.out.println("Ingrese un valor: ");
            n = entrada.nextInt();
        }
        System.out.println("El promedio es: " + (double) suma / cant);
    }
}