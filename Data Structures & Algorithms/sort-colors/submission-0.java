class Solution {
    public void sortColors(int[] arr) {
       int left =0;
       int right =arr.length-1;
       int mid =0;

       while(mid<=right){
        if(arr[mid]==0){
           swap(arr,mid,left);
            left++;
            mid++;
        }
        else if(arr[mid]==2){
            swap(arr,mid,right);
            right--;
        }
        else{
            mid++;
        }
       }
    }
    public void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}