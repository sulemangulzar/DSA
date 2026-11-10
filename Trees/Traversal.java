public class Traversal {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    static void inorder(Node root){
        if (root == null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    static void preorder(Node root) {

    if (root == null) {
        return;
    }

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
    }

    static void postorder(Node root) {

    if (root == null) {
        return;
    }

    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}
}
