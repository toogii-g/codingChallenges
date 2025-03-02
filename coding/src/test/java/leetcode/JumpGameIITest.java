package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpGameIITest {

    @Test
    public void test1() {
        JumpGameII jumpGameII = new JumpGameII();
        int result = jumpGameII.jump(new int[]{2,3,1,1,4});

        assertEquals(2,result);
    }

    @Test
    public void test2() {
        JumpGameII jumpGameII = new JumpGameII();
        int result = jumpGameII.jump(new int[]{2,3,0,1,4});

        assertEquals(2,result);
    }
}
