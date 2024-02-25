package src;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       int opcion,n1 = 0, n2=0;
       
       menu();
       opcion = sc.nextInt();
       
       while (opcion!=9){
           
           if(opcion==1 || opcion==3 || opcion==2 || opcion==4){
           System.out.print("\nIngrese el primer numero: ");
           n1=sc.nextInt();
           System.out.print("Ingrese el segundo numero: ");
           n2=sc.nextInt();
           }
           
           switch(opcion){
               case 1:
                  System.out.println("\nEl resultado de la suma es: " + suma(n1, n2)); 
                  break;
               case 2:
                  System.out.println("\nEl resultado de la resta es: " + resta(n1, n2)); 
                  break; 
               case 3:
                  System.out.println("\nEl resultado de la multiplicacion es: " + multiplicacion(n1, n2)); 
                  break; 
               case 4: 
                  division(n1, n2); 
                  break; 
               default:
                  System.out.println("\nLa opcion ingresada es incorrecta."); 
                  break;   
           }
                     
           sc.nextLine(); 
           System.out.println("\nPresione enter para continuar");
           sc.nextLine(); 
          
           
           menu();
           opcion = sc.nextInt();
       }

    }

    public static void menu(){
       System.out.println("   CALCULADORA - nivel I");
       System.out.println("=============================");
       System.out.println("     1.- Sumar");
       System.out.println("     2.- Restar");
       System.out.println("     3.- Multiplicar");
       System.out.println("     4.- Dividir");
       System.out.println("     9.- Cerrar la aplicacion");
       System.out.print("\n     Ingrese una opcion:");       
       
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static void division(int a, int b) {
        Locale locale = Locale.ENGLISH;
        if(b!=0){
            double div = (double)a/b;
            System.out.println("\nEl resultado de la division es: " + String.format(locale, "%.2f", div));

        } else{
        System.out.println("\nNo es posible dividir por 0");
        }        
    }
}
