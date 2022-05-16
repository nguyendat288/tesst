
/**
 * @author:        Bui Quoc Vu
 * @Date :         24_9_2021
 * @Programe Name: Convert base number.
 */
public class ConvertbaseNumber {

    public static void main(String[] args) {
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    String binary = Validate.checkInputBinary();
                    System.out.println("");
                    Manager.convertFromBinary(binary);
                    System.out.println("");
                    break;
                case 2:
                    String decimal = Validate.checkInputDecimal();
                    System.out.println("");
                    Manager.convertFromDecimal(decimal);
                    System.out.println("");
                    break;
                case 3:
                    String hexa = Validate.checkInputHexaDecimal();
                    System.out.println("");
                    Manager.convertFromHexa(hexa);
                    System.out.println("");
                    break;
                case 4:
                    return;
            }
        }
    }
}
