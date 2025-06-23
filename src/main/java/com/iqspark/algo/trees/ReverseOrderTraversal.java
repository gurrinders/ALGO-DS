package com.iqspark.algo.trees;

import java.util.*;


class ReverseOrderTraversal {
   public static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                // add the node to the current level
                assert currentNode != null;
                currentLevel.add(currentNode.val);
                // insert the children of current node to the queue
                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            // append the current level at the beginning
            result.add(0, currentLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        //level1
        TreeNode root = new TreeNode(12);
        //level2
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        //level3
        root.left.left = new TreeNode(9);

        root.left.right = new TreeNode(19);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        //level4
        root.left.left.left = new TreeNode(31);
        root.left.left.right = new TreeNode(33);
        root.left.right.left = new TreeNode(35);
        root.left.right.right = new TreeNode(36);
        root.right.left.left = new TreeNode(41);
        root.right.left.right = new TreeNode(43);
        root.right.right.left = new TreeNode(45);
        root.right.right.right = new TreeNode(46);
        List<List<Integer>> result = ReverseOrderTraversal.traverse(root);
        System.out.println("Level order traversal: " + result);
    }
}