import java.util.Scanner;
public class ValidatePassword {
    public static void main(String[] args) {
        String password;
        int passlength = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int letters = 0;
        int numbers = 0;
        final int NUM = 2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        password = input.nextLine();
        passlength = password.length();
        if(passlength < 6)

        System.out.println(password);
    }
}
