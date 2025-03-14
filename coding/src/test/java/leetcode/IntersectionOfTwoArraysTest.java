package leetcode;

import leetcode.array.IntersectionOfTwoArrays;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntersectionOfTwoArraysTest {

    @Test
    public void test1() {
        IntersectionOfTwoArrays tar = new IntersectionOfTwoArrays();

        Set<Integer> expected = new HashSet<>();
        expected.add(2);
        int[] result = tar.intersection(new int[]{1,2,2,1}, new int[]{2,2});
        Set<Integer> resultSet= new HashSet<>();
        for(int i: result){
            resultSet.add(i);
        }

        assertEquals(expected, resultSet);

    }
}
