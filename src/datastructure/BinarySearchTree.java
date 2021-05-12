package datastructure;

/**
 * @Description 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
 * @ClassName BinarySearchTree
 * @Author Miatum
 * @date 2021.04.13 14:41
 */
public class BinarySearchTree {
    int val;
    BinarySearchTree left;
    BinarySearchTree right;
    public BinarySearchTree(){}
    public BinarySearchTree(int val) {
        this.val = val;
    }
    public BinarySearchTree(int val, BinarySearchTree left, BinarySearchTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    // 中序递归遍历
    public void inorder(BinarySearchTree root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }
    // 前序遍历
    public void preorder(BinarySearchTree root) {
        if (root != null) {
            System.out.println(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }
    // 后序遍历
    public void aforder(BinarySearchTree root) {
        if (root != null) {
            aforder(root.right);
            System.out.println(root.val);
            aforder(root.left);
        }
    }
}
