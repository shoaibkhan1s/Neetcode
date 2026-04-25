class LRUCache {
int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.get(key)!=null){
            return map.get(key);
        }else{
            return -1;
        }
    }

    HashMap<Integer,Integer> map = new HashMap<>();
    public void put(int key, int value) {
       if(capacity==0){
        map.remove(1);
        capacity++;
       }
       map.put(key,value);
        capacity--;
    }
}
