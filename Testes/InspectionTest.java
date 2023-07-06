/*@FunctionalInterface
public interface InspectionTest<T> {
    boolean inspectAction(T testedValue, T correctValue);
}

public static void genericTest(InspectionTest<Double> test, String testName, double testedValue, double correctValue) {
    if (test.inspectAction(testedValue, correctValue)) {
        System.out.println("Test " + testName + " passed!");
    } else {
        System.out.println("Test " + testName + " failed!");
    }
}

public static void main(String[] args) {
    // Test CO2 needs to pass
    genericTest((value1, value2) -> value1 <= value2, "CO2", 5.0, 10.0);

    InspectionTest<Integer> newTest = (x, y) -> x > y;

    // Test Lights needs to fail
    genericTest((light, expectedValue) -> light == 0, "Lights", 10, 10);
}
*/