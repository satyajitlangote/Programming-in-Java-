

Questions :- Example to understand the behavior of the access modifiers.

class Person{
    private int salary = 5000;
    public String name = "Jack";
    protected int age = 24;
    String email = "jack@samurai.com";
    
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Person {
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    } 
}

class Customer {
    public void display(){
        Person p = new Person();
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
        System.out.println("Email: " + p.email);
    }
}

class Execute{
    public static void main (String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        Customer c =  new Customer();
        System.out.println("******************************");
        System.out.println("Person Class display method.");
        System.out.println("******************************");
        p.display();
        System.out.println("******************************");
        System.out.println("Employee Class display method.");
        System.out.println("******************************");
        e.display();
        System.out.println("******************************");
        System.out.println("Customer Class display method.");
        System.out.println("******************************");
        c.display();
    }
}

