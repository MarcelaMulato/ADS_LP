//4. Crie um programa que armazene 10 números inteiros inseridos pelo
// usuário em um vetor. Em seguida, percorra o vetor e indique onde estão
// o maior e o menor número (imprima seus valores e suas posições no vetor).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int [10];
        int p1=0, p2=0;

        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, number;

        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            number = scanner.nextInt();

            if (number > maior){
                maior = number;
                p1 = i;
            }
            if (number < menor) {
                menor = number;
                p2 = i;
            }
        }

        System.out.println("---------------------------");
        System.out.println("O maior número é " + maior + "e ele está na posição " + p1 + " do vetor");
        System.out.println("O menor número é " + menor + "e ele está na posição " + p2 + " do vetor");

    }
}