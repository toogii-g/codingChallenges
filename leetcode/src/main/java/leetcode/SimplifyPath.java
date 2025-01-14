package leetcode;

import java.util.*;

public class SimplifyPath {

    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> skip= new HashSet<>(Arrays.asList("..",".",""));
        for(String dir: path.split("/")){
            if(dir.equals("..") && !stack.isEmpty()) stack.pop();
            else if(!skip.contains(dir)) stack.push(dir);
        }

        StringBuilder result = new StringBuilder();
        for(String dir: stack){
            result.insert(0, "/" + dir);
        }

        return (result.isEmpty()) ? "/" : result.toString();
    }
}
