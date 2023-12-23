public class Permutatio {
    public static void findPremutation(String str, String ans){
        // base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i =0; i<str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abded"
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPremutation(NewStr, ans+curr);
        }
    }
    public static void main(String args[]) {
        String str = "abc";
        findPremutation(str, "");
    }
}
