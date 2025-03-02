package leetcode;

public class ValidPalindrome {

    public boolean isPalindrome(String s){
        String filtered = s.toLowerCase();
        filtered= filtered.replaceAll("[^a-zA-Z0-9]","");
        if(filtered.isEmpty()) return true;

        char tempChar;
        StringBuilder reversed = new StringBuilder();
        for(int i =0; i<filtered.length();i++){
            tempChar = filtered.charAt(i);
            reversed.insert(0, tempChar);
        }

        return filtered.contentEquals(reversed);

    }
}
