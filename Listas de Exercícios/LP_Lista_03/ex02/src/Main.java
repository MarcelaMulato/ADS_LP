//2. O usuário entra com dois números inteiros e o programa indica qual o maior.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        Scanner in = new Scanner(System.in); //Configura o scanner
        num1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        }else if (num2 > num1){
            System.out.println(num2 + " é maior que " + num1);
        }
        else{
            System.out.println("Os dois números são iguais!");
        }
    }
}