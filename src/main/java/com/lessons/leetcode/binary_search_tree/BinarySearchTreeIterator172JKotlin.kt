package com.lessons.leetcode.binary_search_tree

import java.util.*

class BinarySearchTreeIterator172JKotlin(root: TreeNode?) {

    private val stack = ArrayDeque<TreeNode>()

    init {
        addLeftChildren(root)
    }

    fun next(): Int {
        val current = stack.pop()
        addLeftChildren(current.right)
        return current.`val`
    }

    fun hasNext(): Boolean {
        return stack.isNotEmpty()
    }

    private fun addLeftChildren(node: TreeNode?) {
        var curr = node
        while (curr != null) {
            stack.push(curr)
            curr = curr.left
        }
    }
}