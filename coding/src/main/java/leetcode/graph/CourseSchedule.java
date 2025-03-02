package leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        int[] inDegree = new int[numCourses];

        for(int[] pair: prerequisites){
            int course = pair[0];
            int preReq = pair[1];
            inDegree[course]++;
            if(adj[preReq]==null){
                adj[preReq] = new ArrayList<>();
            }
            adj[preReq].add(course);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0; i< numCourses; i++){
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }

        int idx=0;

        while(!queue.isEmpty()){
            int course = queue.poll();
            idx++;
            if(adj[course] != null){
                for(int next: adj[course]){
                    inDegree[next]--;
                    if(inDegree[next]==0){
                        queue.offer(next);
                    }
                }
            }
        }

        return idx == numCourses;
    }
}
