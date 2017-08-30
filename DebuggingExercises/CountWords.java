import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        String str;
        int length;
        int x;
        char ch;
        int count = 0;
        boolean charPunc = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = input.nextLine();
        length = str.length();
        for (x = 0; x < length; x++)
        {
            ch = str.charAt(x);
            if (ch == ' ' || ch == '.' || ch == ',' ||
                    ch == ';' || ch == '!' || ch == '?' || ch == '-')
            {
                ++count;
                if (charPunc)
                    --count;
                charPunc = true;
            }
            else
                charPunc = false;
        }
        if (!charPunc)
            ++count;
        System.out.printf("There are %s words in the string", count);
    }
}
