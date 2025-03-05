package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinationsSum(1, k, n, result, new ArrayList<>());
        return result;
    }

    private void findCombinationsSum(int index, int k, int target, List<List<Integer>> result, List<Integer> current) {
        if (target == 0 && current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (current.size() > k) {
            return;
        }
        for (int i = index; i <= 9; i++) {
            if (i > target) break;
            current.add(i);
            findCombinationsSum(i + 1, k, target - i, result, current);
            current.removeLast();
        }
    }
}
