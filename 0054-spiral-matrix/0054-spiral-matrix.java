class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> result = new ArrayList<>();
        int srow=0 ;
        int erow=matrix.length-1;
        int scol=0;
        int ecol=matrix[0].length-1;
        if(matrix.length==0){
            return result;
        }
        while(srow<=erow && scol<=ecol){
            //Top
            for(int j = scol ; j<=ecol ; j++){
                result.add(matrix[srow][j]);
            }
            //Right
            if(srow==erow){
                break;
            }
            else{
                for(int j = srow+1 ; j<=erow ; j++){
                    result.add(matrix[j][ecol]);
                }
            }
            //Bottom
            for(int j=ecol-1 ; j>=scol ;j--){
                result.add(matrix[erow][j]);
            }
            //Left
            if(scol==ecol){
                break;
            }
            else{
                for(int j=erow-1 ; j>=srow+1 ; j--){
                    result.add(matrix[j][scol]);
                }
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return result;
    }
}