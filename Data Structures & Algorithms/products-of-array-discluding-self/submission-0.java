class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] result = new int[arr.length];

int prod = 1;
int k =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){ 
                k = 5;
                continue;
            };
            prod *= arr[i];
        }
        for(int i =0;i<arr.length;i++){
            if(k==5 && arr[i]==0){
                arr[i] = prod;
            }
            else if(k==5 && arr[i]!=0){
                arr[i] = 0;
            }
            else{
            arr[i] = prod/arr[i];
            }
        }
        return arr;
    }
}  
