package oata;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

public class HelloWorldTest extends junit.framework.TestCase {

    public void testNothing() {
    }
    
    public void testWillAlwaysFail() {
        fail("An error message");
    }
    
}