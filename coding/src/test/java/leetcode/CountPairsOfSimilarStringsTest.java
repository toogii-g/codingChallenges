package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPairsOfSimilarStringsTest {

    @Test
    public void test1() {
        CountPairsOfSimilarStrings tar = new CountPairsOfSimilarStrings();

        int result = tar.similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"});

        assertEquals(result, 2);
    }

    @Test
    public void test2() {
        CountPairsOfSimilarStrings tar = new CountPairsOfSimilarStrings();

        int result = tar.similarPairs(new String[]{"aabb","ab","ba"});

        assertEquals(result, 3);
    }
}
