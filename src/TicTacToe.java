import java.util.Scanner;

public class TicTacToe {
    static Scanner sc = new Scanner(System.in);
    static char currentPlayer;
    static char winner;
    static int p;
    static int q;


    static char[][] matrix = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };


    public static void main(String[] args) {
        currentPlayer='x';
        while (!tie()) {

            while (winner != currentPlayer) {
                System.out.println("your symbol is x ");
                currentPlayer = 'x';
                askUser();
                //markMove(p,q);
                winner();
                break;
            }
            while (winner != currentPlayer) {
                System.out.println("your symbol is 0 ");
                currentPlayer = 'o';
                computerMove();
                winner();
                break;
            }
        }
    }

    public static void showBoard() {

        for (int i = 0; i < matrix.length; i++) {               //this equals to the row in our matrix.
            for (int j = 0; j < matrix[i].length; j++) {        //this equals to the column in each row.
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();                        //change line on console as row comes to end in the matrix.
        }
    }

    public static void markMove(int p, int q) {
        if (matrix[p][q] == ' ') {
            if (currentPlayer == 'x') {
                matrix[p][q] = 'x';
                System.out.println("move of x marked at" + p + q);
                showBoard();
            } else {
                matrix[p][q] = 'o';
                System.out.println("move of o marked at" + p + q);
                showBoard();
            }
        } else {
            if (!tie()) {
                System.out.println("entered position is occupied");
                if (currentPlayer == 'x') {
                    askUser();
                } else {
                    computerMove();
                }
            }
        }
    }

    public static void winner() {
        if (matrix[0][0] != ' ' && matrix[0][1] != ' ' && matrix[0][2] != ' ' && matrix[1][0] != ' ' && matrix[1][1] != ' '
                && matrix[1][2] != ' ' && matrix[2][0] != ' ' && matrix[2][1] != ' ' && matrix[2][2] != ' ') {

            if (((matrix[0][0] == matrix[0][1]) && (matrix[0][1] == matrix[0][2])) ||
                    ((matrix[1][0] == matrix[1][1]) && (matrix[1][1] == matrix[1][2])) ||
                    ((matrix[2][0] == matrix[2][1]) && (matrix[2][1] == matrix[2][2])) ||
                    ((matrix[0][0] == matrix[1][0]) && (matrix[1][0] == matrix[2][0])) ||
                    ((matrix[0][1] == matrix[1][1]) && (matrix[1][1] == matrix[2][1])) ||
                    ((matrix[0][2] == matrix[1][2]) && (matrix[1][2] == matrix[2][2])) ||
                    ((matrix[0][0] == matrix[1][1]) && (matrix[1][1] == matrix[2][2]))) {
                winner = currentPlayer;
                System.out.println("winner is " + winner);
            }
        }
    }

    public static boolean tie() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == ' ') {
                    count += 1;
                    break;
                }
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }


    }

    public static void computerMove() {
        int p = (int) Math.floor((Math.random() * 10) % 3);
        int q = (int) Math.floor((Math.random() * 10) % 3);
        markMove(p, q);
    }

    public static void askUser() {
        /*System.out.println("mark move at \n11 12 13\n 21 22 23 \n 31 32 33");
        System.out.println("enter first digit");
        p = sc.nextInt();
        System.out.println("enter second digit");
        q = sc.nextInt();*/
        int p = (int) Math.floor((Math.random() * 10) % 3);
        int q = (int) Math.floor((Math.random() * 10) % 3);
        markMove(p, q);
    }

}




