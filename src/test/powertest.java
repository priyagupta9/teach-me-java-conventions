package powerpackage;


import org.junit.Assert.assertEquals;

// following PascalCase convention for class name
// following camelCase convention for method name
// Updating method calls to reflect change made in java file
// swapping assert to assertEquals() for better error messages
public class powertest {
    @Test
    public void oneRaisedToOneIsOne() {
        assertEquals(PowerFinder.findPow(1, 1));
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assertEquals(PowerFinder.findPow(2, 1));
    }

    @Test
    public void twoPowerTwoIsFour() {
        assertEquals(PowerFinder.findPow(2, 2));
    }

    @Test
    public void powerOfTwoAndThreeIsSix() {
        assertEquals(PowerFinder.findPow(3, 2));
    }
}
