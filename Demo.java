import java.util.HashMap;
import java.util.Map;

public class Demo {

    // find first non repeated character in string "This is my java interview."
    // Has -? idx
    public static char findFirstNonRepeatedChar(String s){

        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return ' ';
    }

    public static void main(String[] s){
        String str = "This is my java interview.";
        char c = findFirstNonRepeatedChar(str);

        System.out.println("Non-repeated char: " + c);
    }


}
