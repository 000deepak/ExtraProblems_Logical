public class Spiral2D {
    public static void main(String[] args) {
        int n;
        Integer[][] matrix = new Integer[][]{{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16}};

        for (int i = 0; i > matrix.length-4; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
