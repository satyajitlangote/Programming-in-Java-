

Highlights:

To understand String in Java.
To understand the creation and execution of a program on String in Java.
Demo steps:
Objective: To understand String in Java.

Steps: Create a Bank class as follows and save it in a file named Bank.java

Observe the use of String class

Bank.java

      
      class Bank{
        public static void main(String[] args){
          String username = "Tendulkar";
          int size = username.length();
          if(size > 8 && size <15){
            char arr[]=username.toCharArray();
            int count=0;
            for(char c:arr){
              if(Character.isLetter(c)){
                ++count;
              }
            }
            if(count == size){
              System.out.println("valid username");
            }
          }
        }
      }
      
      
Compile and execute the code to see the following output:

      
      Output:valid username
