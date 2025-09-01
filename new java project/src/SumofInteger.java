import java.util.Scanner;
public class SumofInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number(a):");
        int a = sc.nextInt();
        System.out.println("enter second number(b):");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(a + "+" + b + "="+ c);
        sc.close();
    }
}
