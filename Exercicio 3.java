import java.util.Scanner;

public class Exercicio 3 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o Primeiro valor: ");
        int primeiroValor = ler.nextInt();
        System.out.println("Informe o Segundo valor: ");
        int segundoValor = ler.nextInt();
        System.out.println("Informe o Terceiro valor: ");
        int terceiroValor = ler.nextInt();

        if(terceiroValor < primeiroValor && primeiroValor < segundoValor) {
            System.out.println("Os maiores numeros sao: " + primeiroValor + " e " + segundoValor + " Soma: " + (primeiroValor+segundoValor));
        } else if (segundoValor < primeiroValor && primeiroValor < terceiroValor) {
            System.out.println("Os maiores numeros sao: " + primeiroValor + " e " + terceiroValor + " Soma: " + (primeiroValor+terceiroValor));
        } else if (primeiroValor > terceiroValor) {
            System.out.println("Os maiores numeros sao: " + primeiroValor + " e " + terceiroValor + " Soma: " + (primeiroValor+terceiroValor));
        } else {
            System.out.println("Os maiores numeros sao: " + segundoValor + " e " + terceiroValor + " Soma: " + (segundoValor+terceiroValor));
        }
    }
}