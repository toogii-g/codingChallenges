package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class CountPairsOfSimilarStrings {
    public int similarPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (String word : words) {
            String charSet = getCharSet(word);
            if (map.containsKey(charSet)) {
                count += map.get(charSet) + 1;
                map.put(charSet, map.get(charSet) + 1);
            } else {
                map.putIfAbsent(charSet, 0);
            }
        }

        return count;
    }

    public String getCharSet(String word) {
        Set<Character> set = new HashSet<>();

        for (char c : word.toCharArray()) {
            set.add(c);
        }

        return set.toString();
    }
}