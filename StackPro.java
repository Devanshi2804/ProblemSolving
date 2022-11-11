public class StackPro {

    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next=null;
        }
    }
    public void push(int data)
    {
       
        Node temp = new Node(data);  
        if(head== null)
        {
            head = new Node(data);
            return;
        }
        
        temp.next= head;
        head= temp;
    
    //  1 ->  2  ->  3 ->  4
   }

   public void pop()
   {
    if(head==null)
    {
        return;
    }   
    head=head.next;
   }

   public void peek()
   {
    if(head==null)
    {
        System.out.println("No element");
        return;
    }
    System.out.println(head.data);
   }
    
   public void printList()
   {
       Node temp = head;
       while(temp != null)
       {
           System.out.print(temp.data+" -> ");
           temp = temp.next;
       }
       System.out.println(" null");
   }
    public static void main(String[] args) {

        StackPro s = new StackPro();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.printList();
        s.peek();
        s.pop();
        s.printList();
    }
}
