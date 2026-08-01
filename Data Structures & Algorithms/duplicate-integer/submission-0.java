class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums==null || nums.length<=1) {
            return false;
        }

        Set<Integer> uniq = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            if(uniq.contains(nums[i])) {
                return true;
            }
            uniq.add(nums[i]);
        }

        return false;
    }
}