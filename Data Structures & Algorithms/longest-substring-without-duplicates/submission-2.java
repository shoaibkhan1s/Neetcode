class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int count =0;
        int max =0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            count++;
               
            }
            else{
                count=0;
                set.clear();
            }
            
              max = Math.max(max,count);
                 
            
        }
        return max;
    }
}
