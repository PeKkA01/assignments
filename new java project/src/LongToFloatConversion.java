public class LongToFloatConversion {
    public static void main(String[] args) {
        long largeLong = 987654321098765432L;
        float floatValue = largeLong;

        System.out.println("Original long value: " + largeLong);
        System.out.println("Float value after conversion: " + floatValue);

        if (largeLong == (long) floatValue) {
            System.out.println("The values are identical. No precision was lost.");
        } else {
            System.out.println("The values are not identical. Precision was lost during conversion.");
        }
    }
}