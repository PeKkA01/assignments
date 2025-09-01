public class MemoryAllocation {
    public static void main(String[] args) {
        int primitiveInt = 5;
        String referenceString = new String("Hello");
        System.out.println("The value of the primitive variable 'primitiveInt' is stored directly on the stack.");
        System.out.println("The reference variable 'referenceString' is stored on the stack and points to the object 'Hello' on the heap.");
    }
}