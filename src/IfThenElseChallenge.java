public class IfThenElseChallenge {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 900, 5, 100);
        System.out.println("Your HighScore = " + highScore);

        System.out.println("Your score = " + calculateScore(true, 10000, 8, 200));

    }

    //void method

//    public static void calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {
//
//        int finalScore = score;
//
//        if (isGameOver) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score = " + finalScore);
//        }
//    }

    //return type function
    public static int calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
}
