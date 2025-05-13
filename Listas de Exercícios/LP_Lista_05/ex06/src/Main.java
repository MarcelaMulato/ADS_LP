/*6. Declare e inicialize um vetor, em seguida inverta a sequência dos valores
armazenados neste mesmo vetor.
Restrição: utilizar apenas um vetor e uma variável auxiliar*/

public class Main {
    public static void main(String[] args) {
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i]+" ");
        }
    }
}