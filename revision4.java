import java.util.*;
public class revision4 {
    static int  count(int n){
        if(n>=1 && n<=9){
            return n;
        }
        int smallans = count(n/10);
        return smallans + 1;
    }    
    public static void main(String[] args){
        int n = 1234;
        System.out.println(count(n));     
    }
}
