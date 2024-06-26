public class GameManager {

    static String gameStatus = null;
    static Boolean gameEnd = null;
    // Create a Player array to return both the current player and the other, non-current player.
    static Player[] PlayersArray = new Player[2];


    // Temporary method that I may or may not use.
    static public void startGame() {

    }

    static public void getGameStatus(String status) {
        gameStatus = status;
    }

    /*
     * Conditions to end the game given the status as reported back from the GameInitializer class.
     */
    static public Boolean gameOver(String gameStatus) {
        if (gameStatus.equals("Game Over")) {
            gameEnd = true;
        }
        else {
            gameEnd = false;
        }

        return gameEnd;
    }

    static void switchTurn(Player currentPlayer, Player otherPlayer) {
        /* Swap by assigning the currentPlayer object to a temp Player object.
        * Then, assigning currentPlayer to the otherPlayer since it is no longer their turn.
        * Finally, assign otherPlayer to the temp object, which holds the previous currentPlayer object.
        */
        Player hold = currentPlayer;
        currentPlayer = otherPlayer;
        otherPlayer = hold;

        PlayersArray[0] = currentPlayer;
        PlayersArray[1] = otherPlayer;
    }

}

 /* TODO:
        - You will need to figure out how to handle moves when the currentPlayer cannot make a move a la Pokemon but that comes later.
     */

