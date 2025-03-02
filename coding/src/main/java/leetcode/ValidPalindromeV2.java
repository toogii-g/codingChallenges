package leetcode;

public class ValidPalindromeV2 {

    public boolean isPalindrome(String s){
        int i =0;
        int j = s.length()-1;
        int diff = 'a' - 'A';
        while(i<j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(!isValid(a)){
                i++;
            } else if(!isValid(b)){
                j--;
            } else{
                if(a>='A' && a<='Z'){
                    a = (char) (a+diff);
                }
                if(b>='A' && b<='Z'){
                    b = (char) (b+diff);
                }

                if(a!=b){
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;

    }

    private boolean isValid(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
