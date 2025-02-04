package leetcode;

import java.util.*;

/**
 * 1604. Alert Using Same Key-Card Three or More Times in a One Hour Period
 *
 * keyName: "abc"
 * keyTime: "23:59"
 */
public class AlertUsingSameKeyCard {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> names = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for(int i =0; i<keyName.length; i++){
            String name = keyName[i];
            String[] timeValue = keyTime[i].split(":");

            Integer mins = Integer.parseInt(timeValue[0])* 60 +Integer.parseInt(timeValue[1]);
            map.putIfAbsent(name, new ArrayList<>());

            map.get(name).add(mins);
        }

        for(String key: map.keySet()){
            List<Integer> timeList = map.get(key);
            Collections.sort(timeList);

            for(int i =0; i+2< timeList.size(); i++){
                if(timeList.get(i+2)-timeList.get(i)<=60){
                    names.add(key);
                    break;
                }
            }

        }

        Collections.sort(names);
        return names;
    }

}
