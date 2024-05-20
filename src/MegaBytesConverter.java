public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByteValue = kiloBytes / 1024;
            int remainingKiloByteValue = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaByteValue + " MB and " + remainingKiloByteValue + " KB");
        }
    }
}
