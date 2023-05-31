public class MergeTwoSortedLists {
    private static class ListNode {
        private int val;
        private ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String... args) {
        ListNode head1 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(4);

        head1.next = node12;
        node12.next = node13;

        ListNode head2 = new ListNode(1);
        ListNode node22 = new ListNode(3);
        ListNode node23 = new ListNode(4);

        head2.next = node22;
        node22.next = node23;

        ListNode merged = mergeTwoListsRecursive(head1, head2);
        traverse(merged);
    }

    private static void traverse(ListNode head) {
        ListNode node = head;

        while (node != null) {
            if (node.next != null) {
                System.out.print(node.val + " -> ");
            } else {
                System.out.print(node.val);
            }
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsRecursive(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecursive(list1, list2.next);
            return list2;
        }
    }

    public static ListNode mergeTwoListsIterative(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head;

        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        ListNode temp = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return head;
    }
}
