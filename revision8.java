public class revision8 {
    static void indices(int [] arr,int x,int idx){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx]==x){
            System.out.print(idx + " ");
        }
        indices(arr, x, idx+1);
    }
    public static void main(String args[]){
        int [] arr = {1,2,4,4,4,5};
        int x= 4;
        indices(arr, x, 0);
    }
}
