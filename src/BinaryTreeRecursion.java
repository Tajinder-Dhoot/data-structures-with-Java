import java.util.ArrayList;

public class BinaryTreeRecursion {

    public int[] combineArrays(int arr1[], int arr2[], int arr3[]) {
        int[] finalArr = new int[arr1.length + arr2.length + arr3.length];
        for (int i = 0; i < arr1.length; i++) {
            finalArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            finalArr[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            finalArr[arr1.length + arr2.length + i] = arr3[i];
        }

        return finalArr;
    }

    int index = 0;

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

    public ArrayList<Integer> PreOrderTraversal(TreeNode root) {

        if (root == null) {
            return null;
        }
        ArrayList<Integer> values = new ArrayList<>();

        values.add(root.data);
        int left = PreOrderTraversal(root.left);
        int right = PreOrderTraversal(root.right);

        return combineArrays({root.data}, {}, null);
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreeRecursion tree = new BinaryTreeRecursion();
        TreeNode root = tree.buildTree(nodes);

        System.out.println(tree.PreOrderTraversal(root));

        // tree.InOrderTraversal(root);
        // System.out.println();
        // tree.PostOrderTraversal(root);

        // int[] arr1 = { 1, 2, 3, 4, 5 };
        // int[] arr2 = { 6, 7, 8, 9 };
        // int[] arr3 = { 10 };

        // int[] finalArr = tree.combineArrays(arr1, arr2, arr3);
        // for (int i = 0; i < finalArr.length; i++) {
        // System.out.print(finalArr[i] + " ");
        // }
    }
}
