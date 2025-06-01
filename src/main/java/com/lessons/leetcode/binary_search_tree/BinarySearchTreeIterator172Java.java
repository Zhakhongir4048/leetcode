package com.lessons.leetcode.binary_search_tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinarySearchTreeIterator172Java {

    private final Deque<TreeNode> stack;

    public BinarySearchTreeIterator172Java(TreeNode root) {
        stack = new ArrayDeque<>();
        addLeftChilds(root);
    }

    public int next() {
        TreeNode current = stack.pop();
        addLeftChilds(current.right);
        return current.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void addLeftChilds(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
