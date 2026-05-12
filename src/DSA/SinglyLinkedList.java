package DSA;

public class SinglyLinkedList {

    Node head;


    public void insert(int data){

        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            Node temp = head;

            while(temp.next!=null){
                temp =  temp.next;
            }

            temp.next = newNode;

        }
        System.out.println();

    }


    public void display()
    {
      Node temp = head;

      while (temp!=null){
          System.out.print(temp.data + " -> ");

          temp =temp.next;
      }
        System.out.println("null");
    }

    public void insertItemAtStart(int data){

        Node newNode = new Node(data);

        if (head==null){
            head = newNode;
            return;
        }else {
            newNode.next = head;
            head = newNode;
        }


    }

    public void size(){
        int count = 0;

        if (head==null){
            System.out.println("No element in the list");
        }else{

            Node temp = head;
            while (temp!=null){
                count++;
                temp = temp.next;
            }
        }

        System.out.println("Total element in list " + count);

    }

    public void findElement(int data){

        boolean found = false;
        if (head==null){
            System.out.println("There is no data in list");
        }else{

            Node temp = head;
            while (temp!=null){
                if(temp.data==data){
                    found = true;
                    System.out.println("Data found " + data );
                    break;
                }
                temp = temp.next;
            }

        }

        if (!found){
            System.out.println("No item found with given data " + data);
        }
    }


    public void deleteFirstElement(){

        if (head == null){
            System.out.println("There is no data to delete list is empty");

        }else{
            head = head.next;
        }
    }


    public void reverse(){
        Node prev = null;
        Node current = head;

        while(current!=null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }



    public static void main(String[] args) {


        SinglyLinkedList list = new SinglyLinkedList();


        list.insert(10);
        list.insert(20);
        list.insert(40);

        list.insertItemAtStart(90);
        list.insert(40);

        list.insertItemAtStart(100);

        list.insert(300);

        list.display();

        list.size();
        list.findElement(40);
//        list.deleteFirstElement();
        list.size();

        list.reverse();

        list.display();

    }





}
