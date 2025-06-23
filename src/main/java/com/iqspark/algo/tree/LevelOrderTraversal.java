package com.iqspark.algo.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    public static List<List<Integer>> traverse(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        list.add(extracted(root));
        return list;
    }

    private static List extracted(TreeNode root) {
        while(root !=null){
            List nodel = new ArrayList();


            traverse(root.left);
            traverse(root.right);
            nodel.add(root.left.val);
            nodel.add(root.right.val);

            return nodel;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(10);
        List<List<Integer>> result = LevelOrderTraversal.traverse(root);
        System.out.println("Level order traversal: " + result);
    }
}
