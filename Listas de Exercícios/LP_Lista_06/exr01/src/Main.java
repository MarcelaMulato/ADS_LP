//1. Escreva uma função que receba um número inteiro positivo N e retorne
// a soma de todos os números inteiros de 1 até N. Obs.: N deve ser maior que 0.
//Versão recursiva
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long num;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            num = in.nextLong();
        }while (num <= 0);
        System.out.print("\nA soma dos antecessores de " + num + " é " + somador(num));
    }

    public static long somador(long num){
        if(num==1)
          return 1;

        return num + somador(num-1);
    }
}