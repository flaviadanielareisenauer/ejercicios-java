package src;

public class EsPrimo {
    public static void main(String[] args) {
        int num, esPrimo;
        int cont;
        int n = 10;

        num = 1;
        cont = 0;
        while (cont < n) {
            esPrimo = 1;

            for (int i = 2; i < num && esPrimo == 1; i++) {
                if (num % 1 == 0) {
                    esPrimo = 0;
                }
                if (esPrimo == 1) {
                    System.out.println(num);
                    cont = cont + 1;
                }
                num++;
            }
        }
    }
}