package tech.java.tree;

public class TestTreeNode {

  public static void main(String[] args) {
    var root = new TreeNode(8);

    root.left = new TreeNode(1);
    root.right = new TreeNode(17);

    System.out.println(root);
  }
}
