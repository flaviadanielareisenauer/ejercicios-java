package src;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un medio de pago: ");
        char pago = entrada.next().charAt(0);
        
        System.out.print("Ingrese el importe: ");
        double importe = entrada.nextDouble();

        if (pago == 'c' || pago == 'C') {
            if (importe > 100) {
                importe = importe - (importe * 0.05);
            } else {
                importe = importe - (importe * 0.03);
            }
            System.out.println("El importe final a pagar es: " + importe);
        }
        else if (pago == 't' || pago == 'T') {
            if (importe > 100) {
                importe = importe - (importe * 0.025);
            } else {
                importe = importe - (importe * 0.02);
            }
            System.out.println("El importe final a pagar es: " + importe);
        }
        else {
            System.out.println("El medio de pago no es válido.");
        }
    }
}


// SWITCH
/*
public class Supermercado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un medio de pago: ");
        char pago = entrada.next().charAt(0);
        
        System.out.print("Ingrese el importe: ");
        double importe = entrada.nextDouble();

        switch (pago) {
            case 'c':
            case 'C':
                if (importe > 100) 
                    importe = importe - (importe * 0.05);
                else 
                    importe = importe - (importe * 0.03);
                
                System.out.println("El importe final a pagar es: " + importe);
                break;
            case 't':
            case 'T':
                if (importe > 100) 
                    importe = importe - (importe * 0.025);
                else 
                    importe = importe - (importe * 0.02);
                System.out.println("El importe final a pagar es: " + importe);
                break;
            default:
                System.out.println("El medio de pago no es válido.");
        }
    }
}
*/
