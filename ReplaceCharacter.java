import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        
        System.out.print("Replace: ");//char can store or replace only single letter even though ur typing multiple letters
        char oldChar = sc.next().charAt(0);
        
        System.out.print("With: ");
        char newChar = sc.next().charAt(0);
        
        System.out.println("Result: " + str.replace(oldChar, newChar));
    }
}

