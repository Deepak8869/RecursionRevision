public class revision7 {
    static boolean target(int [] arr,int idx,int target){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        return target(arr, idx+1, target);
    }
    public static void main(String args[]) {
        int [] arr = {1,2,3,4,5,6};
        int target=8;
        if(target(arr, 0, target)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
