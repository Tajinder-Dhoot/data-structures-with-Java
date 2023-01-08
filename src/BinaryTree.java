public class BinaryTree {

    int index = -1;

    public TreeNode buildTree(int nodes[]) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        TreeNode newNode = new TreeNode(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public void PreOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);

        return;
    }

    public void InOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        InOrderTraversal(root.left);
        System.out.print(root.data + " ");
        InOrderTraversal(root.right);

        return;
    }

    public void PostOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data + " ");

        return;
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);

        tree.PreOrderTraversal(root);
        System.out.println();
        tree.InOrderTraversal(root);
        System.out.println();
        tree.PostOrderTraversal(root);
    }

}
