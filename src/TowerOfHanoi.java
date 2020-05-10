/**
 *
 *
 * The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
 *
 * Only one disk can be moved at a time.
 * Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
 * No larger disk may be placed on top of a smaller disk.
 * With 3 disks, the puzzle can be solved in 7 moves. The minimal number of moves required to solve a Tower of Hanoi puzzle is 2n − 1, where n is the number of disks.
 *
 *
 * */

public class TowerOfHanoi {

    public static void solve(int n, char from , char to , char auxMiddle){

        if(n == 1){
            System.out.println("Moving disc " + 1 + " to "+ to);
        }else {
            solve(n-1,from, auxMiddle,to);
            System.out.println("Moving disc " +n+ " from " + from + " to " + to );
            solve(n-1,auxMiddle, to,from);
        }

    }


    public static void main(String[] args) {
        solve(3, 'A','C','B');
    }
}
