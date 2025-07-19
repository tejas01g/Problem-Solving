import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "SILENT";
        String s2 = "LISTEN";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        if (c1.length != c2.length){
            System.out.println("This is not Anagram");
            System.exit(0);
        } 
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i<c1.length; i++){
            if (c1[i] != c2[i]){
                System.out.println("This is not Anagram");
                System.exit(0);
            }
            
        }
        System.out.println("This is Anagram");
    }
}
