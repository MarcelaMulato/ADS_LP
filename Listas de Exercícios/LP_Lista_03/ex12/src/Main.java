//12. Elaborar uma minicalculadora, o programa recebe 2 números e exibe
// um menu para que o usuário escolha a operação e em seguida exibe o resultado.
// Exemplo:
//
//    ```plaintext
//    Digite o primeiro numero: 2
//    Digite o segundo numero: 3
//    ------------------------------
//    Menu:
//        1. Soma
//        2. Subtracao
//        3. Multiplicacao
//        4. Divisao
//    ------------------------------
//    Escolha uma opcao: 3
//    ------------------------------
//    Resultado: 2.0 x 3.0 = 6.0
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, result;
        int option;

        Scanner in = new Scanner(System.in); //Configura o scanner

        System.out.println("Digite dois números separados por espaço:");
        num1 = in.nextDouble();
        num2 = in.nextDouble();

        System.out.println("------------------------------------" +
                "\nMENU" +
                "\n------------------------------------" +
                "\n1 - Soma" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão" +
                "\n------------------------------------" +
                "\nEscolha uma opção:");
        option = in.nextInt();
        switch (option){
            case 1:
                result = num1 + num2;
                System.out.println(num1+" + "+num2+" = "+result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println(num1+" - "+num2+" = "+result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println(num1+" * "+num2+" = "+result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println(num1+" / "+num2+" = "+result);
                break;
        }
    }
}