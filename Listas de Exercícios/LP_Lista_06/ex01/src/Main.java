//1. Escreva uma função que receba um número inteiro positivo N e retorne
// a soma de todos os números inteiros de 1 até N. Obs.: N deve ser maior que 0.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            num = in.nextInt();
        }while (num <= 0);
        System.out.print("\nA soma dos antecessores de " + num + " é " + somador(num));
    }

    public static int somador(int num){
        int soma = 0;
        for (int i = num; i > 0; i--){
            soma = soma + i;
        };
        return soma;
    }
}