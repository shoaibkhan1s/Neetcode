class Solution {
    public int findMin(int[] arr) {
    int pivot = findPivot(arr);
    return pivot!=-1?arr[pivot+1]:arr[0];
    }
    public int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(mid>start && arr[start]>arr[mid]){
                end = mid-1;
            }

            if(arr[mid]>arr[start]){
                start = mid+1;
            }
            else{
                return -1;
            }
        }
       return 0;
    }
}
