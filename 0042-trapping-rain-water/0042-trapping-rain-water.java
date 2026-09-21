class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // Calculate the Left Max
        int LeftMax [] = new int [n];
        LeftMax[0] = height[0];
        for(int i = 1 ; i<n ; i++){
            LeftMax[i] = Math.max(LeftMax[i-1] , height[i]);
        }
        
        // Calculate the Right Max

        int RightMax [] =  new int[n];
        RightMax[n-1] =  height[n-1];
        for(int i = n-2 ; i >=0 ; i--){
            RightMax[i] = Math.max(RightMax[i+1] , height[i]);
        } 
        // Calculate the Water Level
        int WaterTrapped = 0 ;
        for(int i= 0 ; i< n ;i++){
            int WaterLevel = Math.min(LeftMax[i],RightMax[i]);
            //Calculate the Water Trapped
            WaterTrapped += WaterLevel - height[i];
        }
        return WaterTrapped;
       
    }
}