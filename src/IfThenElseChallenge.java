public class IfThenElseChallenge {
    public static void main(String[] args) {

        boolean isGameOver = true;
        int score = 900;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score = " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score;

        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score = " + finalScore);
        }
    }
}
