//5. Implemente uma função para realizar uma busca binária em um array ordenado de inteiros,
// retornando a posição do elemento buscado ou -1 se o elemento não for encontrado.
// A busca binária é um algoritmo eficiente para encontrar um elemento em um vetor ordenado.
// Ele funciona dividindo repetidamente o vetor pela metade e determinando em qual
// metade o elemento buscado pode estar presente.
// Versão recursiva
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = {7, 99, 25, 15, 50, 9, 1};
        Arrays.sort(array);

        Scanner in = new Scanner (System.in);

        System.out.println("Digite o número que deseja procurar:");
        int num = in.nextInt();

        int result = search(array, num, 0, array.length - 1);

        if(result != -1){
            System.out.println("O número digitado existe na posição: " + result);
        }else{
            System.out.println(-1);
        }
    }

    public static int search(int[] array, int num, int start, int end){
        if (start > end){
            return -1;
        }
        int numb = (start + end) / 2;

        if (array[numb] == num) {
            return numb;
        } else if (array[numb] > num) {
            return search(array, num, start, numb - 1);
        } else {
            return search(array, num, numb + 1, end);
        }
    }
}