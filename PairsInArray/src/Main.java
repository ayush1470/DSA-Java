//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void PairsInArray(int[] numbers){
        int tp = 0;
        for(int i = 0; i<numbers.length; i++){
            int current_num = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("("+current_num+","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("The total number of pairs are: "+tp);
    }

    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        System.out.println("The pairs are: ");
        PairsInArray(numbers);
    }
}