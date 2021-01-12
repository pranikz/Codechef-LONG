import java.util.Arrays;

public class dp {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        Arrays.stream(arr).forEach(a -> Arrays.fill(a, -1));
        for (int i = 0; i < arr.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print('\n');

        }

    }

}
