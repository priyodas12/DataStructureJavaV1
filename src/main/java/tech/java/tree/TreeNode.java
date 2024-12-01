package tech.java.tree;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TreeNode {

  public int data;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  @Override
  public String toString() {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(this);
  }
}
