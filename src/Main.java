import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static void main (String[] args){
//
//        int [] numbers = {23, 45, 67, 12, 67, 34};
//
//        String[] names = {"Juan", "Ana"};
//
////        out.println(numbers[2]);
////        out.println(names[0]);
//        for (int index =0; index < names.length; ++index){
//            out.println(names[index]);
//        }
//
//        for (String name:names){
//            out.println(name);
//        }
        int[] numbers = new int[10];
        boolean [] booleanArray = new boolean[100];

        numbers[5] = 70;
        numbers[2] =120;
//        numbers[12] = 89; genera error porque el array es de 10

        for (int number:numbers){
            out.println(number);
        }

        for (boolean flag : booleanArray){
            out.println(flag);
        }
        int [] [] integerMatrix = {
                {1, 2, 3},
                {4, 15, 6},
                {5, 8, 9},
                {6, 2, 3},
                {7, 2, 3}
        };

//        for(int[] array:integerMatrix){
//            out.println(array[0]);
//        }
        out.println(integerMatrix[1][1]);

//        int [][] checkersBoard = new int[8][8];

        int [][] checkersBoard = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
        };

        out.println(checkersBoard[7][7]);




    }




}
