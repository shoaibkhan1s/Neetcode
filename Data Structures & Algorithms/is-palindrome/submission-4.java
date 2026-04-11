class Solution {
        public boolean isPalindrome(String s) {
                
                       int m =0;
                              int n = s.length()-1;

                                     while(m<n){
                                             while(m<n && !(Character.isLetterOrDigit(s.charAt(m)))) m++;
                                                     while(m<n && !(Character.isLetterOrDigit(s.charAt(n)))) n--;

                                                            if(Character.toLowerCase(s.charAt(m)) != Character.toLowerCase(s.charAt(n))){
                                                                        return false;
                                                                                }
                                                                                        m++;
                                                                                                n--;
                                                                                                       }
                                                                                                              return true;
                                                                                                                  }
                                                                                                                  }
                                                                                                                  
}