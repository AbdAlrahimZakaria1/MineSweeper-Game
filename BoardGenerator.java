package MineSweeperGame;

public class BoardGenerator extends AbstractClass{

     /* Generates the mineField
     *
     * @param int numMines Number of mines to be placed on the mineField
     *
     * @return boolean[][] Game board with mines placed at random position
     */

    public void generateBoard() {
        mineField = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mineField[i][j] = false;
            }
        }

        while (numMines != 0) {        //this loop creates mines in the board at random places
            int tempI = random.nextInt(rows);
            int tempJ = random.nextInt(cols);
            if (!mineField[tempI][tempJ]) {        //checks if the current place is a mine or not
                mineField[tempI][tempJ] = true;
                numMines--;
            }
        }
        for (int i = 0; i < rows; i++) {  //this loop displays the minefield
            for (int j = 0; j < cols; j++) {
                System.out.print(mineField[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*
    * Replaces all fields with a '-' sign
    */
    public void generateHiddenBoard(){
        boardPieces =  new String[rows][cols];
        for(int i=0;i< rows;i++){
            for(int j=0;j<cols;j++) {
                boardPieces[i][j] = "-";
            }
        }
    }
    /*
    * @return Prints all fields (Covered/Uncovered) into the console
    */
    public void printBoard(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(boardPieces[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
