import Examenpackage.*;
import java.util.*;


private class unittest {
    public static void main(String[] args) {
        System.out.println("Result of testExamen is: " + testExamen());
    }

    public static boolean testExamen() {
        return true;
    }

    public static boolean testGebruiker() {
        return true;
    }

    public static boolean testResultaat() {
        return true;
    }

    public static boolean testMain() {
        return true;
    }
}

private class Main {
    @Test
    public void testAdd1Plus1() {
        int x = 1;
        int y = 1;
        assertEquals(2, myClass.add(x, y));
    }
}