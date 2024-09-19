String[] t = str.split("\\.");
        Collections.reverse(Arrays.asList(t));
        return String.join(".",t);
