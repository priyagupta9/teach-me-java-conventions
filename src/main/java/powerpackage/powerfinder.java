package powerpackage;

// Changing class name to PascalCase Convention
public class PowerFinder {
    // Changing method name to camelCase Convention
    // updating param names to meaningful name
    public static int findPow(int base, int exponent) {
        // chnging var name to meaningful name
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
