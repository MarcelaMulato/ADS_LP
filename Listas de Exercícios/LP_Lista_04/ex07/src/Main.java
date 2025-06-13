//7. Criar um programa que quando executado exiba todas as tabuadas do 1 ao 10.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(i+" x "+j+" = "+ (i*j));
            }
            System.out.println("----------------------");
        }
    }
}