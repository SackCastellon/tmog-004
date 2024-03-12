package org.tfoc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() {
    solution = new Solution();
  }

  @Test
  void example1() {
    var list1 = ListNode.of(1, 2, 4);
    var list2 = ListNode.of(1, 3, 4);
    var result = solution.mergeTwoLists(list1, list2);
    assertThat(result).isEqualTo(ListNode.of(1, 1, 2, 3, 4, 4));
  }

    @Test
    void example2() {
      var result = solution.mergeTwoLists(null, null);
      assertThat(result).isEqualTo(ListNode.of());
    }

  @Test
  void example3() {
    var result = solution.mergeTwoLists(null, ListNode.of(0));
    assertThat(result).isEqualTo(ListNode.of(0));
  }
}
