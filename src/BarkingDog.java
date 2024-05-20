public class BarkingDog {

    public static void main(String[] args) {
        shouldWakeUp(true, 23);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && hourOfDay >= 0 && (hourOfDay < 8 || hourOfDay > 22) && hourOfDay <= 23) {
            return true;
        } else {
            return false;
        }
    }

//    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//        if(hourOfDay < 0 || hourOfDay > 23) {
//            return false;
//        }
//
//        return (barking && (hourOfDay < 8 || hourOfDay > 22));
//
//    }
}
