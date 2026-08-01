class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        if(s.length()==0 || t.length()==0) {
            return false;
        }

        char[] arr = new char[256];

        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        for(int i=0; i<t.length(); i++) {
            arr[t.charAt(i)]--;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
