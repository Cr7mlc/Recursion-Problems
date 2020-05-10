/***
 *
 *Given a non-negative int n, return the count of the occurrences of 7 as a digit,
 *
 *so for example 717 yields 2
 *
 */


public class Count7 {
    public static int count7(int n) {
        int count = 0;

        if(n== 0) return 0;

        if(n%10== 7){
            count++;
        }

        return count+count7(n/10);

    }

    public static void main(String[] args) {
        System.out.println(count7(7547867)); // returns3
    }
}
