

public class insertAtBegin_LinkedList {
    class Node {
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    public class test{
         Node insertBegin(Node head,int x){
            Node temp=new Node(x);
            temp.next=head;
            return head;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head = insertBegin()
    }
}
