public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ravi", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Ram", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Peter", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("John", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int playerPosition = 4;
        if (playerScore >= 1000) {
            playerPosition = 1;
        } else if (playerScore >= 500) {
            playerPosition = 2;
        } else if (playerScore >= 100) {
            playerPosition = 3;
        }

        return playerPosition;
    }
}
