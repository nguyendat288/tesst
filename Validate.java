/**
 * @author:        Bui Quoc Vu
 * @Date :         24_9_2021
 * @Programe Name: Convert base number.
 */
import java.util.Scanner;

public class Validate {

    private final static Scanner sc = new Scanner(System.in);
    private static final String BINARY_VALID = "[0-1]*";
    private static final String DECIMAL_VALID = "[0-9]*";
    private static final String HEXADECIMAL_VALID = "[0-9A-F]*";

    //Kiem tra gia tri nhap vao
    public static int checkInput(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease input number in rage [" + min + ", " + max + "].\n");
                System.out.print("Enter again: ");
            }
        }
    }

    //Kiem tra nhap vao gia tri binary
    public static String checkInputBinary() {
        System.out.print("Enter number binary: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(BINARY_VALID)) {
                return result;
            }
            System.out.println("\nMust be enter 0 or 1\n");
            System.out.print("Enter again: ");
        }
    }

    //Kiem tra nhap vao gia tri decimal
    public static String checkInputDecimal() {
        System.out.print("Enter number decimal: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(DECIMAL_VALID)) {
                return result;
            }
            System.out.println("\nMust be enter 0-9\n");
            System.out.print("Enter again: ");
        }
    }

    //Kiem tra nhap vao la so hex
    public static String checkInputHexaDecimal() {
        System.out.print("Enter number hexadecimal: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(HEXADECIMAL_VALID)) {
                return result;
            }
            System.out.println("\nMust be enter 0-9, A-F\n");
            System.out.print("Enter again: ");
        }
    }
}
