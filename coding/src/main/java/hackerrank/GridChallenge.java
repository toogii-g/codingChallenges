package hackerrank;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    public static String gridChallenge(List<String> grid) {

        int[][] values = new int[grid.size()][grid.getFirst().length()];

        for(int i=0; i< grid.size();i++){
            char[] chars = grid.get(i).toCharArray();
            Arrays.sort(chars);

            for(int j=0; j< chars.length; j++){
                values[i][j] = chars[j];
                if(i > 0 && values[i-1][j]>values[i][j]){
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
