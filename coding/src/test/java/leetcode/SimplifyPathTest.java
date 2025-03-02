package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplifyPathTest {


    @Test
    public void test1() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String result = simplifyPath.simplifyPath("/home/");

        assertEquals("/home", result);
    }

    @Test
    public void test2() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String result = simplifyPath.simplifyPath("/home//foo/");

        assertEquals("/home/foo", result);
    }

    @Test
    public void test3() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String result = simplifyPath.simplifyPath("/home/user/Documents/../Pictures");

        assertEquals("/home/user/Pictures", result);
    }

    @Test
    public void test4() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String result = simplifyPath.simplifyPath("/../");

        assertEquals("/", result);
    }

    @Test
    public void test5() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String result = simplifyPath.simplifyPath("/.../a/../b/c/../d/./");

        assertEquals("/.../b/d", result);
    }
}
