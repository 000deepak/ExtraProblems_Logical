import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 90};
        int[] rev = new int[10];
        int j =0;
        for (int i = arr.length - 1; i > 0; i--) {
            rev[j] = arr[i];
            j=j+1;
        }System.out.println(Arrays.toString(rev));
    }
}
