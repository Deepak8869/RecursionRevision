import java.util.Scanner;

public class revision5 {
    static void multiple(int n,int k){
        if(k==1){
            System.out.print(n + " ");
            return;
        }
           
        multiple(n,k-1);
        System.out.print(n*k + " ");
      
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        int n=cs.nextInt();
        int k=cs.nextInt();
        multiple(n, k);
    }
}
