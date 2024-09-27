ArrayList<Integer> result = new ArrayList<>();
        
        // Base case: if the array is empty or k is 0.
        if (arr == null || arr.length == 0 || k == 0) {
            return result;
        }

        // Deque to store indices of elements in the current window.
        Deque<Integer> deque = new LinkedList<>();

        // Traverse through the array.
        for (int i = 0; i < arr.length; i++) {
            // Remove elements from deque that are out of this window.
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements from deque that are smaller than the current element,
            // since they will not be needed in the current or future windows.
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add current element's index to the deque.
            deque.offerLast(i);

            // Start adding the maximums to the result once the first window is fully traversed.
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }

        return result;
