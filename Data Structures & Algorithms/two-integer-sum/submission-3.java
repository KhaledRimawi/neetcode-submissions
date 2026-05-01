class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i =0 ; i<nums.length ; i++)
        { 
            for(int j=i+1;j<nums.length;j++)
            {
                int p = nums[i]+nums[j];
                if (p == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}