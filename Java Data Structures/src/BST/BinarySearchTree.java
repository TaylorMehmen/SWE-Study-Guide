package BST;

public class BinarySearchTree<T extends Comparable<T>> {
    private TreeNode<T> root;
    private class TreeNode<T extends Comparable<T>> {
        private T data;
        private TreeNode<T> left;
        private TreeNode<T> right;

        public TreeNode(T data) {
            this.data = data;
        }
    }
    public void insert(T value) {
        this.root = insertMethod(value, this.root);
    }

    private TreeNode<T> insertMethod(T value, TreeNode<T> root) {
        if (root == null) {
            return new TreeNode<>(value);
        }
        if (root.data.compareTo(value) >= 0){
            root.right = insertMethod(value, root.right);
        }
        else if (root.data.compareTo(value) < 0) {
            root.left = insertMethod(value, root.left);
        }
        return root;
    }

    public TreeNode<T> search(T value, TreeNode<T> root) {
        if (root == null || root.data.equals(value)) {
            return root;
        }
        if (root.data.compareTo(value) > 1) {
            return search(value, root.left);
        }
        return search(value, root.right);
    }

    public void delete(T value) {
        this.root = deleteMethod(value, this.root);
    }

    private TreeNode<T> deleteMethod(T value, TreeNode<T> root) {
        if (root == null) {
            return root;
        }
        if (root.data.compareTo(value) > 1) {
            root.left = deleteMethod(value, root.left);
        }
        else if (root.data.compareTo(value) < 1) {
            root.right = deleteMethod(value, root.right);
        }
        else {
            //on equal node
            //if 0 or 1 children
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            //if 2 children
            //get smallest in right sub tree
            root.data = minValue(root.right);
            //delete value rotated up
            root.right = deleteMethod(root.data, root.right);
        }
        return root;
    }

    private T minValue(TreeNode<T> root) {
        T minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }




}
