import java.util.Scanner;

public class Exercicio 2 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o Primeiro Valor: ");
        int primeiroValor = ler.nextInt();
        System.out.println("Informe o Segundo Valor: ");
        int segundoValor = ler.nextInt();
        System.out.println("Informe o terceiro Valor: ");
        int terceiroValor = ler.nextInt();

        if (terceiroValor > primeiroValor && segundoValor > terceiroValor) {
            System.out.println("O maior numero e " + segundoValor);
        } else if (segundoValor > primeiroValor && segundoValor > terceiroValor) {
            System.out.println("Os maiores numero e: " + terceiroValor);
        } else if (primeiroValor > terceiroValor && primeiroValor > segundoValor) {
            System.out.println("Os maiores numeros sao: " + primeiroValor);
        } else {
            System.out.println("O maior numero e: " + terceiroValor);
        }


    }
}