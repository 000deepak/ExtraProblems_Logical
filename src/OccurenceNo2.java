/*
 * Program to count the occurence of each element
 * @deepak
 *
 *
 * */
public class OccurenceNo2 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 1, 2, 3, 2, 9, 3, 9, 1, 2, 9, 4};
        String[] filterd = new String[a.length];                        // by default null
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {                                     //condition to count
                    count += 1;                                         //count ocuurence
                }

            }
            if (is_Not_Counted(filterd, a[i])) {                       //check if already counted
                filterd[index] = String.valueOf(a[i]);
                System.out.println(a[i] + "  " + "ocurred" + "  " + count + "  " + "times");
                index++;
            }
        }
    }

    private static boolean is_Not_Counted(String[] filterd, int valueToBeChecked) {
        for (String i : filterd) {
            if (i != null) {                                    // to check if element is non zero
                if (Integer.parseInt(i) == valueToBeChecked)    //convert string to integer to & compare
                    return false;
            }
        }
        return true;
    }
}

