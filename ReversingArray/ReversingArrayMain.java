public class ReversingArrayMain {
    public static void ReverseArray(int[] numbers){
        int temp;
        int first=0;
        int last = numbers.length-1;
        while(first<last){
            temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        ReverseArray(numbers);
        System.out.println("The reversed array is: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println(); /* added this to make sure the next command in program
                                 is not in the same line as the printed reversed array.*/
    }
}