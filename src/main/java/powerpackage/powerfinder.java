package powerpackage;

public class powerfinder {
    public static int OF(int xyz, int pqr) {
        int result = 1;
        for (int i = 0; i<pqr; i++) {
            result *= xyz;
        }
        return result;
    }
}
