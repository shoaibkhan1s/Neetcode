class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new ArrayList[arr.length+1];

        for(int key: map.keySet()){
            int freq = map.get(key);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int index=0;
        int[] result = new int[k];
        for(int i=bucket.length-1;i>=0 && index<k;i--){
            if(bucket[i]!=null){
                for(int num : bucket[i]){
                    result[index++] = num;
                    if(index==k) break;
                }
            }
        }
        return result;

    }
}
