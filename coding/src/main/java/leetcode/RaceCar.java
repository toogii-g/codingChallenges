package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RaceCar {

        public int racecar(int target) {

            // Store events with move count
            // pos, speed, move
            Queue<int[]> queue = new LinkedList<>();

            // Store events
            // "pos,speed" e.g:"0,1"
            Set<String> visited = new HashSet<>();

            // start
            int pos = 0;
            int speed = 1;
            int move = 0;

            // give initial command
            queue.offer(new int[] { pos, speed, move });

            // would iterate command one by one
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                pos = curr[0];
                speed = curr[1];
                move = curr[2];

                // if it reaches destination, returns move
                if (pos == target)
                    return move;
                // store position and speed to not repeat same action
                String action = pos + "," + speed;
                if (!visited.contains(action)) {
                    visited.add(action);

                    // accelerate on each command
                    queue.offer(new int[] { pos + speed, speed * 2, move + 1 });

                    // if car goes wrong direction, needs correction command
                    if ((pos + speed < target && speed < 0) || pos + speed > target && speed > 0) {

                        queue.offer(new int[] { pos, speed > 0 ? -1 : 1, move + 1 });
                    }
                }
            }

            // impossible to reach
            return -1;
        }
}
