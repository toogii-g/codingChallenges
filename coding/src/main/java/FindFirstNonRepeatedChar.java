import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatedChar {

    public FindFirstNonRepeatedChar() {
    }

    // find first non-repeated character in string "This is my java interview."
    // Has -? idx
    public char findFirstNonRepeatedChar(String s){

        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        /*for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }*/

        for(char c: s.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }

        return ' ';
    }

    /*public static void main(String[] s){
        String str = "This is my java interview.";
        char c = findFirstNonRepeatedChar(str);

        System.out.println("Non-repeated char: " + c);
    }*/


}
