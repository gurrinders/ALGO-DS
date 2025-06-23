package com.iqspark.algo.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderAvg {


    private static List<Double> getAvg(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if(root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double sum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                sum = sum + node.val;
                if(node.left!= null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            double avg = sum/levelSize;
            result.add(avg);
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
        List<Double> result = LevelOrderAvg.getAvg(root);
        System.out.println("Level order traversal: " + result);
    }
}
