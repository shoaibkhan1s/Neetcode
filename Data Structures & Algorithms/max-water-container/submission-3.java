class Solution {
        public int maxArea(int[] arr) {
                int max =0;
                        int left =0;
                                int width = 0;
                                        int right = arr.length-1;
                                                int area = 0;
                                                        while(left<right){
                                                                    width = right-left;
                                                                                
                                                                                            area = Math.min(arr[left],arr[right])*width;
                                                                                                        max = Math.max(area,max);
                                                                                                                    
                                                                                                                                 if(arr[left]>arr[right]){
                                                                                                                                                 right--;
                                                                                                                                                             }
                                                                                                                                                                         else{
                                                                                                                                                                                         left++;
                                                                                                                                                                                                     }
                                                                                                                                                                                                             }
                                                                                                                                                                                                                     return max;
                                                                                                                                                                                                                         }
                                                                                                                                                                                                                         }
                                                                                                                                                                                                                         
}