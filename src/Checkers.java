import java.io.PrintStream;
import java.util.Scanner;

public class Checkers {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    static int [][] checkersBoard = {
            {2, 0, 2, 0, 2, 0, 2, 0},
            {0, 2, 0, 2, 0, 2, 0, 2},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
    };

    public static String printBoardState(int[][] board){
        String output ="";
        for (int[] row: checkersBoard){
            for (int element: row){
                output += "|"+ element + "|\t";
            }
            output += "\n";
        }
        return output;
    }

    public static void movePiece(int originRow, int originColumn, int destRow, int destColumn, int [][] board){
        board[destRow][destColumn] = board[originRow][originColumn];
        board[originRow][originColumn]=0;
    }

    public static void main(String[] args){

        out.println(printBoardState(checkersBoard));
        movePiece(6, 0, 5, 1, checkersBoard);
        out.println(printBoardState(checkersBoard));

    }
}
