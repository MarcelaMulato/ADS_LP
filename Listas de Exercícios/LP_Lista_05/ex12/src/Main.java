//12. Declare e inicialize uma matriz 3x3 e calcule a sua determinante.

public class Main {
    public static void main(String[] args) {
        int [][] matriz =
                {{1,2,3}, {0,9,4}, {1,7,2}};

        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //cálculo das diagonais principais
        int dp1 = matriz[0][0] * matriz[1][1] * matriz[2][2];
        int dp2 = matriz[0][1] * matriz[1][2] * matriz[2][0];
        int dp3 = matriz[0][2] * matriz[1][0] * matriz[2][1];

        //cálculo das diagonais secundárias
        int ds1 = matriz[2][0] * matriz[1][1] * matriz[0][2];
        int ds2 = matriz[2][1] * matriz[1][2] * matriz[0][0];
        int ds3 = matriz[2][2] * matriz[1][0] * matriz[0][1];

        //determinante
        int det = 0;
        det = -(ds1 + ds2 + ds3) + (dp1 + dp2 + dp3);

        System.out.println("---------------------------");
        System.out.println("O determinante dessa matriz é: "+det);
    }
}