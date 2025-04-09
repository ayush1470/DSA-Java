public class TrappedRainwaterMain {
    public static int TrappedRainwater(int[] height){
        int n = height.length;

        // We first form the leftMax Auxiliary Array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];  // the leftmost element of height[] will be maximum for itself from left side
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // Now we form the rightMax Auxiliary Array
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];  // the rightmost element of height[] will be maximum for itself from right side
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        // Now we calculate the Trapped Rainwater
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            // water level = minimum of(left most boundary for that element, rightmost boundary for that element)
            trappedWater += waterLevel - height[i];
            // trapped water = water level - height
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println("The amount of trapped rainwater is: "+ TrappedRainwater(height));
    }
}