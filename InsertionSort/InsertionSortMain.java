public class InsertionSortMain {
    public static void InsertionSort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int current = arr[i];  // We are storing the current element in the memory
            int previous = i-1;
            while(previous>=0 && arr[previous] > current){  // We are finding the correct position for Insertion
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current; // Insertion of the element stored in the memory
        }
        System.out.println("The sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        InsertionSort(arr);
    }
}