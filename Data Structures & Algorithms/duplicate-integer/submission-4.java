class Solution {
    public boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
         for(int num : arr){
            if(set.contains(num)){
                return true;
            }
            else{
                set.add(num);
            }
         }
         return false;
    }
}