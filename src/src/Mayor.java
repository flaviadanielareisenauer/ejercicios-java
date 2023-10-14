package src;

import java.util.Scanner;

public class Mayor {

    public static void main(String[] args) {
        int n, mayor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        n = entrada.nextInt();
        mayor = n;

        while (n != 0) {
            if (n > mayor) {
                mayor = n;
            }

            System.out.println("Ingrese el siguiente valor: ");
            n = entrada.nextInt();
        }
        System.out.print("El mayor es: " + mayor);
    }
}