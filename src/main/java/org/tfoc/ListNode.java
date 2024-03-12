package org.tfoc;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
  int val;
  ListNode next;

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNode listNode = (ListNode) o;
    return val == listNode.val && Objects.equals(next, listNode.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, next);
  }

  @Override
  public String toString() {
    return "[%d, %s]".formatted(val, next);
  }

  public static ListNode of(int... values) {
    if (values.length == 0) return null;
    ListNode next = null;
    for (int i = values.length - 1; i >= 0; i--) {
      next = new ListNode(values[i], next);
    }
    return next;
  }
}
