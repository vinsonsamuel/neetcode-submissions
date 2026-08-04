class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) {
            return List.of(List.of(""));
        }

        List<List<String>> result = new ArrayList<>();
        for(int i=0; i<strs.length; i++) {
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            for(int j=0; j<strs.length; j++) {
                if(i!=j && isAnagram(strs[i], strs[j])) {
                    temp.add(strs[j]);
                }
            }
            if(!isDuplicate(result, temp)) {
                result.add(temp);
            }
        }

        return result;
    }

    public boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        int[] arr = new int[256];

        for(int i=0; i<str1.length(); i++) {
            arr[str1.charAt(i)]++;
        }

        for(int i=0; i<str2.length(); i++) {
            arr[str2.charAt(i)]--;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isDuplicate(List<List<String>> result, List<String> str) {
        String temp = str.get(0);
        
        for(int i=0; i<result.size(); i++) {
            for(int j=0; j<result.get(i).size(); j++) {
                if(result.get(i).get(j).equals(temp)) {
                    return true;
                }
            }
        }

        return false;
    }
}
