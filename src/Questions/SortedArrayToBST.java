package Questions;

public class SortedArrayToBST {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root;

    public static Node sortedArrayToBST(int[] array,int start, int end) {
        if(start> end){
            return null;
        }
        int mid = start + (end-start)/2;

        Node node = new Node(array[mid]);
        node.left = sortedArrayToBST(array,start,mid-1);
        node.right = sortedArrayToBST(array,mid+1,end);

        return node;
    }

    public static void preOrder(Node node){
        if(node == null){
            System.out.print(" " + -1 + " ");
            return;
        }
        System.out.print(" " + node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int start = 0;
        int end = array.length-1;
        root = sortedArrayToBST(array,start,end);
        preOrder(root);
    }
}
