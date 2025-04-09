public class ShortestPathMain {
    public static double ShortestPath(String path){
        double initial_x=0;
        double initial_y=0;
        double shortest_path;
        double final_x=0, final_y=0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='N'){
                final_y+=initial_y+1;
            }else if(path.charAt(i)=='S'){
                final_y+=initial_y-1;
            }else if(path.charAt(i)=='E'){
                final_x+=initial_x+1;
            }else if(path.charAt(i)=='W'){
                final_x+=initial_x-1;
            }
        }
        shortest_path=Math.sqrt(((final_x-initial_x)*(final_x-initial_x))+((final_y-initial_y)*(final_y-initial_y)));
        return shortest_path;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(ShortestPath(path));
    }
}
/* Logic: for N: y+1, S: y-1, W: x-1, E: x+1 where N->North, S->South, W->West, E->East
   Also, Draw the path on Cartesian Plane to understand the question better. */
