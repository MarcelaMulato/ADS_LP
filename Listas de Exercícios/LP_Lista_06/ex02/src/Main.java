//2. Implemente uma função para calcular o fatorial de um número inteiro
// N digitado pelo usuário.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            num = in.nextInt();
        }while (num <= 0);
            System.out.print("\nO fatorial de " + num + " é " + fatorador(num));
    }

    public static long fatorador(int num){
        long resultado = 1;
        for (int i = 1; i <= num; i++){
            resultado = resultado * i;
        }
        return resultado;
    }
}