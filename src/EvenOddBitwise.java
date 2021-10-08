import java.util.Scanner;

/*even odd progrma using bitwise operator
*
* even no has last bit 0
* odd no has last bit 1
* if last bit is zero then 1*0 = 0 conditon for even no
* if last bit is 1 for then 1*1 =1 conditon for odd no
*
* */

public class EvenOddBitwise {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n&1)==0)
            System.out.println("even no");
        else
            System.out.println("odd no");
    }
}
