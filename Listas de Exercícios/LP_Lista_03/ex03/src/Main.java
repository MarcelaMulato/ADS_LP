//3. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a média for menor que 50 imprimir “Reprovado” caso contrário imprimir “Aprovado”.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;

        System.out.println("Digite a primeira nota de 1 a 100: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota de 1 a 100: ");
        n2 = in.nextDouble();

        media = (n1+n2)/2;

        if (media < 50) {
            System.out.println("Sua média é " + media);
            System.out.println("Reprovado!");
        }else{
            System.out.println("Aprovado!");
        }
    }
}