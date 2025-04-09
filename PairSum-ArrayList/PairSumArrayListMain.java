import java.util.*;

public class PairSumArrayListMain {
//    public static int PairSum1(ArrayList<Integer>list, int target){  // Brute Force method [Time Comp: O(n^2)]
//        int count = 0;
//        for(int i=0; i<list.size(); i++){
//            for(int j=i+1; j<list.size(); j++){
//                if(list.get(i) + list.get(j) == target){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    public static int PairSum2(ArrayList<Integer> list, int target){  // Two-Pointer Approach [Time Comp: O(n)]
        int lp = 0;
        int rp = list.size()-1;
        int count = 0;
        while(lp < rp){
            if(list.get(lp) + list.get(rp) == target){
                count++;
                lp++;      // after we get our pair hume apne pointers ko aage bhi toh badhana hoga to prevent Infinite loop..
                rp--;
            }else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        int target = 7;
        System.out.println("The number of Pairs whose sum equal to target is: "+PairSum2(list,target));
    }
}