import java.util.Scanner;

public class TicTacToe2 {

    public static char[] board = new char[10];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showBoard();
    }


    // UC1

    /**
     * Method to create a new game board.
     *
     * @return new empty game board
     */
    private char[] createBoard() {
        for (int i = 1; i < 10; i++) {
            board[i] = 0;
        }
        return board;
    }

    //UC2

    /**
     * Method to allow user to choose "x" or "o".
     */
    private static char[] getInput() {
        char x = 'x';
        char o = 'o';
        char[] output = {x, o};
        System.out.print("Please choose x or o-");
        String input = (sc.next()).toLowerCase();
        char mark = input.charAt(0);
        if (mark == x) {
            System.out.println("User has entered- " + x);
            output[0] = x;
            System.out.println("Computer has entered- " + o);
            output[1] = o;
        } else if (mark == o) {
            System.out.println("User has entered- " + o);
            output[0] = o;
            System.out.println("Computer has entered- " + x);
            output[1] = x;
        } else {
            System.out.println("Unknown entry. Defaulting to Player-x Computer-o");
        }
        return output;
    }

    //UC3

    /**
     * Method to print out board
     */
    private static void showBoard() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 4; j++) {
                    System.out.println(j + "." + board[i]);
                }

        }
    }

}
