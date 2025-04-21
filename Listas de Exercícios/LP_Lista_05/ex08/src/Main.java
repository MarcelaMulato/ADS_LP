//8. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal principal

public class Main {
    public static void main(String[] args) {
        int [][] numbers =
                {{1,2,3,4,5},
                {0,9,8,7,6},
                {1,1,1,4,5},
                {5,4,8,2,1},
                {9,7,8,7,9}};

        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------");
        System.out.println("A diagonal principal dessa matriz é: ");
        for (int i = 0; i < 5; i++){
            System.out.print(numbers[i][i] + " ");
            }
        System.out.println();
    }
}