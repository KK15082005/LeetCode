class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length ;
        int fresh =0 ;
        int time = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        int dr[] = {-1 , 1 , 0 , 0};
        int dc[] = {0 , 0 , -1 , 1};

        while(!q.isEmpty() && fresh>0){
            
            int level = q.size();
            for(int i = 0 ; i<level ; i++){
                int [] cell = q.poll();
                int r = cell[0];
                int c = cell[1];
            
                for(int j = 0 ; j<4 ; j++){
                    int nr = r + dr[j];
                    int nc = c + dc[j];
                
                    if(nr>=0 && nc>=0 && nr<row && nc<col && grid[nr][nc]==1){
                        grid[nr][nc] = 2 ;
                        fresh--;
                        q.offer(new int[] {nr , nc});
                    }
                }
            }
            time++;
        }
        if(fresh>0){
            return -1;
        }
        return time;
    }
}