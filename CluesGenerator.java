package MineSweeperGame;

public class CluesGenerator extends AbstractClass {

    /*
     * Creates a single field's clues number
     */
    public void generateSingleClue(int row, int col) {
        boardPieces[row][col] = String.valueOf(countMines(row, col));
    }

    /*
     * Counts the number of mines around a non-mine field
     */
    public int countMines(int r, int c) {
        int count = 0;
        //if the cell is a mine
        if (mineField[r][c])
            return -1;
            //if the cell is in the left corner of the northern edge
        else if (r < 1 && c < 1 && !mineField[r][c]) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (mineField[i][j])
                        count++;
                }
            }
        }
        //if the cell is in the right corner of the northern edge
        else if (r < 1 && c + 1 == cols && !mineField[r][c]) {
            for (int i = 0; i < 2; i++) {
                for (int j = -1; j < 1; j++) {
                    if (mineField[r + i][c + j])
                        count++;
                }
            }
        }
        //if the cell is in the left bottom corner
        else if (r + 1 >= rows && c < 1 && !mineField[r][c]) {
            for (int i = -1; i < 1; i++) {
                for (int j = 0; j < 2; j++) {
                    if (mineField[r + i][c + j])
                        count++;
                }
            }
        }
        //if the cell is in the right bottom corner
        else if (r + 1 >= rows && c + 1 >= cols && !mineField[r][c]) {
            for (int i = -1; i < 1; i++) {
                for (int j = -1; j < 1; j++) {
                    if (mineField[r + i][c + j])
                        count++;
                }
            }
        }

        //if the cell is in the  Northern edge
        else if (r < 1 && !mineField[r][c]) {
            for (int i = 0; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (mineField[r + i][c + j])
                        count++;
                }
            }
        }
        //if the cell is in the Southern edge
        else if (r + 1 >= rows && !mineField[r][c]) {
            for (int i = -1; i < 1; i++) {
                for (int j = -1; j < 2; j++) {
                    if (mineField[r + i][c + j])
                        count++;
                }
            }
        }
        //if the cell is on the Right edge
        else if (c + 1 >= cols && !mineField[r][c]) {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 1; j++) {
                    if (mineField[r + i][c + j])
                        count++;
                }
            }
        }
        //if the cell is on Left edge
        else if (c < 1 && !mineField[r][c]) {
            for (int i = -1; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (mineField[r + i][c + j])
                        count++;
                }
            }
        }
        //if the cell is in the middle
        else if (!mineField[r][c]) {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (mineField[r + i][c + j])
                        count++;
                }
            }
        }

        return count;
    }

}
