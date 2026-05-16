class Pair {
    String value;
    int timeStamp;
    Pair(String value, int timeStamp) {
        this.value = value;
        this.timeStamp = timeStamp;
    }
  
}

class TimeMap {
    HashMap<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        // create a new Arraylist at the given key only when arraylist is not created
        map.computeIfAbsent(key, k -> new ArrayList<>());

        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        List<Pair> pairs = map.get(key);

        int s = 0;
        int e = pairs.size() - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (pairs.get(mid).timeStamp == timestamp) {
                return pairs.get(mid).value;
            } else if (pairs.get(mid).timeStamp > timestamp) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return e >= 0 ? pairs.get(e).value : "";
    }
}
