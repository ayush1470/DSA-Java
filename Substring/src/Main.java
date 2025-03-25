public class Main {
    public static String Substring(String str, int si, int ei){
        String Substr = "";
        for(int i = si; i<ei; i++){
            Substr += str.charAt(i);
        }
        return Substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(Substring(str,0,4));
    }
}