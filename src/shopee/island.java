package shopee;

public class island {
    public static void main(String[] args) {
        String[][] grid = {
                {"1","1","1","1","0"},
                {"1","1","0","1","0"},
                {"1","1","0","0","0"},
                {"0","0","0","0","0"}
                };
        System.out.println(numsIsland(grid));

    }
    public static int numsIsland(String[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j].equals("1")){
                    dfs(i,j,grid);
                    ans++;

                }
            }
        }
        return ans;
    }
    public static void dfs(int i, int j, String[][] grid){
        if(i<0||j<0||i>grid.length-1||j>grid[0].length-1) return;
        if("0".equals(grid[i][j])){
            return;
        }
        if("1".equals(grid[i][j])){
            grid[i][j] = "0";
            dfs(i,j-1,grid);
            dfs(i,j+1,grid);
            dfs(i+1,j,grid);
            dfs(i+1,j,grid);
        }
    }
}
