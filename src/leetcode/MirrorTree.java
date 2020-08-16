package leetcode;

public class MirrorTree {

    Node root;

    static class Node{
        int data;
        Node left,right;
    }

    static Node newNode(int data){
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    public static void main(String [] args){
        MirrorTree mirrorTree = new MirrorTree();
        mirrorTree.root = newNode(1);
        mirrorTree.root.left = newNode(2);
        mirrorTree.root.right = newNode(3);
        mirrorTree.root.left.left = newNode(4);
        mirrorTree.root.left.right = newNode(5);

        System.out.println("Inorder traversal is ");
        mirrorTree.inOrder(mirrorTree.root);
        System.out.print(" ");
        mirrorTree.mirror(mirrorTree.root);
        System.out.println("Inorder traversal mirrored is ");
        mirrorTree.inOrder(mirrorTree.root);

    }

    private Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;
        return  root;
    }

    private void inOrder(Node root){
        if(root == null) {return;}
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }
}
