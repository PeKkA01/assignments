class VariableDemo {
    public int instanceCount = 0;
    public static int staticCount = 0;
    public VariableDemo() {
        instanceCount++;
        staticCount++;
    }
}

public class StaticVsInstance {
    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();

        System.out.println("Object 1 Instance Count: " + obj1.instanceCount);
        System.out.println("Object 2 Instance Count: " + obj2.instanceCount);
        System.out.println("Static Count (shared): " + VariableDemo.staticCount);
    }
}