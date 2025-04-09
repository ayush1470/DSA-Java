import java.util.*;

public class ContainerWithMostWaterMain {
    public static int mostTrappedWater1(ArrayList<Integer> height){   // Brute Force Method
        int ht; // height of container
        int width; // width of container
        int waterContained=0;
        int maxWater = 0; // Maximum water contained
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                ht = Math.min(height.get(i), height.get(j));
                width = j-i;
                waterContained = ht*width;
                maxWater = Math.max(waterContained,maxWater);
            }
        }
        return maxWater;
    }

    public static int mostTrappedWater2(ArrayList<Integer> height){   // Two-Pointer Approach
        // Initializing the Pointers
        int lp = 0;   // Left Pointer
        int rp = height.size()-1;  // Right Pointer
        int ht, width;
        int trappedWater;
        int maxWater = 0;
        while(lp<rp){
            ht = Math.min(height.get(lp),height.get(rp));
            width = rp-lp;
            trappedWater = ht*width;
            maxWater = Math.max(maxWater,trappedWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
//        System.out.println("The Maximum water contained is: " + mostTrappedWater1(height));
        System.out.println("The Maximum water contained is: " + mostTrappedWater2(height));
    }
}