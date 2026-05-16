class Solution {
    public int search(int[] arr, int target) {
        int peek = findPeek(arr);
        int firstTry = search(arr,0,peek,target);
        if(firstTry!=-1){
            return firstTry;
        }else{
            return search(arr,peek+1,arr.length-1,target);
        }

    }

    public int search(int[] arr, int s, int e, int target){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]>target){
                e = mid-1;
            } else if(arr[mid]<target){
                s = mid+1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    public int findPeek(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            } else if(arr[s]>arr[mid]){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
}
