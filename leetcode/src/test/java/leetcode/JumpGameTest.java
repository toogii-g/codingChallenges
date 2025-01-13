package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JumpGameTest {

    @Test
    public void test1() {
        JumpGame jumpGame = new JumpGame();
        boolean result = jumpGame.jump(new int[]{2,3,1,1,4});

        assertTrue(result);
    }

    @Test
    public void test2() {
        JumpGame jumpGame = new JumpGame();
        boolean result = jumpGame.jump(new int[]{3,2,1,0,4});

        assertTrue(result);
    }
}
