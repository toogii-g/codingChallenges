package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {

    @Test
    public void Test1() {
        ValidPalindrome target = new ValidPalindrome();
        boolean result = target.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(result);
    }

    @Test
    public void Test2() {
        ValidPalindrome target = new ValidPalindrome();
        boolean result = target.isPalindrome("race a car");
        assertFalse(result);
    }

    @Test
    public void Test3() {
        ValidPalindrome target = new ValidPalindrome();
        boolean result = target.isPalindrome(" ");
        assertTrue(result);
    }
}
