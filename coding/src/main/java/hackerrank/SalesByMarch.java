package hackerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMarch {

    public static int sockMerchant(int n, List<Integer> ar) {
        int pairCount = 0;
        Set<Integer> stock = new HashSet<>();
        for (int sockColor : ar) {
            if (stock.contains(sockColor)) {
                stock.remove(sockColor);
                pairCount++;
            } else {
                stock.add(sockColor);
            }
        }

        return pairCount;
    }
}
