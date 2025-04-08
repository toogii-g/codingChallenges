package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolvingQuestionsWithBrainpowerTest {

    @Test
    public void test1(){
        SolvingQuestionsWithBrainpower tar = new SolvingQuestionsWithBrainpower();

        int[][] questions = {{3,2},{4,3},{4,4},{2,5}};

        long result = tar.mostPoints(questions);

        assertEquals(5, result);
    }
}
