package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    var nextList1 = list1.next;
    var nextList2 = list2.next;

    if (list1.val > list2.val) {
      list2.next = list1;
      list1.next = mergeTwoLists(nextList1, nextList2);
      return list2;
    } else {
      list1.next = list2;
      list2.next = mergeTwoLists(nextList1, nextList2);
      return list1;
    }
  }
}
