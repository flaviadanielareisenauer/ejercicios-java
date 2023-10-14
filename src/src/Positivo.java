package src;

import java.util.Scanner;

public class Positivo {

    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Ingrese un numero positivo");
            num = entrada.nextInt();

        } while (num < 0);
    }
}