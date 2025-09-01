public class DefaultValues {
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;
    String defaultString;
    public static void main(String[] args) {

        DefaultValues defaults = new DefaultValues();

        System.out.println("Default value for byte: " + defaults.defaultByte);
        System.out.println("Default value for short: " + defaults.defaultShort);
        System.out.println("Default value for int: " + defaults.defaultInt);
        System.out.println("Default value for long: " + defaults.defaultLong);
        System.out.println("Default value for float: " + defaults.defaultFloat);
        System.out.println("Default value for double: " + defaults.defaultDouble);
        System.out.println("Default value for char: '" + defaults.defaultChar + "'");
        System.out.println("Default value for boolean: " + defaults.defaultBoolean);
        System.out.println("Default value for String: " + defaults.defaultString);
    }
}