package leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule2 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        int[] inDegree = new int[numCourses];
        for(int i =0; i< numCourses; i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] pair: prerequisites){
            int course = pair[0];
            int preReq = pair[1];

            adj[preReq].add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i =0; i< numCourses; i++){
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }

        int[] courses = new int[numCourses];
        int idx =0;

        while(!queue.isEmpty()){
            int course = queue.poll();
            courses[idx]=course;
            idx++;
            for(int next: adj[course]){
                inDegree[next]--;
                if(inDegree[next]==0){
                    queue.offer(next);
                }
            }
        }

        if(idx == numCourses){
            return courses;
        }else{
            return new int[0];
        }
    }
}
