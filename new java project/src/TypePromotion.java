public class TypePromotion {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        char c = 'A';
        int result = b + s + c;
        System.out.println("Result of type promotion (10 + 20 + 65): " + result);
    }
}