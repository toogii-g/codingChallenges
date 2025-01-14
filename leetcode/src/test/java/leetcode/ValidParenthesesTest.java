package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    @Test
    public void test1() {
        ValidParentheses valid = new ValidParentheses();
        boolean result = valid.isValid("()");

        assertTrue(result);
    }

    @Test
    public void test2() {
        ValidParentheses valid = new ValidParentheses();
        boolean result = valid.isValid("()[]{}");

        assertTrue(result);
    }

    @Test
    public void test3() {
        ValidParentheses valid = new ValidParentheses();
        boolean result = valid.isValid("(]");

        assertFalse(result);
    }

    @Test
    public void test4() {
        ValidParentheses valid = new ValidParentheses();
        boolean result = valid.isValid("([])");

        assertTrue(result);
    }
}
