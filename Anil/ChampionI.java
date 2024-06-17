package Anil;

public class ChampionI {
        public static int findChampion(int[][] grid) {
            for(int i = 0; i<grid.length; i++){
                boolean Champion = true;
                for(int j = 0; j<grid.length; j++){
                    if(i!=j && grid[j][i] == 1){
                        Champion = false;
                        break;
                    }
                }
                if(Champion){
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int[][] arr ={{0,0,0},
                      {1,0,1},
                      {1,0,0},
                     };
        System.out.println(findChampion(arr));

    }
    }


