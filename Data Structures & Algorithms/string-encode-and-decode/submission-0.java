class Solution {

    public String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();
            for(String str: strs){
                sb.append(str.length()).append("#").append(str);
            }
            return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
            int i =0;
            while(i<str.length()){
                int n = str.charAt(i)-'0';
               
            list.add(str.substring(i+2,n+2+i));
               
            i = n+i+2;
            }
            return list;
    }
}
