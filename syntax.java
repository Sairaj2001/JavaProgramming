/* The following file contains random examples to explain about each concept and just to show syntax*/

public class examples{
  public static main(String[] args){
    int x = 1;
    int y = 2;
    
    // if loop   
    if ( x > y){
      System.out.println("Oh");
    }else if (){
      x++;
    }else{
      y++;
    }
  
    // while infinite loop
    while (num < 2){
      int num = console.nextInt();
      System.out.println(num);
    }
    
    // string uses "equals" method and char uses <, >=, == ...
    string str = "abcde";
    char c = 'A';
    
    // Useful methods of the Chracter class
    System.out.println(isDigit(c));
    System.out.println(isLetter(c));
    System.out.println(isLowerCase(c));
    System.out.println(isUpperCase(c));
    System.out.println(toLowerCase(c));
    System.out.println(toUpperCase(c));
    
    // printf
    System.out.printf("x value is %d", x);
    
    // Conditional Execution
    // pre: n =0
    // post: returns n factorial (n!)
      public static int factorial(int n){
        if ( n < 0 ){
          throw new IllegalArgumentException("negative n:" + n);
        }
        int product = 1;
        for (int i = 2; i <= n; i++){
          product = product *i;
        }
        return product;
      }
    
    // note: return -1 is the convention in Java if the expected result is not found
  
  }
}
