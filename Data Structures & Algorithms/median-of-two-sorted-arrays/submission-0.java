class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = merge(nums1,nums2);
        int n = result.length;
        return n%2!=0 ? (double)result[n/2] : (double)(result[n/2]+result[(n/2)-1])/2; 
    }
    public int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] result = new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]>right[j]){
                result[k++] = right[j++];
            }else{
                result[k++] = left[i++];
            }
        }

        while(i<left.length){
            result[k++] = left[i++];
        }

        while(j<right.length){
            result[k++] = right[j++];
        }
        return result;    
    }
}
