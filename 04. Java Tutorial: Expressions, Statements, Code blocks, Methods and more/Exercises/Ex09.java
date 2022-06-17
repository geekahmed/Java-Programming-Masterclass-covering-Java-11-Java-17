public class Ex09 {
    public static void main(String[] args) {
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        long years = (((minutes / 60) / 24) / 365);
        long days = (((minutes / 60) / 24) % 365);
        System.out.printf("%d min = %d y and %d d", minutes, years, days);
    }
}
