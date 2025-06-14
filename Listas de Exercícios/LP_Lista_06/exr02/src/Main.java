//2. Implemente uma função para calcular o fatorial de um número inteiro
// N digitado pelo usuário.
// Versão recursiva

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = in.nextInt();

        System.out.print("\nO fatorial de " + num + " é " + fatorador(num));
    }

    public static long fatorador(int num){
        if(num==1 || num==0)
            return 1;

        return num * fatorador(num-1);
    }
}