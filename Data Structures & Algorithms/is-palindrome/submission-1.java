class Solution {
    boolean checkPalindrom(String str, int i, int j){
        if(i > j){
            return true;
        }

        if(str.charAt(i) != str.charAt(j)){
            return false;
        }

        return checkPalindrom(str, i+1, j-1);
    }
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        s = "";
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            if(curr >= 'a' && curr <= 'z' || curr >= '0' && curr <= '9'){
                s += curr;
            }
        }

        return checkPalindrom(s, 0, s.length()-1);
    }
}
