import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFirstNonRepeatedCharTest {

    // Unit test for non-repeated char
    @Test
    public void test1(){
        FindFirstNonRepeatedChar findFirstNonRepeatedChar = new FindFirstNonRepeatedChar();
        String str = "This is my java interview.";
        char expected = 'T';
        char resultChar = findFirstNonRepeatedChar.findFirstNonRepeatedChar(str);

        assertEquals(expected, resultChar);
    }
}
