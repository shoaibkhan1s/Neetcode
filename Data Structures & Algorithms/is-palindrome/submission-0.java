class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
       int m =0;
       int n = str.length()-1;

       while(m<n){
       if(Character.toLowerCase(str.charAt(m)) != Character.toLowerCase(str.charAt(n))){
            return false;
        }
        m++;
        n--;
       }
       return true;
    }
}
