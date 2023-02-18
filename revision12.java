import java.util.ArrayList;

public class revision12 {
    static ArrayList<String> subsequences(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }

        char cur = s.charAt(0);
        ArrayList<String> smallans = subsequences(s.substring(1));
        for(String ss : smallans){
            ans.add(ss);
            ans.add(cur + ss);
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<String> ans = subsequences("abc");
        for(String ss:ans){
            System.out.println(ss);
        }
    }
    
}
