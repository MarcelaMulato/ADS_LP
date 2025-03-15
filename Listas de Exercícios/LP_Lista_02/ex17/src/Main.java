//17. Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vi, a, t, result;

        System.out.println("Digite a velocidade inicial: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        vi = in.nextDouble();

        System.out.println("Digite a aceleração: ");
        a = in.nextDouble();

        System.out.println("Digite o tempo: ");
        t = in.nextDouble();

        result = vi + a * t;
        System.out.println("A velocidade do percurso é " + result);
    }
}