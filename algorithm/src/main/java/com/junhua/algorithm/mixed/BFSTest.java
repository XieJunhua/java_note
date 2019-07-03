package com.junhua.algorithm.mixed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTest {

  public static void main(String[] args) {

  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    // 用queue存放每一层的节点
    ((LinkedList<TreeNode>) queue).addFirst(root);
    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      List<Integer> currLevel = new ArrayList<>();

      for (int i = 0; i < levelSize; i++) {
        TreeNode currNode = queue.poll();
        currLevel.add(currNode.val);
        if (currNode.left != null) {
          ((LinkedList<TreeNode>) queue).add(currNode.left);
        }
        if (currNode.right != null) {
          ((LinkedList<TreeNode>) queue).add(currNode.right);
        }
      }
      result.add(currLevel);
    }
    return result;
  }

  public int maxDepth(TreeNode root) {
      return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }
}



class TreeNode {
  TreeNode left;
  TreeNode right;
  int val;

}
