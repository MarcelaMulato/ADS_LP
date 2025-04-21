//5. Elabore um programa que calcule a média de um aluno e imprima o conceito:
//A se a média >= 8.5
//B se a média >= 7 e média < 8.5
//C se a média >= 5 e média < 7
//D se a média < 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;

        System.out.println("Digite a primeira nota de 1 a 10: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota de 1 a 10: ");
        n2 = in.nextDouble();

        media = (n1+n2)/2;

        if (media >= 8.5) {
            System.out.println("A");
        } else if (media >= 7){
            System.out.println("B");
        } else if (media >= 5){
            System.out.println("C");
        } else{
            System.out.println("D");
        }
    }
}