import java.util.List;
import java.util.Scanner;

public class EvenOddWithoutModuli {
    public static void main(String[] args) {

        while (true) {

            System.out.println("enter no");
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();

            if (n > 0) {
                for (long i = 0; i < n; i += 2) {
                    if (i + 2 == n) {
                        System.out.println("even number");
                        break;
                    } else {
                        if (i + 1 == n) {
                            System.out.println("odd number");
                            break;
                        }
                    }
                }
            }else if(n<0){
                for (long i = 0; i > n; i -= 2) {
                    if (i - 2 == n) {
                        System.out.println("even number");
                        break;
                    } else {
                        if (i - 1 == n) {
                            System.out.println("odd number");
                            break;
                        }
                    }
                }
            }else
                System.out.println("even no");
        }
    }
}

