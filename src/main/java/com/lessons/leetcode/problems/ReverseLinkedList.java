package com.lessons.leetcode.problems;

public class ReverseLinkedList {

  static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      return "ListNode{" +
          "val=" + val +
          ", next=" + next +
          '}';
    }
  }

  public static ListNode reverseList(ListNode node) {
    ListNode prev = null;
    ListNode current = node;
    ListNode next;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }

}