class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int ans [] = new int[nums.length];
        int total = 0 ;
        for( int num : nums){
            total += num;
        }
        int prefix = 0 ;
        for(int i = 0 ;i< nums.length;i++){
            int left = i*nums[i]-prefix;
            int right = (total - prefix - nums[i]) - nums[i]*(nums.length - i - 1);
            ans[i] = left + right;
            prefix += nums[i];
        }
        return ans;
    }
}