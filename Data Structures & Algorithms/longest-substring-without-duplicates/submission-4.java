class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int count =0;
        int max =0;
        int i=0;
        while( i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            count++;
               
            }
            else{
                
                set.clear();
               set.add(s.charAt(i));
               count=1;
            }
            
              max = Math.max(max,count);
                 i++;
            
        }
        return max;
    }
}
