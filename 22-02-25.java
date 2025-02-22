int leftCount = 0, rightCount = 0, maxLength = 0;

        // Left to right traversal
        for (char ch : s.toCharArray()) {
            if (ch == '(') leftCount++;
            else rightCount++;

            if (leftCount == rightCount) {
                maxLength = Math.max(maxLength, 2 * rightCount);
            } else if (rightCount > leftCount) {
                leftCount = rightCount = 0; // Reset counters
            }
        }

        leftCount = rightCount = 0; // Reset counters for second pass

        // Right to left traversal
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') leftCount++;
            else rightCount++;

            if (leftCount == rightCount) {
                maxLength = Math.max(maxLength, 2 * leftCount);
            } else if (leftCount > rightCount) {
                leftCount = rightCount = 0; // Reset counters
            }
        }

        return maxLength;
