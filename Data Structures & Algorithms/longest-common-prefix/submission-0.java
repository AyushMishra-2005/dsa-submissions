class Solution {
    public String longestCommonPrefix(String[] strs) {
        String smallest = strs[0];
        for(String str : strs){
            if(smallest.length() > str.length()){
                smallest = str;
            }
        }

        StringBuilder sb = new StringBuilder(smallest);
        for(String str : strs){
            int i = sb.length()-1;
            int j = sb.length()-1;
            while(i >= 0){
                if(sb.charAt(i) != str.charAt(j)){
                    if(i == 0){
                        return "";
                    }
                    sb.deleteCharAt(i);
                }
                i--;
                j--;
            }
        }

        return sb.toString();

    }
}