import java.util.Scanner;

public class Exercicio 4 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe 10 numeros: ");
      
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int n3 = ler.nextInt();
        int n4 = ler.nextInt();
        int n5 = ler.nextInt();
        int n6 = ler.nextInt();
        int n7 = ler.nextInt();
        int n8 = ler.nextInt();
        int n9 = ler.nextInt();
        int n10 = ler.nextInt();

        System.out.println("Numeros sao: " + ((n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10));

    }
}