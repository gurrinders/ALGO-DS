package com.iqspark.algo.trees;

import java.util.*;


class LevelOrderTraversal {
    public static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> levelList = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            result.add(levelList);
        }
        return result;
    }

    public static void main(String[] args) {
        //level1
        TreeNode root = new TreeNode(12);
        //level2
//        root.left = new TreeNode(7);
//        root.right = new TreeNode(1);
//        //level3
//        root.left.left = new TreeNode(9);
//
//        root.left.right = new TreeNode(19);
//        root.right.left = new TreeNode(10);
//        root.right.right = new TreeNode(5);
//        //level4
//        root.left.left.left = new TreeNode(31);
//        root.left.left.right = new TreeNode(33);
//        root.left.right.left = new TreeNode(35);
//        root.left.right.right = new TreeNode(36);
//        root.right.left.left = new TreeNode(41);
//        root.right.left.right = new TreeNode(43);
//        root.right.right.left = new TreeNode(45);
//        root.right.right.right = new TreeNode(46);
        List<List<Integer>> result = LevelOrderTraversal.traverse(root);
        System.out.println("Level order traversal: " + result);
    }
}