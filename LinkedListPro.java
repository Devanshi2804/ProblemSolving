public class LinkedListPro {
    Node head;

   public class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null; 
        }
        
    }

        
 public void insertHead( int data)
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

        public void insertAfter(Node prev_node, int new_data)
    {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
 
        Node new_node = new Node(new_data);
       new_node.next = prev_node.next;
        prev_node.next = new_node;
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
   
        public void insertTail(int data)
        {
            Node temp = head;
            Node p = new Node(data);
          
            if(head== null)
            {
                head = new Node(data);
                return;
            }
            while(temp.next!=null)
            {
                temp= temp.next;

            }
            temp.next = p;
        }
    public static void main(String[] args) {
        LinkedListPro l = new LinkedListPro();
   
     l.insertHead(1);
     l.insertHead(2);
     l.insertTail(3);
     l.printList();
     l.pop();
     l.printList();
     l.peek();
     l.pop();
     l.peek();
   }
}
