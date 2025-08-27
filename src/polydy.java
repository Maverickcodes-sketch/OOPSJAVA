public class polydy{


    int add(int a, int b) {
        System.out.println("Adding integers:");
        return a + b;
    }


    double add(double a, double b) {
        System.out.println("Adding doubles:");
        return a + b;
    }

    public static void main(String[] args) {
        polydy calc = new polydy();

        int intResult = calc.add(10, 20);
        double doubleResult = calc.add(5.5, 4.5);

        System.out.println("Integer result: " + intResult);
        System.out.println("Double result: " + doubleResult);
    }
}
