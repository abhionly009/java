package DSA;

public class TreeExample {

    TreeNode root = null;
    public void addItem(int data){

        TreeNode newNode = new TreeNode(data);
        if (root==null){
            root = newNode;
        }else {

            if (root.data<=data){
                root.left = newNode;
            }else {
                root.right = newNode;
            }

        }

    }

    public void display(){

        TreeNode temp = root;
        while (temp!=null){
            System.out.println(temp.left.data);
            temp = temp.left;
        }
        while (temp!=null){
            System.out.println(temp.right.data);
            temp = temp.right;
        }

    }


    public static void main(String[] args) {

        TreeExample treeExample = new TreeExample();
        treeExample.addItem(10);
        treeExample.addItem(12);
        treeExample.addItem(14);
        treeExample.addItem(8);

        treeExample.display();


    }
}
