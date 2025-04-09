import java.util.*;

public class PairSum2ArrayListMain {
    public static boolean PairSum2(ArrayList<Integer>list, int target){
        int n = list.size();
        int bp=-1; // Breaking Point (-1 as it's not a valid index) [we did this just to initialize bp]
        for(int i=0; i<n; i++){  // finding the breaking point (PIVOT Point)
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        /* After we got our Breaking Point, we use Modular Arithmetic method
         to let our pointers move in a rotated manner in ArrayList */
        while(lp!=rp){
            if((list.get(lp) + list.get(rp)) == target){
                return true;
            }else if((list.get(lp) + list.get(rp)) < target){
                lp = (lp+1)%n;  // Move left pointer forward in a circular manner
            }else{
                rp = (n+rp-1)%n;  // Move right pointer backward in a circular manner
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(PairSum2(list,target));
    }
}