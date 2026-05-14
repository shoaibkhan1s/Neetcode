class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(!stack.isEmpty()){
               if(arr[stack.peek()] > arr[i]){
                stack.push(i);
               }else{
                while(arr[stack.peek()] < arr[i]){
                int idx = stack.pop();
                result[idx] = i-idx;
                }
               }
            }else{
                stack.push(i);
            }

        }
        return result;
    }
}
