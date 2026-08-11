class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        int k = 0;
        while (k != strs[0].length() && k != strs[1].length()) {
            if (strs[0].charAt(k) == strs[1].charAt(k)) {
                sb.append(strs[0].charAt(k));
            } else {
                break;
            }
            k++;
        }
        if (sb.length() == 0) {
            return "";
        }
        if (strs.length >= 2) {
            for (int i = 2; i < strs.length; i++) {
                if (sb.length() == 0 || strs[i].length() == 0) {
                    return "";
                }
                int x = 0;
                String str = strs[i];
                while (x != sb.length()) {
                    if (x >= str.length()) {
                        sb.delete(x, sb.length());
                        break;
                    }
                    if (sb.charAt(x) == str.charAt(x)) {
                        x++;
                    } else {
                        sb.delete(x, sb.length());
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }
}