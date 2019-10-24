public class SQExample{
  public static main(String[] args){
      /* Stack is LIFO */
      Stack<String> a = new Stack<String>();
      a.push("str1");
      a.pop();  // removes and returns the value at the top of the stack
      a.isEmpty();
      a.peek(); // returns the value at the top of the stack without removing it
      a.size();
      
      /* Queue is FIFO* /
      Queue<String> b = new LinkedList<String>(); 
      b.add("str1");  // adds the given value at the back of the queue
      b.remove(); // removes and returns the value at the front of the queue
      b.isEmpty();
      b.peek(); // returns the value at the front of the queue without removing it
      b.size();      
  }
}
