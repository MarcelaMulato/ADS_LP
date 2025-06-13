//10. Ler uma medida de distância em milhas e converter para quilômetros.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dist, result;

        System.out.println("Digite uma medida em milhas: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        dist = in.nextDouble();

        result = dist * 1.60934;
        System.out.println("A distância " + dist + " milhas em km é " + result);
    }
}