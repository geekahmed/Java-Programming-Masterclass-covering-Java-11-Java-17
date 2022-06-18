public class Ex14 {
    public static void main(String[] args) {
        
    }
    public static boolean isOdd(int number){
        if (number < 0) return false;
        return number % 2 != 0;
    }
    public static int sumOdd(int start, int end){
        if (start > end || start < 0 || end < 0) return -1;
        int result = 0 ;
        for(int i = start; i <= end; i++){
            if(isOdd(i)) result += i;
        }
        return result;
    }
}
