package MineSweeperGame;

import java.util.Random;
import java.util.Scanner;

public abstract class AbstractClass {

    /*
    * These are all the attributes that are used in this game
    */
    protected static boolean[][] mineField;
    protected static int rows;
    protected static int cols;
    protected static int numMines;
    protected static int numMinesDup = numMines;
    protected static String[][] boardPieces;

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


}
