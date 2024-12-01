package tech.java.tree.bst;

import java.util.random.RandomGenerator;
import tech.java.tree.TreeNode;

public class TestBinarySearchTree {

  public static void main(String[] args) throws InterruptedException {
    BinarySearchTree bst = new BinarySearchTree();
    TreeNode root = null;
    for (int i = 0; i < 10; i++) {
      int num = RandomGenerator.getDefault().nextInt(1, 100);
      root = bst.insert(root, num);
    }

   /* IntStream.rangeClosed(1, 20)
        .map(num -> RandomGenerator.getDefault().nextInt(1, 100))
        .boxed()
        .forEach(num -> bst.insert(bst.root, num));*/

    //System.out.println(bst);

    bst.printBstNodes(root);
  }

}
