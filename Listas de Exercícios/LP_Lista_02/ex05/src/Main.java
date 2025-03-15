//5. Ler uma velocidade em km/h e converter para m/s.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vel, result;

        System.out.println("Digite a velocidade em km/h: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        vel = in.nextDouble();

        result = vel / 3.6;
        System.out.println("A velocidade " + vel + " km/h em m/s é " + result);
    }
}