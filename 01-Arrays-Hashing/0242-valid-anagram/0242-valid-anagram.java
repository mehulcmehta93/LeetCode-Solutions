import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() ==  t.length()){
            char [] sSplit = s.toCharArray();
            char [] tSplit = t.toCharArray();

            Arrays.sort(sSplit);
            Arrays.sort(tSplit);
            
            if(Arrays.equals(sSplit,tSplit)) {
                return true;
            } else {
                return false;
            }
                    
        } else {
            return false;
        }
   }
}