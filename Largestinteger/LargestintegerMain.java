public class LargestintegerMain {
    public static void getSmallestAndLargestInteger(int[] numbers){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("The largest number is: "+ largest);
        System.out.println("The smallest number is: "+ smallest);
    }

    public static void main(String[] args) {
        int[] numbers = {3,5,7,2,4};
        getSmallestAndLargestInteger(numbers);
    }
}