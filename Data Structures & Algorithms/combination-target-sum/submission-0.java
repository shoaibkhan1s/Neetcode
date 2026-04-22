class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums, target, 0, outer,curr);
        return outer;
    }
    public void helper(
        int[] nums, int target, int index, List<List<Integer>> outer, List<Integer> curr) {
            if(target<0 || index>nums.length-1){
                return;
            }
        if (target == 0) {
            outer.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[index]);
        helper(nums, target - nums[index], index, outer,curr );
        curr.remove(curr.size()-1);
        helper(nums, target, index + 1, outer, curr);
    }
}
