 ###  Problem Statement
Play around with the code to understand the working of Wrapper classes in Java


class WrapperClassTest {
     
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
    System.out.println("Comparing using compareTo obj1 and obj2: " + intObj1.compareTo(intObj2));
    System.out.println("Comparing using compareTo obj1 and obj3: " + intObj1.compareTo(intObj3));
    
    // Equals demo
    System.out.println("Comparing using compareTo obj1 and obj2: " + intObj1.equals(intObj2));
    System.out.println("Comparing using compareTo obj1 and obj3: " + intObj1.equals(intObj3));
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
  
  
