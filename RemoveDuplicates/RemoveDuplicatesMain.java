public class RemoveDuplicatesMain{
    public static void removeDuplicates(String expression, int idx, boolean[] track, StringBuilder sb){
        if(idx == expression.length()){ // base case
            System.out.print(sb);
            return;  // to come out of the function
        }
        // kaam
        char currentChar = expression.charAt(idx);
        if(track[currentChar - 'a'] == true){
            removeDuplicates(expression, idx+1, track, sb);
        }else{
            track[currentChar - 'a'] = true;
            removeDuplicates(expression, idx+1, track, sb.append(currentChar));
        }
    }

    public static void main(String[] args){
        String expression = "appnnacollege";
        removeDuplicates(expression,0, new boolean[26], new StringBuilder());
    }
}