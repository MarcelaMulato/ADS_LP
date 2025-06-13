//4. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a média for maior
// ou igual a 50, exibir “Aprovado”, caso contrário solicitar ao usuário a nota da prova de recuperação,
// tirar nova média entre a média anterior e a prova de recuperação,se a nova média for menor que 50
// exibir “Reprovado” caso contrário exibir “Aprovado”.
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
        System.out.println("Sua média é " + media);

        if (media >= 50) {
            System.out.println("Aprovado!");
        } else {
            double n3, media2;

            System.out.println("Digite a sua nota de 1 a 100 da recuperação: ");
            n3 = in.nextDouble();

            media2 = media+n3/2;
            if (media2 < 50){
                System.out.println("Sua média é " + media2);
                System.out.println("Reprovado!");
            } else{
                System.out.println("Sua média é " + media2);
                System.out.println("Aprovado!");
            }
        }
    }
}