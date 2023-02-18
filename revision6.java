public class revision6 {
    static int sumofarray(int [] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallans = sumofarray(arr,idx+1);
        return smallans + arr[idx];
    }
    public static void main(String args[]) {
        int [] arr = {1,2,3,4,};
        System.out.print(sumofarray(arr, 0)+ " ");
    }
}
