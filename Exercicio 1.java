import java.util.Scanner;

public class Exercicio 1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Informe um numero: ");

        int num = ler.nextInt();

        if (num > 0) {
            System.out.println("Positivo!");
        } else if (num < 0) {
            System.out.println("Negativo!");
        } else {
            System.out.println("Zero não funciona mano");
        }

    }
}