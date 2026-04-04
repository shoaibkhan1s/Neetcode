
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outer = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for(int i = 0; i < strs.length; i++){
            if(visited[i]) continue;

            List<String> internal = new ArrayList<>();
            internal.add(strs[i]);
            visited[i] = true;

            for(int j = i + 1; j < strs.length; j++){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    internal.add(strs[j]);
                    visited[j] = true;
                }
            }

            outer.add(internal);
        }

        return outer;
    }

    public boolean isAnagram(String s, String t){
        int[] count = new int[26];

        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            count[c - 'a']--;
        }

        for(int i : count){
            if(i != 0) return false;
        }
        return true;
    }
}