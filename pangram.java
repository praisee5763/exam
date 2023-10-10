import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); 
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        
        Set<Character> letters = new HashSet<>();

        for (char c : input.toCharArray()) {
            
            if (Character.isLowerCase(c)) {
                letters.add(c);
            }
        }

        
        return letters.size() == 26;
    }
}

