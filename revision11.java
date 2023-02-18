import java.util.Scanner;

public class revision11 {
    static String palindrome(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallans = palindrome(s, idx+1);
        return smallans + s.charAt(idx);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = palindrome(s, 0);
        if(rev.equals(s)){
            System.out.printf("%s is palindrome",s);
        }
        else{
            System.out.printf("%s is not palindrome",s);
        }
    }
}
