public class FindFrequency {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 1, 2, 3, 2, 9, 3, 9, 1, 2, 9, 4};
        int[] freq = new int[arr.length];                   //Array freq will store frequencies of element
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                    freq[j] = visited;                     //To avoid counting same element again
                }
            }
            if (freq[i] != visited)
                freq[i] = count;
        }
        System.out.println(" Element " + "occurance");     //Displays the frequency of each element present in array

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited)
                System.out.println("    " + arr[i] + "    " + freq[i]);
        }


    }
}
