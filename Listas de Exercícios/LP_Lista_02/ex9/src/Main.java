//9. Ler uma medida de distância em quilômetros e converter para milhas.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dist, result;

        System.out.println("Digite a uma medida em km: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        dist = in.nextDouble();

        result = dist / 1.60934;
        System.out.println("A distância " + dist + " km em milhas é " + result);
    }
}