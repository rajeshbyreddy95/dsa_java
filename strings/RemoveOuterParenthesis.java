package strings;

public class RemoveOuterParenthesis {

    public static String removeOuterParent(String s){
        int n = s.length();
        int count =0;
        String ans="";

        for(int i=0;i<n;i++){
            if(s.charAt(i) == ')'){
                count--;
            }

            if(count != 0){
                ans+=s.charAt(i);
            }

            if(s.charAt(i) == '('){
                count++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParent(s));
    }
}