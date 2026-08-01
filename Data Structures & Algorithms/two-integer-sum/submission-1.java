class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                int otherIndex = map.get(complement);
                if (otherIndex != i) {
                    return new int[]{i, otherIndex};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
