//13. Receber o raio de um círculo e calcular sua área.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, result;

        System.out.println("Digite o raio: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        r = in.nextDouble();

        result = 3.14*(r*r);
        System.out.println("A área do círculo é " + result);
    }
}