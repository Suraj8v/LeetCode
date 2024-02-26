class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // if(n<=2)
        // {
        //     return nums[0];
        // }
        return nums[(n/2)];
    }
}