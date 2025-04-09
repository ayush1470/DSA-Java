public class SubArrayMain {
    public static void PrintSubarray(int[] numbers){
        int ts = 0;  // total subarrays
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){  // loop that decides start
            for(int j=i; j<numbers.length; j++){  // loop that decides end
                int sum = 0;
                for(int k=i; k<=j; k++){ // to print the subarray
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                }
                ts++;
                System.out.println();
                System.out.println("sum: "+sum);
                if(sum>maxSum){
                    maxSum = sum;
                }
                if(sum<minSum){
                    minSum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total number of Subarray are: "+ts);
        System.out.println("The maximum sum of Subarray is: "+maxSum);
        System.out.println("The minimum sum of Subarray is: "+minSum);
    }

    public static void main(String[] args) {
        int[] numbers = {9,4,-6,5,3};
        System.out.println("The subarrays are: ");
        PrintSubarray(numbers);
    }
}