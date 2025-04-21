//8. O usuário entra com um número inteiro e o programa indica se o número é ímpar ou par.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
    }
}