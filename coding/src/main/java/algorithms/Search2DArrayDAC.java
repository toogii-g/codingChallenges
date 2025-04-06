package algorithms;

public class Search2DArrayDAC {

    public void search(int[][] nums, int key) {
        String result = dac(nums, 0, 0, nums.length - 1, nums[0].length - 1, key);
        if (result == null) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found: " + result);
        }
    }

    public String dac(int[][] nums, int firstX, int firstY, int lastX, int lastY, int key) {
        if (firstX > lastX || firstY > lastY) {
                return null;

        }


        int midX = firstX + (lastX - firstX) / 2;
        int midY = firstY + (lastY - firstY) / 2;

        if (nums[midX][midY] == key) {
            return midX + "," + midY;
        }

        if (nums[midX][midY] < key) {
            String r = dac(nums, firstX, midY+1, midX, lastY, key);
            if (r != null) {
                return r;
            }

            r = dac(nums, midX+1, midY+1, lastX, lastY, key);
            if (r != null) {
                return r;
            }
            return dac(nums, midX+1, firstY, lastX, midY, key);

        } else {
            String r = dac(nums, firstX, firstY, midX-1, midY-1, key);
            if (r != null) {
                return r;
            }
            r = dac(nums, firstX, midY+1, midX-1, lastY, key);
            if (r != null) {
                return r;
            }
            return dac(nums, midX+1, firstY, lastX, midY-1, key);
        }
    }

}
