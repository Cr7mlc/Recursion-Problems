/**
 *
 * Given a non-negative int n, return the sum of its digits recursively (no loops).
 *
 *
 *
 * */

public class SumOfDigits {

    public static int sumDigits(int n) {
        if(n==0) return 0;
        return  n%10 + sumDigits(n/10);
    }


        public static void main(String[] args) {
        System.out.println(sumDigits(8878));
    }
}
