int n = arr.length;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Stack<Integer> st = new Stack<>();
        ArrayList<Double> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            q.add(arr[i]); 
            int size = q.size();

            if (size == 1) {
                res.add((double) q.peek());
                continue;
            }

            if (size % 2 != 0) {
                int mid = (size - 1) / 2;
                int median = 0;

                for (int j = 0; j < size; j++) {
                    if (j == mid) {
                        median = q.peek();
                        break;
                    }
                    st.push(q.poll());
                }
                
                res.add((double) median);
            } else { 
                int a = (size - 1) / 2;
                int b = ((size - 1) / 2) + 1;
                int e1 = 0, e2 = 0;

                for (int j = 0; j < size; j++) {
                    if (j == a) {
                        e1 = q.poll();
                        st.push(e1);
                    } else if (j == b) {
                        e2 = q.poll();
                        st.push(e2);
                        break;
                    } else {
                        st.push(q.poll());
                    }
                }

                double ans = (e1 + e2) / 2.0;
                res.add(ans);
            }

            while (!st.isEmpty()) {
                q.add(st.pop());
            }
        }

        return res;
