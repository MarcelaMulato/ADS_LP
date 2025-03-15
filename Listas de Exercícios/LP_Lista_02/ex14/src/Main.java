//14. Receber a base e a altura de um triângulo retângulo e calcular sua área.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, h, result;

        System.out.println("Digite o tamanho da base do triângulo: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        b = in.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        h = in.nextDouble();

        result = (b*h)/2;
        System.out.println("A área do triângulo é " + result);
    }
}