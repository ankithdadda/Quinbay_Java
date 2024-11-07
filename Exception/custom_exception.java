package Exception;
import java.util.Scanner;

public class custom_exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        try {
            checkDigit(number);
            System.out.println("The number " + number + " is safe.");
        } catch (MultiDigitNumberException e) {
            System.out.println(e.getMessage());
        }
        in.close();
    }

    public static void checkDigit(int number) throws MultiDigitNumberException {
        if (number < -9 || number > 9) {
            throw new MultiDigitNumberException("The number " + number + " has more than one digit.");
        }
    }
}
