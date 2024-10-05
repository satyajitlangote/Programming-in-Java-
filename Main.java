// 
interface CanFly {
    void fly();
}
interface CanSwim {
    void swim();
}
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
class Duck extends Animal implements CanFly, CanSwim {
    public void fly() {
        System.out.println("The duck can fly.");
    }

    public void swim() {
        System.out.println("The duck can swim.");
    }
}
public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.eat();   
        duck.fly();  
        duck.swim();  
    }
}
