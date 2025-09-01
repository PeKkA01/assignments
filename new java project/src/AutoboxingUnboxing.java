public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int primitiveInt = 100;
        Integer wrapperInt = primitiveInt;
        System.out.println("Autoboxing (int to Integer): " + wrapperInt);
        int newPrimitiveInt = wrapperInt;
        System.out.println("Unboxing (Integer to int): " + newPrimitiveInt);
    }
}