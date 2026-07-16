class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());

    }
}