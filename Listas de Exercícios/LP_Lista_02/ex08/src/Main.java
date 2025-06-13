//8. Ler uma medida em polegadas e converter para milímetros.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mp, result;

        System.out.println("Digite uma medida em polegadas: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        mp = in.nextDouble();

        result = mp * 25.4;
        System.out.println("A medida " + mp + " polegadas em milímetros é " + result);
    }
}