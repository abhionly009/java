package DSA;

public class AddLTwoList {


    public  Node reverse(Node head){
        Node prev = null;
        Node current = head;

        while(current!=null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
        return head;
    }

    public static void main(String[] args) {

        AddLTwoList current = new AddLTwoList();

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insert(7);
        list1.insert(8);
        list1.insert(2);


        SinglyLinkedList list2 = new SinglyLinkedList();

        list2.insert(5);
        list2.insert(6);
        list2.insert(2);

//        current.reverse(list1);
//        current.reverse(list2);
//
    }
}
