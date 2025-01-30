package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

    public String predictPartyVictory(String senate) {
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                rQueue.add(i);
            } else {
                dQueue.add(i);
            }
        }

        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            int r = rQueue.remove();
            int d = dQueue.remove();

            if (r < d) {
                rQueue.add(n++);
            } else {
                dQueue.add(n++);
            }
        }
        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }

}
