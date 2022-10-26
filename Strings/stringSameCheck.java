import java.util.Arrays;

public class stringSameCheck {
    public static void main(String[] args) {
        String a = "Davinder";
        String b = "rednivaD";

        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        String s = "";
        String g = "";

        for(int i =0;i<arr1.length;i++){
            s = s + arr1[i];
        }

        for(int i =0;i<arr2.length;i++){
            g = g + arr2[i];
        }

        if(s.equals(g)){
            System.out.println("Equal");
        }else{
            System.out.println("Not");
        }
    }
}
