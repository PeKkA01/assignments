public class WrapperClassMethods {
    public static void main(String[] args) {
        int number = 255;
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation of " + number + ": " + binaryString);
        String hexString = Integer.toHexString(number);
        System.out.println("Hexadecimal representation of " + number + ": " + hexString);
    }
}