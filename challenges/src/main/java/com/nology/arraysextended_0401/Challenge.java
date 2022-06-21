package com.nology.arraysextended_0401;

/**
 *   All challenges in this repository are separated into three levels: Foundation, Intermediate, and Advanced.
 *   The expectation is to complete all Foundation level challenges, with Intermediate and upwards pushing your knowledge
 *   and may require you to google things in order to solve them. If you find an answer online somewhere, be kind and
 *   share it with the group!
 */
public class Challenge {

    /**
     *  All of the challenges in the this folder are focused on working with a multidimensional array / nested array.
     *  This is to mimic the grid of a noughts and crosses game. That is why we are using this data structure.
     *
     * KEY
     * - -1 = (No Move)
     * - 0 = (Naught)
     * - 1 = (Cross)
     *
     * EXAMPLE
     *  int[][] game = {{1, 1, 0},
     *                  {1, 0, 1},
     *                  {-1, 0, -1}}
     *
     * HINT: You may have to use a nested for loop to loop through the nested array.
     * https://www.programiz.com/java-programming/nested-loop
     */
    public Challenge() {}

    // -------------- FOUNDATION --------------

    /**
     * Calculate how many crosses are in the given game
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return count of all the Crosses (1's) in the given game
     */
    public int calculateCrosses(int[][] game) {
        int count = 0;

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                if (game[i][j] == 1) {
                    count += 1;
                }
            }
        }

        return count;
    }

    /**
     * Calculate how many moves (noughts and crosses) are in the given game.
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return count of the noughts (0's) and crosses (1's) in the given game
     */
    public int calculateMoves(int[][] game) {
        int count = 0;

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                if (game[i][j] == 1 || game[i][j] == 0) {
                    count += 1;
                }
            }
        }

        return count;
    }

    /**
     * Calculate percentage of used squares in the given game.
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return float the percentage of used squares
     */
    public float calculateMovesPercentage(int[][] game) {
        float count = 0;

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                if (game[i][j] != -1) {
                    count += 1;
                }
            }
        }

        return (count / 9 * 100);
    }

    // -------------- INTERMEDIATE --------------


    /**
     * Checks if the given player has won "horizontally" in the given game.
     *
     * Don't check for vertical or diagonal wins just yet
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the given player has horizontally won or not
     */
    public boolean hasPlayerWonHorizontal(int[][] game, int player) {
        for (int i = 0; i < game.length; i++) {
            if (game[i][0] == player && game[i][1] == player && game[i][2] == player) {
                return true;
            }

        }

        return false;
    }

    /**
     * Checks if the given player has won "vertically" in the given game.
     *
     * Don't check for diagonal wins just yet
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the player has vertically won or not
     */
    public boolean hasPlayerWonVertical(int[][] game, int player) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < game[i].length; j++) {
                if (game[i][j] == player && game[i+1][j] == player && game[i+2][j] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the given player has won "diagonally" in the given game.
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @param player - 0 (Naught) or 1 (cross)
     * @return If the player has diagonally won or not
     */
    public boolean hasPlayerWonDiagonally(int[][] game, int player) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                if (game[i][j] == player && game[i+1][j+1] == player && game[i+2][j+2] == player) {
                    return true;
                } else if (game[i+2][j] == player && game[i+1][j+1] == player && game[i][j+2] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    // -------------- ADVANCED --------------

    /**
     * Checks if any player has won the game, and return the player which won
     *
     * @param game - Two Dimensional arrays contains -1 (No Move), 0 (Naught), 1 (Cross)
     * @return The player who won, or -1 if no player won
     */
    public int getWinningPlayer(int[][] game) {
        // ..... Who can solve this? ;)
        if (hasPlayerWonDiagonally(game,1) || hasPlayerWonHorizontal(game, 1) || hasPlayerWonVertical(game, 1)){
            return 1;
        } else if (hasPlayerWonDiagonally(game,0) || hasPlayerWonHorizontal(game, 0) || hasPlayerWonVertical(game, 0)){
            return 0;
        }
        return -1;
    }
}
