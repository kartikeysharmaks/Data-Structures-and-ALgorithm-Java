package Questions;

public class ReverseALinkedListInGroupsOfGivenSize {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public Node reverse(Node head , int size){
        if(head == null){
            return null;
        }
        Node currentNode = head;
        Node prev = null;
        Node next = null;

        int count = 0;
        while (count < size && currentNode != null){
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
            count++;
        }
        if (next != null)
            head.next = reverse(next, size);

        return prev;
    }

    public void printList()
    {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }




    public static void main(String[] args) {
        ReverseALinkedListInGroupsOfGivenSize ll = new ReverseALinkedListInGroupsOfGivenSize();
        ll.push(9);
        ll.push(8);
        ll.push(7);
        ll.push(6);
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        System.out.println("Given Linked List");
        ll.printList();
        ll.head = ll.reverse(ll.head, 3);
        System.out.println("Reversed list");
        ll.printList();
    }
}
