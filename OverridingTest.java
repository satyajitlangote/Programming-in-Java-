//Method Overriding in JAVA 
class Dog {
    public void bark() {
        System.out.println("woof");
    }
}

class Hound extends Dog {
    public void sniff() {
        System.out.println("sniff");
    }

    @Override
    public void bark() {
        System.out.println("bowl");
    }
}

public class OverridingTest {
    public static void main(String[] args) {
        Dog dog = new Hound();
        dog.bark();
    }
}
