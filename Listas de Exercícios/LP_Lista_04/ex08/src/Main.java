//8. Criar um programa onde o usuário entra com um número e
// o programa diz se o número digitado é primo ou não.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cont = 0, num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        num = scanner.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                cont++;
                break;
            }
        }

        if (cont == 0) {
            System.out.println("Seu número é primo");
        }else{
            System.out.println("Seu número não é primo");
        }

    }
}