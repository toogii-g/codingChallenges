package algorithms.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {

    @Test
    public void test1(){
        CoinChange tar = new CoinChange();

        int result = tar.coinChange(new int[]{1,2,5},11);

        assertEquals(3, result);
    }


    @Test
    public void test2(){
        CoinChange tar = new CoinChange();

        int result = tar.coinChange(new int[]{1,5,10,25},100);

        assertEquals(4, result);
    }
}
