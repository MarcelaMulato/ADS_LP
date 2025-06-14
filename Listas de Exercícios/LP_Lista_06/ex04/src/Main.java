//4. Escreva uma função em Java para verificar se uma *String* é um palíndromo.
// A *String* deve ser digitada pelo usuário. Um palíndromo é uma palavra, frase
// ou sequência que se lê da mesma forma de trás para frente.
//Exemplos: “ovo”, “tenet”, “abasedotetodesaba”.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String smth;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite aqui alguma coisa: ");
        smth = in.nextLine();

        if (isPalindrome(smth)){
            System.out.print("É um palíndromo :D");
        }else{
            System.out.print("Não é um palíndromo :(");
        }
    }

    public static boolean isPalindrome(String smth){
        int start = 0, end = smth.length()-1;
        while (start < end){
            if(smth.charAt(start)!=smth.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}