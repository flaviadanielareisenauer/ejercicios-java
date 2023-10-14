package src;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        int cantPres, sumNota, maxNota;
        int legajo, nota;
        String nom = new String(), nomMax = new String();

        // Inicializo las variables 
        cantPres = 0;
        sumNota = 0;
        maxNota = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese numero de legajo: ");
        legajo = entrada.nextInt();

        while (legajo != 0) {
            System.out.println("Ingrese nota: ");
            nota = entrada.nextInt();

            System.out.println("Ingrese nombre: ");
            nom = entrada.next();

            cantPres = cantPres + 1;
            sumNota = sumNota + nota;
            if (nota > maxNota) {
                maxNota = nota;
                nomMax = nom;
            }
            System.out.println("Ingrese numero de legajo: ");
            legajo = entrada.nextInt();
        }

        // Cantidad de presentes
        System.out.println("Cantidad de presentes: " + cantPres);
        
        // Nota promedio
        double prom = (double)sumNota/cantPres;
        System.out.println("Nota promedio: " + prom);
        
        // Mejor alumno
        System.out.println("Alumno de mejor rendimiento: " + nomMax);
        System.out.println("Nota: " + maxNota);
        }
}