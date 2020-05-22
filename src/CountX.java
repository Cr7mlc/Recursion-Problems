/***
 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 *
 *countX("xxhixx") → 4
 *countX("xhixhix") → 3
 *countX("hi") → 0
 *
 */



public class CountX {

    public static int countX(String str) {
        char[] a = str.toCharArray();
        int i = 0;
        if(i!=str.length()){
            if(a[i] == 'x'){
                return 1 + countX(str.substring(1));
            }else{
                return countX(str.substring(1));
            }
        }
        return 0;

    }

    public static void main(String[] args){

        System.out.println(countX("xhixhix"));


    }

}
