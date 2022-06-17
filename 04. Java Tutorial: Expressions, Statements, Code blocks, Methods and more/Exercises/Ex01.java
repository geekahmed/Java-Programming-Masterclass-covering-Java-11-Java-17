public class Ex01 {
    public static void main(String[] args) {
            printConversion(1.2);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) System.out.println("Invalid Value");
        else {
            long roundedConversion = toMilesPerHour(kilometersPerHour);
            System.out.printf("%f km/h = %d mi/h", kilometersPerHour, roundedConversion);
        }
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;
        
        return Math.round(1.609 * kilometersPerHour);
    }
    
}
