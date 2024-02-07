private:
    Node * fillParent(unordered_map<Node *,Node *> &parent,Node *root,int a){
        Node * begin = NULL;
        queue<Node *> q;
        q.push(root);
        while(!q.empty()){
            Node * node = q.front();
            q.pop();
            if(node->data == a) begin = node;
            if(node ->left){
                parent[node ->left] = node;
                q.push(node ->left);
            }
            if(node ->right){
                parent[node ->right] = node;
                q.push(node ->right);
            }
        }
        return begin;
    }
