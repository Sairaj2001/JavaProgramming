/* Basic ListNode Contructor*/
public class ListNode{
  public int data;
  public ListNode next; 

  // post: constructs a node with data 0 and null link
  public ListNode(){
    this(0,null);
  }
  
  // post: constructs a node with given data and null link
  public ListNode(int data){
    this(data, null);
  }
  
  // post: constructs a node with give ndata and given link
  public ListNode(int data, ListNode next){
    this.data = data;
    this.next = next;
  };
}

ListNode list; // construct a list, not itself a node
list = new ListNode(); 
list.data = 3;
list.next = new ListNode();

/* Traversing a list */
// assume list-> (3,) -> (5,) -> (2,null)
ListNode current = list;
while (current != null){
  Systemout.println(current.data);
  current = current.next;
}



public class LinkedIntList{
    private ListNode front; // first value in the list
    
    public LinkedINList(){
      front = null;
    }
    
    public int size(){
      int count = 0;
      ListNode current = front;
      while (current != null){
        current = current.next;
        count++;
      }
      return count;
    }
    
    public void add(int value){
      if(front == null){
        front - new ListNode(value);
      }else{
        ListNode current = front;
        while ( current != null){
          current = current.next;
        }
        current.next = new ListNode(value);
      }
    }
}
