public class revision9 {
    static String remove(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        char cur = s.charAt(idx);
        String smallans = remove(s, idx+1);
        if(cur!='a'){
            return cur + smallans;
        }
        else{
            return smallans;
        }
    }
    public static void main(String args[]){
        String s = "abcax aab";
        System.out.println(remove(s, 0)); 
    }
}
