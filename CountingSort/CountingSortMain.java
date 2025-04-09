public class CountingSortMain {
    public static void CountingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){  // To find the largest element in array
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest+1];  // using the largest element we found to make an array 'Count' of length=largest+1
        for(int i=0; i<arr.length; i++){
            count[arr[i]] = count[arr[i]]+1;    // understand this
        }

        int j = 0;                 // Sorting begins
        for(int i=0; i<arr.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.println("The sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        CountingSort(arr);
    }
}