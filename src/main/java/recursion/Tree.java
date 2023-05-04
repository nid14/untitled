package recursion;

public class Tree {

    public static TreeNode returnTree(){
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left= new TreeNode(5);
        root.right.right= new TreeNode(6);
        root.right.right.left= new TreeNode(8);

        return root;

    }

    public static void printInOrderTraversal(TreeNode root){
        if (root==null){
            return;
        }
        printInOrderTraversal(root.left);
        System.out.println(root.val);
        printInOrderTraversal(root.right);
    }

    public static void printPreOrderTraversal(TreeNode root){
        if (root==null){
            return;
        }
        System.out.println(root.val);
        printPreOrderTraversal(root.left);
        printPreOrderTraversal(root.right);
    }

    public static void printPostOrderTraversal(TreeNode root){
        if (root==null){
            return;
        }
        printPostOrderTraversal(root.right);
        System.out.println(root.val);
        printPostOrderTraversal(root.left);

    }

    public static int heightOfTree(TreeNode root){
       if(root==null){
           return  0;
       }
       int leftHeight = heightOfTree(root.left);
       int rightHeight = heightOfTree(root.right);
       int height = 1+Math.max(leftHeight,rightHeight);
       return height;
    }

    public static void main(String[] args){
//        printInOrderTraversal(returnTree());
//        printPreOrderTraversal(returnTree());
//        printPostOrderTraversal(returnTree());
        System.out.println(heightOfTree(returnTree()));


    }
}
