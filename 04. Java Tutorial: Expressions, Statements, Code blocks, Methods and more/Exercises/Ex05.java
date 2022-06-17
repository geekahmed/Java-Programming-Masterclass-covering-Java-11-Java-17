public class Ex05 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){
        return Math.abs(d1 - d2) <= 0.0009;
    }
}
