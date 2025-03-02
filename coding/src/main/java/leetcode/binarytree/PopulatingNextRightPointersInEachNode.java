package leetcode.binarytree;

public class PopulatingNextRightPointersInEachNode {

    public Node connect(Node root) {
        connectChildren(root);
        traverse(root);
        return root;
    }

    private void connectChildren(Node curr) {
        if (curr == null) return;

        if (curr.left != null && curr.right != null) {
            curr.left.next = curr.right;
        }
        connectChildren(curr.left);
        connectChildren(curr.right);
    }

    private boolean hasChildren(Node node){
        return node.left !=null || node.right!=null;
    }

    private Node getNextParent(Node root){
        Node next = root.next;
        while(next != null && !hasChildren(next)){
            next = next.next;
        }

        return next;
    }

    private void connectCousins(Node root){
        if(!hasChildren(root)) return;

        Node nextParent = getNextParent(root);
        if(nextParent == null) return;

        Node rootChild = root.right ==null ? root.left : root.right;
        Node nextChild = nextParent.left == null ? nextParent.right : nextParent.left;
        if(rootChild != null) rootChild.next = nextChild;

        connectCousins(nextParent);
    }

    private void traverse(Node root){
        if(root == null) return;
        if((root.left != null && root.left.next == null) || (root.right!=null &&root.right.next == null)) connectCousins(root);
        traverse(root.left);
        traverse(root.right);
    }


}
