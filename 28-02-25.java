private static boolean isOperand(String s) {
        // Check if the string represents a valid integer
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
