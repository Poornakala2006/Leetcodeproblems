class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i, j , sLen = s.length();
        int maxLength = 0;
        for(i=0;i < sLen;i++){
            HashMap<Character,Integer> set1 = new HashMap<>();
            for(j =i ;j < sLen;j++)
            {
               var c = set1.get(s.charAt(j));
               if(c != null)

               {
                break;
               }
               set1.put(s.charAt(j),1);
               maxLength = Math.max(maxLength, j-i+1);
            }
        }
        return maxLength;
        
    }
}