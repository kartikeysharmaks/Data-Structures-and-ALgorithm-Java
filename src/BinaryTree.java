public class BinaryTree {
     static class Node{
        int data;
         Node left;
         Node right;

         public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class tree{
        static int idx = -1;
        public Node createBinaryTree(int [] nodes){
            idx++;
            if (nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = createBinaryTree(nodes);
            newNode.right = createBinaryTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root){
            if(root == null){
                System.out.print(" " + -1 + " ");
                return;
            }
            System.out.print(" " + root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if (root == null){
                System.out.print(" "+ -1 + " ");
                return;
            }
            inOrder(root.left);
            System.out.print(" "+ root.data +" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if (root == null){
                System.out.print(" " + -1 + " ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" "+ root.data + " ");
        }

       /* public static void levelOrder(Node root){
            if (root == null){
                System.out.println(-1 + " ");
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (queue != null){
                Node currentNode = queue.remove();
                if (currentNode ==  null){
                    System.out.println();
                    if(queue == null){
                        break;
                    }
                    else {
                        queue.add(null);
                    }
                }else {
                    System.out.println(currentNode.data+ " ");
                    if ()
                }
            }
        }

        */

        public static int heightOfTree(Node root){
            if (root == null){
                return 0;
            }
            int leftHeight = heightOfTree(root.left);
            int rightHeight= heightOfTree(root.right);
            return 1 +  Math.max(leftHeight, rightHeight);
        }

        public static int countOfNodes(Node root){
            if (root == null){
                return 0;
            }
            int leftNode = countOfNodes(root.left);
            int rightNode = countOfNodes(root.right);
            return rightNode + leftNode + 1;
        }

        public static int sumOfNodes(Node root){
            if (root == null){
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        public static int diameter(Node root){
            if (root == null){
                return 0;
            }
            int diam1 = heightOfTree(root.right) + heightOfTree(root.left) + 1;
            int diam2 = diameter(root.left);
            int diam3 = diameter(root.right);
            return Math.max(Math.max(diam1, diam2), diam3);
        }



    }

    public static void main(String[] args) {
        int [] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        tree bt = new tree();
        Node root = bt.createBinaryTree(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        System.out.println(tree.countOfNodes(root));
        System.out.println(tree.sumOfNodes(root));
        System.out.println(tree.heightOfTree(root));
        System.out.println(tree.diameter(root));
     }
}
