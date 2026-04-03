class Solution {
    public boolean hasDuplicate(int[] arr) {
        Arrays.sort(arr);
        for(int i =0;i<=arr.length-1;i++){
            if(i<arr.length-1 && arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}