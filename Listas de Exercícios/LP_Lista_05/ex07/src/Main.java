//7. Receber uma matriz 5x5 e encontrar a maior soma entre suas colunas e a maior somaentre suas linhas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] [] numbers = new int [5][5];

        //usuário insere os valores da matriz
        System.out.println("Insira os valores da matriz 5x5:");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                numbers[i][j] = scanner.nextInt();
            }
        }

        //mostra a matriz inserida
        System.out.println("---------------------------");
        System.out.println("A matriz inserida foi: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        int maiorx = Integer.MIN_VALUE, maiory = Integer.MIN_VALUE;

        //soma os valores das linhas
        System.out.println("---------------------------");
        System.out.println("Soma da: ");
        for (int i = 0; i < 5; i++){
            int sum = 0;
            for (int j = 0; j < 5; j++){
                sum = sum + numbers[i][j];
            }
            if (sum > maiorx) {
                maiorx = sum;
            }
            System.out.println(i + 1 + "° linha: " + sum);
        }
        System.out.println("Maior soma entre as linhas: " + maiorx);

        //soma os valores das colunas
        System.out.println("---------------------------");
        System.out.println("Soma da: ");
        for (int i = 0; i < 5; i++){
            int sumy = 0;
            for (int j = 0; j < 5; j++){
                sumy = sumy + numbers[j][i];
            }
            if (sumy > maiory) {
                maiory = sumy;
            }
            System.out.println(i + 1 + "° coluna: " + sumy);
        }
        System.out.println("Maior soma entre as colunas: " + maiory);
    }
}