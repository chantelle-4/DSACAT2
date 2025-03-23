public class linkedlist {

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next= null;

        }
    }
    private Node head;
    //Insert a mode at the beginning
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
        System.out.println(value + " added at the beginning.");
    }
    //insert node at the end
    public void addLast(int value) {
        Node newNode = new Node (value);
        if (head == null) {
            head = newNode;

        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;

            }
            current.next = newNode;


        }
        System.out.println(value + " added at the end.");

    }
    //delete a node from the beginning
    public void removeFirst() {
        if (head == null) {
            System.out.println("list is empty.nothing to remove.");

        } else {
            System.out.println(head.value + " remove at the beginning.");
            head = head.next;

        }
    }
    //display the linked list
    public void showList() {
        if (head == null) {
            System.out.println("list is empty.");
            return;

        }
        Node temp = head;
        System.out.println("linked list:");
        while (temp != null) {
            System.out.println(temp.value + "->");
            temp = temp.next;


        }
        System.out.println("NULL");

    }
    //Main method
    public static void main(String[]args) {
        linkedlist myList = new linkedlist();
        myList.addFirst(100);
        myList.addFirst(70);
        myList.addLast(30);
        myList.showList();

        myList.removeFirst();
        myList.showList();
    }
}

