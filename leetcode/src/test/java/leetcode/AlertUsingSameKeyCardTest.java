package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertUsingSameKeyCardTest {

    @Test
    public void test1() {
        String[] keyName = {"daniel","daniel","daniel","luis","luis","luis","luis"};
        String[] keyTime = {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};

        List<String> expected = new ArrayList<>(List.of("daniel"));
        AlertUsingSameKeyCard target= new AlertUsingSameKeyCard();

        List<String> result = target.alertNames(keyName, keyTime);

        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        String[] keyName = {"alice","alice","alice","bob","bob","bob","bob"};
        String[] keyTime = {"12:01","12:00","18:00","21:00","21:20","21:30","23:00"};

        List<String> expected = new ArrayList<>(List.of("bob"));
        AlertUsingSameKeyCard target= new AlertUsingSameKeyCard();

        List<String> result = target.alertNames(keyName, keyTime);

        assertEquals(expected, result);
    }

}
