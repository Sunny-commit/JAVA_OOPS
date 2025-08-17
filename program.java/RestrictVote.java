import java.util.Scanner;



public class RestrictVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new AgeRestrictionException("Age must be 18 or above.");
            } else {
                System.out.println("Age is acceptable.");
            }
        } catch (AgeRestrictionException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
