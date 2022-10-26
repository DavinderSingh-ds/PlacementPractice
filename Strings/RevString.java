public class RevString {
    public static void main(String[] args) {
        String s = "Davinder";
        String g = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            g = ch+g;  
        }
        System.out.println(g);
       
    }
}
