package src;

public class CicloFor {

    public static void main(String[] args) {
        int a, b, mult;
        a = 3;
        b = 5;
        mult = 0;

        for (int i = 0; i < b; i++) {
            mult = mult + a;
        }
        System.out.println(mult);
    }
}
