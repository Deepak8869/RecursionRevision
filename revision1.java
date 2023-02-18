import java.util.*;
 class revision1{
    static void natural(int n){
        if(n==0){
            return;
        }
        natural(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        natural(n);

    }
 }