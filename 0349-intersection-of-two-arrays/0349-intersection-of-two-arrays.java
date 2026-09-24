class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums1){
            set.add(num);
        }
        int result [] = new int[Math.min(nums1.length , nums2.length)];
        int i = 0 ;
        for(int num : nums2){
            if(set.contains(num)){
                result[i++] = num;
                set.remove(num);
            }
        }
        
        return Arrays.copyOf(result , i);
    }
}