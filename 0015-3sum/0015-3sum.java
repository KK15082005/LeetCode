class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> unique = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0 ; i< n-2 ; i++){
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum==0){
                    unique.add(Arrays.asList(nums[i] , nums[low] , nums[high]));
                    low++;
                    high--;
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }

        ans.addAll(unique);
        return ans;
    }
}