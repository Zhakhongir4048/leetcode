package com.lessons.leetcode.problems;

import static com.lessons.leetcode.problems.ReverseLinkedList.reverseList;

import com.lessons.leetcode.problems.ReverseLinkedList.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

  @Test
  void reverseListTest() {
    ListNode listNode = new ListNode(
        10, new ListNode(
        20, new ListNode(
        30, new ListNode(
        40, new ListNode()))));
    ListNode reverseList = reverseList(listNode);
    Assertions.assertEquals(
        "ListNode{val=0, next=ListNode{val=40, next=ListNode{val=30, next=ListNode{val=20, next=ListNode{val=10, next=null}}}}}",
        reverseList.toString());
  }

  @Test
  void reverseListTestTwo() {
    ListNode listNode = new ListNode(
        1, new ListNode(
        2, new ListNode()));
    ListNode reverseList = reverseList(listNode);
    Assertions.assertEquals(
        "ListNode{val=0, next=ListNode{val=2, next=ListNode{val=1, next=null}}}",
        reverseList.toString());
  }

}