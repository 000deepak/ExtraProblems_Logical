/*
*   Program to find the first n numbers whose factors are perfect square.
*   @deepak  7/10/21
*
*
* */
public class PerfectSquare20 {
    public static void main(String[] args) {

        int i = 0;
        int whileCount = 0;                                    // total numbers needed.

        while (whileCount <= 20) {
            i++;
            int count = 0;

            for (int j = 2; j < i/2 ; j++) {
                if (i % j == 0) {                               //check for factors
                    if (isPerfectSquare(j))                     //check for perfect square factors
                        count += 1;
                }

            }
            if (count > 2) {                                  //check for min two perfect squar factors
                System.out.println(i);                         //print the number
                whileCount++;
            }

        }
    }

    static boolean isPerfectSquare(int n) {
        boolean t = true;
        for (int l = 1; l < n; l++) {
            if (l * l == n) {
                t = true;
                break;
            }else
                t =  false;
        }
        return t;
    }
}
