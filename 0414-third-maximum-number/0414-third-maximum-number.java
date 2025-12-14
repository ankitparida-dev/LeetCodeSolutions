class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer second = null;
        Integer third = null;
        for (int i = 0; i < nums.length; i++) {
            if ((max != null && nums[i] == max) ||
                (second != null && nums[i] == second) ||
                (third != null && nums[i] == third)) {
                continue;
            }
            if (max == null || nums[i] > max) {
                third = second;
                second = max;
                max = nums[i];
            }
            else if (second == null || nums[i] > second) {
                third = second;
                second = nums[i];
            }
            else if (third == null || nums[i] > third) {
                third = nums[i];
            }
        }
        if (third == null) {
            return max;
        }
        return third;
    }
}
