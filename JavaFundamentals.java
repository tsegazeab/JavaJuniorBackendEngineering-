public class JavaFundamentals {

    int age = 25;
    double salary = 5000.50;
    String name = "John Doe";
    boolean isEmployed = true;

    public JavaFundamentals() {
        System.out.println("Java Fundamentals");
    }

    public void variables() {
        JavaFundamentals jf = new JavaFundamentals();
        System.out.println("Age: " + jf.age);
        System.out.println("Salary: " + jf.salary);
        System.out.println("Name: " + jf.name);
        System.out.println("Employed: " + jf.isEmployed);
    }

    public void Operators() {
        int x = 5;
        int y = 3;
        int sum = x + y; // Addition operator
        int difference = x - y; // Subtraction operator
        int product = x * y; // Multiplication operator
        double division = (double) x / y; // Division operator
        boolean isGreater = x > y; // Comparison operator
        System.out.println("sum: "+sum);
        System.out.println("difference: "+difference);
        System.out.println("product: "+product);
        System.out.println("division: "+division);
        System.out.println("isGreater: "+isGreater);

    }

    public static void main(String[] args) {
        JavaFundamentals jf = new JavaFundamentals();
        jf.variables();

    }
}
