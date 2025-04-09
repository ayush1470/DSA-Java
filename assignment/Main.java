abstract class AbstractClass {
    AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();

    void normalMethod() {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends AbstractClass {
    void a_method() {
        System.out.println("This is abstract method");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of SubClass
        SubClass obj = new SubClass();

        // Call the abstract method
        obj.a_method();

        // Call the non-abstract method
        obj.normalMethod();
    }
}


