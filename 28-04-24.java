if (head == null || head.next == null)
            return null;

        Node slowPtr = head;
        Node fastPtr = head;
        Node prev = null;

        // Move slowPtr to the middle and fastPtr to the end of the list
        while (fastPtr != null && fastPtr.next != null) {
            prev = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // Delete the middle node pointed by slowPtr
        prev.next = slowPtr.next;

        return head;
