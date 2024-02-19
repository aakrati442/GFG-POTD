 int[] freq = new int[26];
        
        
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.add(freq[i]);
            }
        }
        
        
        while (k-- > 0) {
            int top = pq.poll();
            if (top > 1) {
                pq.add(top - 1);
            }
        }
        
      
        int minVal = 0;
        while (!pq.isEmpty()) {
            int freqCount = pq.poll();
            minVal += freqCount * freqCount;
        }
        
        return minVal;
