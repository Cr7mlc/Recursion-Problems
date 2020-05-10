/**
 *
 *
 *
 *
 Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
 except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4
 *
 *
 * */

public class Count8 {

    public static int count8(int n) {

        int count = 0;
        if (n == 0) return 0;

        if (n % 10 == 8) {
            count++;
        }
        if (n % 100 == 88) {
            return 2 + count8(n / 10);
        }
        return count + count8(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(count8(8878));// return 4
        System.out.println(count8(878));// returns 2
        System.out.println(count8(88)); // returns 3
    }
}
