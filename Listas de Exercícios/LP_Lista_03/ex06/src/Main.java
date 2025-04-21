//6. Em um sistema de caixa eletrônico o usuário deve escolher entre as opções de um menu escolhendo
// um número inteiro entre 5 e 9 inclusive. Crie um algoritmo que valide a entrada do usuário
// exibindo a opções escolhida ou a mensagem de opção inválida caso o usuário entre com um número
// fora do range estabelecido.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num;

        System.out.println("Digite o seu número de entrada entre 5 e 9: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        num = in.nextDouble();

        if (num >= 5 && num <= 9) {
            System.out.println("Você escolheu: "+num);
        } else{
            System.out.println("Valor inválido! Tente novamente.");
        }
    }
}