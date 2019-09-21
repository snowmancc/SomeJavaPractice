
package maze;

public class Maze {

    public static void main(String[] args) {
        int[][] maze = {
            {2,2,2,2,2,2,2},
            {0,0,0,0,0,0,2},
            {2,0,2,0,2,0,2},
            {2,0,0,2,0,2,2},
            {2,2,0,2,0,2,2},
            {2,0,0,0,0,0,2},
            {2,2,2,2,2,0,2}};
        
        /*int[][]mouse = new int[20][2];
        int count = 1;
        mouse[count][0] = 1;
        mouse[count++][1] = 0;*/
        
        int down= 1;
        int cross =0;
        
        maze[down][cross] = 1;
        boolean canGoing = true;
        
        while(maze[6][5] != 1) {
            
            if(canGoing) {
                if(maze[down+ 1 ][cross] == 0) {
                    down += 1;
                    maze[down][cross] = 1;
                }
                else if(maze[down][cross + 1] == 0) {
                    cross += 1;
                    maze[down][cross] = 1;
                }
                else{
                    canGoing = false;
                }
            }
            else {
                if(maze[down - 1][cross] == 0) {
                    down -= 1;
                    maze[down][cross] = 1;
                    canGoing = true;
                }
                else if(maze[down][cross - 1] == 0) {
                    cross -= 1;
                    maze[down][cross] = 1;
                    canGoing = true;
                }
                if(maze[down - 1][cross] == 1) {
                    down -= 1;
                    maze[down][cross] = 0;
                }
                else if(maze[down][cross - 1] == 1) {
                    cross -= 1;
                    maze[down][cross] = 0;
                }
            }
        
            }
        
        
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    
