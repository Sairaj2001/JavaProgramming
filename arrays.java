public class ArrayExamples{
  public static main(String[] args){
    int[] numbers = new int[10];
    int[] daysIn = {31,28,31,4};
    String[] dayNames = {"Mon", "Tue", "Wed"};
    double[][] temps = new double[3][5]; 
    int[] list = null;
    
    int[][] jagged = new int[3][];
    jagged[0] = new int[2];
    jagged[1] = new int[4];
    jagged[2] = new int[3];
    
    /* Result:
         [0] [1] [2] [3]
    [0]   0   0
    [1]   0   0   0   0
    [2]   0   0   0
    *
    
    /* Array Initialization */
    for (int i = 0; i < numbers.legnth; i++){
      numbers[i] = i;
    }    
    
    /* Array Traversal - must not be contrained by different sizes of arrays */
    for (int i = 0; i < numbers.legnth; i++){
      System.out.print(i + " ");
    }
    
    System.out.println("Last element of an array is " + numbers[ numbers.length - 1]); 
  
    incrementAll(numbers);
  
    /* for each loop - can be used when examining each value in an array */
    for (int n : numbers){
        System.out.print(n);
    }
    
    /* Useful methods of the Ararys Class */
    // 1. Returns a copy of the array with the given size
    // copyOf(array, newSize)
    
    // 2. Reuturns a copy of the given subportion of the given array
    // copyOfRange(array, startIndex, endIndex)
    
    // 3. Returns true if both arrays have equivalent values, same legnth and same sequence of values
    // equals(array1, array2)
    
    // 4. Sets every element of the array to be the given value
    // fill(array, value)
    
    // 5. Rearragnes the elements so taht they appear in nondecreasing order
    // sort(array)
    
    // 6. Returns a String representation of the array
    // toString(array) 
  
    /* Arrays of Objects */
    Point[] points = new Point[3]; // used for storing the (x,y) coordinates of a point in two-dimensional space
    points[0] = new Point(3,7);
    points[1] = new Point(4,5);
    points[2] = new Point(6,2);
    
    points[1].translate(-1,-2); // subtract 1 from x and 2 from y
    // setLocations(x,y) // sets the coordinates to the given values
    // distance(p2) // returns the distance from this point to p2
    
  }
  
  public static void incrementAll(int[] data){
      for (int i = 0; i < data.legnth; i++){
       data[i]++;
    }
  }
  
}
