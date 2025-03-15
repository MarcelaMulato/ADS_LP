//16. Receber o raio e a altura de um cone e calcular seu volume.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, g, result;

        System.out.println("Digite o raio do cone: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        r = in.nextDouble();

        System.out.println("Digite a geratriz do cone: ");
        g = in.nextDouble();

        result = 3.14 * r * (r + g);
        System.out.println("A área do cilindro é " + result);
    }
}