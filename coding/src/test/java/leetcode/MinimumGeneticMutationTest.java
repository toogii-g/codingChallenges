package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumGeneticMutationTest {

    @Test
    public void test1() {
        MinimumGeneticMutation min = new MinimumGeneticMutation();
        int result = min.minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"});

        int expected = 1;
        assertEquals(expected, result);
    }
}
