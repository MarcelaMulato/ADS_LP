//3. Ler um número real e exibir a quinta parte deste número.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Digite um número real: ");

        Scanner in = new Scanner(System.in); //Configura o scanner
        number = in.nextInt();

        result = number / 5;
        System.out.println("A quinta parte de " + number + " é " + result);
    }
}