class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()){
            return false;
        }
        HashSet<Character> set =  new HashSet<>();
        for(int i =0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        
        for(int i =0;i<t.length();i++){
            if(!set.contains(t.charAt(i))){
                set.remove(t.charAt(i));
                return false;
            };
        }
        return true;
    }
}
