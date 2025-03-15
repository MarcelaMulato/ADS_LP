//15. Receber o raio e a altura de um cilindro e calcular seu volume.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, h, result;

        System.out.println("Digite o raio do cilindro: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        r = in.nextDouble();

        System.out.println("Digite a altura do cilindro: ");
        h = in.nextDouble();

        result = 2*3.14*r * (r+h);
        System.out.println("A área do cilindro é " + result);
    }
}