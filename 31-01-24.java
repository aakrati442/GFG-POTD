TrieNode curr = root;
    for(int level=0; level<key.length(); level++){
        int idx = key.charAt(level)-'a';
        if(curr.children[idx] == null){
            curr.children[idx] = new TrieNode();
        }
        curr = curr.children[idx];
    }
    curr.isEndOfWord = true;
