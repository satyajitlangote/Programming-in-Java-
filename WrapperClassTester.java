Highlights:

To understand Wrapper class in Java.
To understand the creation and execution of a program on Wrapper class in Java.
Demo steps:
Objective: To understand Wrapper class in Java

Steps: Create Wrapper class as follows and save it in a file named WrapperClassTester.java

Observe the use of Wrapper class

WrapperClassTester.java

 


  
  class WrapperClassTester {
    public static void main(String[] args) {
    int i = 45;//primitive data int
    Integer integer = new Integer(i);// Integer wrapper class instantiation
    int i2 = integer.intValue();// unwrapping primitive data int from wrapper object
    Integer integer2 = new Integer("23");
    // all wrapper class except Character can take String in argument
    System.out.println(integer2);
    Integer intObj1 = new Integer(25);
    Integer intObj2 = new Integer("25");
    Integer intObj3 = new Integer(35);
    //compareTo demo
    System.out.println("Comparing using compareTo Obj1 and Obj2: " + intObj1.compareTo(intObj2));
    System.out.println("Comparing using compareTo Obj1 and Obj3: " + intObj1.compareTo(intObj3));
    // Equals demo
    System.out.println("Comparing using equals Obj1 and Obj2: " + intObj1.equals(intObj2));
    System.out.println("Comparing using equals Obj1 and Obj3: " + intObj1.equals(intObj3));
    Float f1 = new Float("2.25f");
    Float f2 = new Float("20.43f");
    Float f3 = new Float(2.25f);
    System.out.println("Comparing using compare f1 and f2: " + Float.compare(f1,f2));
    System.out.println("Comparing using compare f1 and f3: " + Float.compare(f1,f3));
    // Addition of Integer with Float
    Float f = intObj1.floatValue() + f1;
    System.out.println("Addition of intObj1 and f1: "+ intObj1 + "+" + f1 + "=" + f);
    int x = Integer.parseInt("34");
    System.out.println(x);
    double y = Double.parseDouble("34.7");
    System.out.println(y);
    }
  }
  
  


O
