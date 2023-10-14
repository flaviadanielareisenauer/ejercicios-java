package src;
import java.util.Scanner;

public class PorcentajesDeVotos {

    public static void main(String[] args) {
        int votosPullaro, votosLewandowski, votosBodoira, votosDeiana, totalVotos;
        double porcentajePullaro, porcentajeLewandowski, porcentajeBodoira, porcentajeDeiana;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la canidad de votos de Pullaro: ");
        votosPullaro = scanner.nextInt();
        System.out.print("Ingrese la canidad de votos de Lewandowski: ");
        votosLewandowski = scanner.nextInt();
        System.out.print("Ingrese la canidad de votos de Bodoira: ");
        votosBodoira = scanner.nextInt();
        System.out.print("Ingrese la canidad de votos de Bodoira: ");
        votosDeiana = scanner.nextInt();
        
        totalVotos = votosPullaro + votosLewandowski + votosBodoira + votosDeiana;
        
        // Porcentaje = porcion * 100 / total
        
        porcentajePullaro = votosPullaro * 100.0 / totalVotos; // podemos agregar .0 
        porcentajeLewandowski = (double)votosLewandowski * 100 / totalVotos; // o podemos aclararle el casteo al lado
        porcentajeBodoira = votosBodoira * 100 / totalVotos;
        porcentajeDeiana = votosDeiana * 100 / totalVotos;
        
        System.out.println("Maximo Pullaro - Unidos por el cambio Santa Fe: " + porcentajePullaro + "%");
        System.out.println("Marcelo Lewandowski - Juntos avancemos : " + porcentajeLewandowski + "%");
        System.out.println("Edelvino Bodoira - Viva la libertad: " + porcentajeBodoira + "%");
        System.out.println("Carla Deiana - Frente de izquierda: " + porcentajeDeiana + "%");
    }
}

/*
ACLARACION: 
Cuando se muestra la salida el porcentaje calculado como una division de enteros, puede verser que se imprime en pantalla los porcentajes, 
pero todos con un cero sobre el final (en lugar de mostrarse solo la parte entera). Esto es porque las variables impresas son doubles, 
y Java intentara, mediante casteo implicito, adaptar los datos que tenemos al tipo de datos de la variable (dobles). Es por esto que, a
los porcentajes enteros, se le termina agregando un cero.
*/