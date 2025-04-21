//1. Receba um número real e caso ele seja positivo imprima sua raiz quadrada, caso contrário imprima a mensagem: “Valor inválido!”
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num, raiz;

        System.out.println("Digite o seu número: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        num = in.nextDouble();

        if (num > 0) {
            raiz = Math.sqrt(num);
            System.out.println("A raiz quadrada de " + num + " é " + raiz);
        }else{
            System.out.println("Valor inválido!");
        }
    }
}