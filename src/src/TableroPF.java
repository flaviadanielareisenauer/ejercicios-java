package src;

import java.util.Random;

public class TableroPF {

    public static void main(String[] args) {
	int filas = 4;
	int columnas = 4;

	int[][] tablero = tableroAleatorio(filas, columnas);
	
	//VER TABLERO
	System.out.println("Tablero iniciado: ");
	verTablero(tablero);
	System.out.println("\n---------------------------------\n");
	
	// COLUMNA CON MAYOR CANTIDAD DE AZULES
	int columnaMaxAzul = encontrarMaxAzul(tablero);
	System.out.println("La columna con mas caramelos azules es: " + columnaMaxAzul);
	System.out.println("\n---------------------------------\n");
	
	// SI HAY UN CARAMELO VERDE
	boolean carameloVerde = carameloVerdeEnFila(tablero, 1);
	System.out.println("En la fila 1 " + (carameloVerde ? "SI" : "NO") + " hay al menos un caramelo verde.");
	System.out.println("\n---------------------------------\n");

    }
    
    // INICIALIZAR TABLERO
    // Genera un tablero de forma aleatoria 
    public static int[][] tableroAleatorio(int filas, int columnas) {
	int[][] tablero = new int[filas][columnas];
	Random random = new Random();

	for (int i = 0; i < filas; i++) {
	    for(int j = 0; j < columnas; j++) {
		tablero [i][j] = random.nextInt(4)+1;
		
	    }
	}
	return tablero;
    }
    
    // MOSTRAR EL TABLERO EN PANTALLA 
    public static void verTablero(int[][]tablero){
	for (int i =0; i < tablero.length; i++) {
	    for (int j =0; j < tablero[i].length; j++) {
		System.out.printf("%4d", tablero[i][j]);
	    }
	    System.out.println();	    
	}
    }
    
   // ENCONTRAR COLUMNA CON LA MAYOR CANTIDAD DE CARAMELOS AZULES
    public static int encontrarMaxAzul(int[][] tablero) {
	int columnaMaxAzul = 0;
	int maxAzules =0;
	
	for (int j = 0; j <tablero[0].length; j++) {
	    int contadorAzul=0; 
	    
	    for(int i=0; i < tablero.length; i++) {
		if (tablero[i][j] == 1) {
		    contadorAzul++;		    
		}	
	    }
	    
	    if (contadorAzul > maxAzules) {
		maxAzules = contadorAzul;
		columnaMaxAzul = j;
	    }
	}
	return columnaMaxAzul+1;
	
    }
    
    // VERIFICAR SI HAY AL MENOS UN CARAMELO VERDE EN LA FILA 1:    
    public static boolean carameloVerdeEnFila(int[][] tablero, int fila) {
	for (int j =0; j < tablero[fila -1].length; j++){
	    if (tablero[fila-1][j] == 4){
		return true;
	    }
	}  
	
	return false;
    }
}
