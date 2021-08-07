package MineSweeperGame;

import java.util.concurrent.ThreadLocalRandom;

public class Simulator extends AbstractClass {

    /*
     * Initializes the game with the coordinates
     */
    Simulator(int rows, int cols, int numMines) {
        AbstractClass.rows = rows;
        AbstractClass.cols = cols;
        AbstractClass.numMines = numMines;
        numMinesDup = numMines;
    }


    /*
     * Game simulator
     */
    public static void main(String[] args) {

        int randomRow = ThreadLocalRandom.current().nextInt(5, 11);
        int randomCol = ThreadLocalRandom.current().nextInt(5, 11);
        int randomMineNum = ThreadLocalRandom.current().nextInt(0, (randomCol * randomRow) / 2 + 1);
        Simulator simulator = new Simulator(randomRow, randomCol, randomMineNum);
        BoardGenerator board = new BoardGenerator();
        CluesGenerator clues = new CluesGenerator();
        board.generateBoard();
        board.generateHiddenBoard();
        int numOfFieldsOnly = rows * cols - numMinesDup;

        while (true) {
            board.printBoard();
            System.out.println("Please choose a cell");
            int cellRow = scanner.nextInt();
            int cellCol = scanner.nextInt();

            if (mineField[cellRow][cellCol]) {
                System.out.println("Game Over!");
                break;
            } else {
                clues.generateSingleClue(cellRow, cellCol);
                numOfFieldsOnly--;
            }
            if (numOfFieldsOnly == 0) {
                System.out.println("Gg wp");
                break;
            }
        }

    }

}
