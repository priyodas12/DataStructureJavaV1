package tech.java.tree.bst;

import tech.java.tree.TreeNode;

public class BinarySearchTree {

  TreeNode root;

  BinarySearchTree() {
    this.root = null;
  }

  public TreeNode insert(TreeNode root, int value) {
    if (root == null) {
      root = new TreeNode(value);
      return root;
    }

    if (value <= root.data) {
      root.left = insert(root.left, value);
    } else {
      root.right = insert(root.right, value);
    }
    return root;
  }

  public void printBstNodes(TreeNode root) {
    if (root != null) {
      printBstNodes(root.left);
      System.out.println(root.data + " \n");
      printBstNodes(root.right);
    }
  }


  public void insertRecursiveWay(int value) {
    insert(this.root, value);
  }

  public void insertElement(int value) {
    if (this.root == null) {
      this.root = new TreeNode(value);
      return;
    }

    TreeNode current = this.root;
    while (true) {
      if (value <= current.data) {
        //moving to-words left
        if (current.left == null) {
          current.left = new TreeNode(value);
          break;
        }
        current = current.left;
      } else {
        //moving to-words right
        if (current.right == null) {
          current.right = new TreeNode(value);
          break;
        }
        current = current.right;
      }
    }
  }

}
