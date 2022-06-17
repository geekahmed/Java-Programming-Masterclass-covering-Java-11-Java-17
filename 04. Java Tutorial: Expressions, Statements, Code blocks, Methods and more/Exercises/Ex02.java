public class Ex02 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int mb_quantity = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        System.out.printf("%d KB = %d MB and %d KB", kiloBytes, mb_quantity, remainder);
    }
}
