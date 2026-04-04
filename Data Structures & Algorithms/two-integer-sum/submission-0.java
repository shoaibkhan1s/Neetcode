class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int complement = target-arr[i];

            if(set.containsKey(complement)){
                  return new int[]{set.get(complement), i};
            }

            set.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
}
