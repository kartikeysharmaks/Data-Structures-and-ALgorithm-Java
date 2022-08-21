public class LinkedList {
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size ++;
        }
    }

    Node head;

    int size;

    LinkedList(){
        this.size = 0;
    }

    public void addNodeAtFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addNodeAtLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next= newNode;
    }

    public void deleteFromFirst(){
        if (head == null){
            System.out.println("The List is empty, Nothing to delete here");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteFromLast(){
        if (head == null){
            System.out.println("The List is empty, Nothing to delete here");
            return;
        }
        size--;
        if (head.next == null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode= lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void reverse(){
        if (head== null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode!= null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next=null;
        head= prevNode;
    }

    public Node reserveLL(Node head){
        if (head == null){
            return null;
        }
        Node newHead= reserveLL(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currentNode = head;
        while (currentNode!= null){
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNodeAtFirst("is");
        list.addNodeAtLast("Kartik");
        list.addNodeAtFirst("name");
        list.addNodeAtFirst("My");
        list.printList();
        list.addNodeAtLast("Sharma");
        list.printList();
        list.deleteFromFirst();
        list.printList();
        list.deleteFromLast();
        list.printList();
        list.deleteFromLast();
        list.deleteFromFirst();

        list.printList();
        list.deleteFromFirst();

        list.printList();
        list.deleteFromFirst();

        System.out.println(list.getSize());

        list.addNodeAtLast("The");
        System.out.println(list.getSize());
        list.printList();
        list.addNodeAtLast("Ram");
        list.addNodeAtFirst("Shyam");
        list.addNodeAtFirst("is");
        list.printList();
        list.reverse();
        list.printList();
        list.reserveLL(list.head);
    }

}
