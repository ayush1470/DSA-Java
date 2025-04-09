public class LargestStringMain {
    public static String largestString(String[] str){
        String largest = str[0];
        for(int i=0; i<str.length; i++){
            if(largest.compareToIgnoreCase(str[i])<0){   // str1.compareToIgnoreCase(str2) -> returns integer {Remember that}
                largest = str[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] str = {"aaabcd", "aaabce", "aaabcx"};
        System.out.println(largestString(str));
    }
}