public class SubstringMain {
    public static String Substring(String str, int si, int ei){  // si -> starting index, ei -> ending index (excluded)
        String Substr = "";
        for(int i = si; i<ei; i++){
            Substr += str.charAt(i);
        }
        return Substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(Substring(str,0,4));
        System.out.println(str.substring(0,5));  // inbuilt function to make the substring of any string
    }
}