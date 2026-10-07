class Solution {
    public int maxSubArray(int[] nums) {
        int msum = Integer.MIN_VALUE ;
        int sum =0 ;
        for(int i : nums){
            sum+=i;
            msum = Math.max(sum , msum);
            if(sum<0){
                sum=0;
            }
        }
        return msum;
    }
}