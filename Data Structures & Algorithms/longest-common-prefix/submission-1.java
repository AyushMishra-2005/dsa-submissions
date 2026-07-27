class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = strs[0];
        StringBuilder sb = new StringBuilder(longest);
        for(int i = 0; i<strs.length; i++){
            String str = strs[i];
            while(sb.length() > 0 && !str.startsWith(sb.toString())){
                sb.deleteCharAt(sb.length()-1);
            }
        }

        return sb.toString();

    }
}








