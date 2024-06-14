import java.util.*;
public class LinkedListExample {
    static Node head = null;
    private int size;

    LinkedListExample(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // add - first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(String data){
        Node neaNode = new Node(data);
        if(head == null){
            head = neaNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = neaNode;

    }
    //print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ->");
            curr = curr.next;
        }
        System.out.println("Null");
    }
    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last= last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        Node prev = head;
        Node curr = head.next;
        if(head == null || head.next == null){
            return;
        }
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;

            //update
            prev = curr;
            curr = nextNode;
        }
        head.next = null;
        head = prev;
    }

    public Node reverseRecurcive(Node head){
        if(head == null || head.next == null){
            return head;
        }
       Node newHead =  reverseRecurcive(head.next);
       head.next.next = head;
       head.next = null;

       return newHead;
    }
    public static void main(String[] args) {
        // LinkedList<String> list = new LinkedList<>();
        // list.addFirst("this");
        // list.addFirst("ght");
        // System.out.println(list);

        // list.addLast("yuo");
        // System.out.println(list.size());
        
        LinkedListExample list = new LinkedListExample();
        list.addFirst("a");
        list.addFirst("id");
        //list.printList();
        list.addLast("gh");
        list.addFirst("wht");
        list.printList();
        list.head = list.reverseRecurcive(list.head);
        list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();
        // System.out.println(list.getSize());
        // list.addFirst("this");
        // System.out.println(list.getSize());
    }
}
