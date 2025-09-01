public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("Implicit Casting (int to double): " + myDouble);
        double myNewDouble = 9.78;
        int myNewInt = (int) myNewDouble;
        System.out.println("Explicit Casting (double to int): " + myNewInt);
    }
}