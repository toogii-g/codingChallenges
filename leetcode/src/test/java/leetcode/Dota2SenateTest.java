package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dota2SenateTest {

    @Test
    public void test1() {
        Dota2Senate target = new Dota2Senate();
        String result = target.predictPartyVictory("RD");

        assertEquals("Radiant",result);
    }

    @Test
    public void test2() {
        Dota2Senate target = new Dota2Senate();
        String result = target.predictPartyVictory("RDD");

        assertEquals("Dire",result);
    }
}
