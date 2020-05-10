/**
 *
 We have triangle made of blocks. The topmost row has 1 block,
 the next row down has 2 blocks, the next row has 3 blocks, and so on.
 *
 *
 *    triangle(0) → 0
 *    triangle(1) → 1
 *    triangle(2) → 3
 *    triangle(3) → 6
 *    triangle(4) → 10
 *    triangle(5) → 15
 *    triangle(6) → 21
 *    triangle(7) → 28
 *
 *
 * */


public class Triangle {

    public static int triangle(int rows) {
        if(rows == 0) return 0;
        if(rows == 1) return 1;

        return rows+triangle(rows-1);

    }

    public static void main(String[] args) {

        System.out.println(triangle(5));
        System.out.println(triangle(7));
        System.out.println(triangle(3));
    }


}
