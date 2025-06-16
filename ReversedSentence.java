import java.util.Scanner;

public class ReversedSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence; 
        System.out.println("Enter a sentence:");
        sentence = sc.nextLine();
        String [] words = sentence.split(" ");
        for (int i =0; i<words.length/2; i++){
            String temp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = temp;
        }
        String reversed = String.join(" " ,words);
        System.out.println(reversed);
    }
    
}