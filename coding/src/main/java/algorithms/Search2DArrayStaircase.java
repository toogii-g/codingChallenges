package algorithms;

/**
 * Staircase search
 */
public class Search2DArrayStaircase {

    public void search(int[][] nums, int key) {
        int rows = nums.length;
        int cols = nums[0].length;
        int i = 0;
        int j = cols - 1;

        while (i < rows && j >= 0) {
            if (nums[i][j] == key) {
                System.out.println("Found: " + i + "," + j);
                return;
            }
            if (nums[i][j] < key) {
                i++;
            } else {
                j--;
            }

        }
        System.out.println("Not Found");
    }


}
