import java.util.Scanner;
public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        boolean allUnique = true;
        int Count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) != s.lastIndexOf(ch)) {
                allUnique = false;
                Count++;
            }
        }

        if (allUnique) {
            System.out.println("All characters are unique.");
        } else {
            System.out.println("Not all characters are unique.");
            System.out.println("Number of duplicated characters: " + Count);
        }

        sc.close();
    }
}


