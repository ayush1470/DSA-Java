import java.util.Arrays;
import java.util.Collections;

public class InbuiltSortMain {
    public static void PrintArray(Integer[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Comments apne aap hata ke ek ek Sorting karke dekho
    public static void main(String[] args){
        Integer[] arr = {5,3,4,1,2};
//        Arrays.sort(arr);    // Sorting in Ascending order
//        PrintArray(arr);

//        Arrays.sort(arr,0,3);  // Sorting in Ascending order in the given range [a,b]
//        PrintArray(arr);

//        Arrays.sort(arr,Collections.reverseOrder());  // Sorting in Descending Order
//        PrintArray(arr);

        Arrays.sort(arr,0,3, Collections.reverseOrder());  // Sorting in Descending Order in the given range [a,b]
        PrintArray(arr);
    }
}