class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 0 ; row<numRows ; row++){
            List<Integer> rowList = new ArrayList<>();
            for(int i = 0 ; i<=row ; i++){
                if(i==0 || row == i){
                    rowList.add(1) ;
                }
                else{
                    rowList.add(ans.get(row-1).get(i-1) + ans.get(row-1).get(i));
                }
            }
            ans.add(rowList);
        }
        return ans ;
    }
}