package TreeNode.PrintTreeInReverse;

public class ReverseTree {

    public static void printTree(Node root){

        if(root== null) return;

        printTree(root.right);
        System.out.print(root.value +" ");
        printTree(root.left);

    }

    /**
     *            4
     *         2      7
     *      1    3   6   10
     *             5
     */

    public static void main(String[] args) {

        Node leftNode = new Node(new Node(null,null,"1"),new Node(null,null,"3"),"2");
        Node rightNode = new Node(new Node(new Node(null,null,"5"),null,"6"),new Node(null,null,"10"),"7");


        Node rootNode = new Node(leftNode,rightNode,"4");

        printTree(rootNode);



    }

    static class Node {
        private Node left;
        private Node right;
        private String value;

        public Node(Node left, Node right, String value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }
}
