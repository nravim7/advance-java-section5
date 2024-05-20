public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));

    }

//    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
//        long firstNumberDecimals = (long) firstNumber / 1;
//        long firstNumberDecimalsOp = (long) firstNumber % firstNumberDecimals;
//        long secondNumberDecimals = (long) secondNumber / 1;
//
//        System.out.println("First Number Decimals = " + firstNumberDecimals);
//        System.out.println("Second Number Decimals = " + secondNumberDecimals);
//
//        if (firstNumberDecimals == secondNumberDecimals) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstNumberDecimals = (int) (firstNumber * 1000);
        int secondNumberDecimals = (int) (secondNumber * 1000);

        System.out.println("First Number Decimals = " + firstNumberDecimals);
        System.out.println("Second Number Decimals = " + secondNumberDecimals);

        if (firstNumberDecimals == secondNumberDecimals) {
            return true;
        } else {
            return false;
        }
    }
}
