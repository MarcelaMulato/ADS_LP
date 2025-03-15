//7. Ler uma medida em milímetro e converter para polegadas.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mm, result;

        System.out.println("Digite a uma medida em milímetro: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        mm = in.nextDouble();

        result = mm / 25.4;
        System.out.println("A medida " + mm + " mm em polegadas é " + result);
    }
}