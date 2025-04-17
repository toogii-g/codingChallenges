package algorithms.heap;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FindKPairsSmallestSumsTest {

    @Test
    public void test1(){
        FindKPairsSmallestSums tar = new FindKPairsSmallestSums();

        List<List<Integer>> result =tar.kSmallestPairs(new int[]{1,7,11},new int[]{2,4,6},3);

        System.out.println(result.toString());
    }

    @Test
    public void test2(){
        FindKPairsSmallestSums tar = new FindKPairsSmallestSums();

        List<List<Integer>> result =tar.kSmallestPairs(new int[]{1,1,2},new int[]{1,2,3},2);

        System.out.println(result.toString());
    }
}
