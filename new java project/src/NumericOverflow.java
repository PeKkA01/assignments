public class NumericOverflow {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Maximum integer value: " + maxInt);
        int overflowInt = maxInt + 1;
        System.out.println("Overflowed integer value: " + overflowInt);
    }
}