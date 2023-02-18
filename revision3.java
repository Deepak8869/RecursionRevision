import java.util.*;
class revision3{
    static int sum(int n){
        if(n>=1 && n<=9){
            return n;
        }
        int smallans = sum(n/10);
        return smallans + sum(n%10);
    }
    public static void main(String args[]){
        int n = 1234;
        System.out.println(sum(n));

    }
}