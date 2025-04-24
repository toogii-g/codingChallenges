package algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountLargestGroup {

    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            int sum=0;
            int num = i;
            while(num>0){
                sum+=num%10;
                num=num/10;
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        for(int count: map.values()){
            max = Math.max(max, count);
        }
        int groupCount =0;
        for(int count: map.values()){
            if(max==count){
                groupCount++;
            }
        }

        return groupCount;
    }
}
