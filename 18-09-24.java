geeksforgeeks
Courses
Tutorials
Jobs
Practice
Contests
avatar
9


Discussions
( 1266 Threads )

Most Recent
User














Submit
User
GeeksforGeeksverified
10 hours ago

Comment of the Day Challenge!

Got a knack for problem-solving? 🧠 Showcase your skills with the most insightful comment and snag a GFG T-shirt!

🔍 Guidelines:

Your comment should offer the clearest explanation and best visualization of the problem and solution.
Think pics or GIFs (Drag and Drop) or slideshows!
No copy-pasting or spamming – originality is key!
Submit your comment in a new thread. For feedback, drop a comment below. 💬👇
💡 Upvotes, downvotes, or duplicate comments won't make the cut for Comment of the Day.

Winning: Our Marketing Team will ping you via email about your T-shirt and stock availability.

Keep coding, keep cracking, and may your comments be ever insightful!

Regards
Practice Team
..... see more

1

Reply
User
ABDUL REHMAN HAMIDULLAH SHAH
19 minutes ago

Hindi Explaination of problem: {JAVA}

Yeh problem check karne ke liye hai ki ek string `x` mein jo brackets { }, ( ), [ ] diye gaye hain, kya unka order aur pairing sahi hai ya nahi. Agar saare brackets balance mein hain, toh function `true` return karega, warna `false`. Let’s dekhte hain kaise kaam karta hai:

### 🧐 Example:

1. Input: `{([])}`
   - Output: `true`
   - Explanation: Saare brackets ek sahi order mein pair ho rahe hain. ✅

2. Input: `()`
   - Output: `true`
   - Explanation: Sirf ek hi type ka bracket hai, jo properly balance mein hai. ✅

3. Input: `([ ]`
   - Output: `false`
   - Explanation: Yahan square bracket `[]` toh sahi hai, lekin small bracket `()` match nahi ho raha. ❌

### 💡 Kaise kaam karta hai code:
- Step 1: Stack 📦 ka use karke har ek character ko dekhte hain.
- Step 2: Agar opening bracket `(`, `{`, `[` mile, toh stack mein push karo. 👌
- Step 3: Agar closing bracket `)`, `}`, `]` mile, toh:
  - Pehle check karo stack khaali toh nahi hai ❓ agar khaali hai, toh `false` return kar do kyunki bracket ka pair missing hai.
  - Agar khaali nahi hai, toh stack se top element 🔝 ko pop karo aur check karo kya uska pair sahi hai ya nahi.
- Step 4: Agar saare pairs match ho gaye, aur stack khaali ho gaya, toh string balanced hai, return `true`. Agar nahi, toh `false`. 🏁

### ⏲️ Time Complexity: O(|x|)
Matlab string ke length ke hisaab se time lagega.

### 📦 Space Complexity: O(|x|)
Stack ke liye jitne elements honge, utni space lagegi.

Overall: Agar saare brackets sahi pair mein hain aur sahi order mein band ho rahe hain toh function `true` dega, warna `false`.

class Solution
{
    static boolean ispar(String x)
    {
        Stack<Character> a=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                a.push(ch);
            }else if(ch=='}' || ch==']' || ch==')'){
                if(a.isEmpty()){
                    return false;
                }
                char top=a.pop();
                if( ((ch==')') && top!='(') || ((ch=='}') && top!='{') || ((ch==']') && top!='[') ) {
                    return false;
                } 
            }
        }
        return a.isEmpty();
    }
}
 

..... see more

0

Reply
User
Rohan Salgare
(Edited)
27 minutes ago

def ispar(self,x):
        # code here
        
        opening=('{','(','[')# storing opening braces in a tuple
        closing=('}',')',']')# storing closing braces in a tuple
            
        stack=[]
        
        for i in x:
            #instead of writing multiple or conditoin used the opening tuple
            #to see if i is a opening bracket
            if i in opening:
                #if i is opening then push it into stack
                stack.append(i)
               
            else:
                #if the stack doen't contain any open bracket 
                #before i become a closing one , it means expresoin is not valid
                #eg. ){}()
                if not stack:
                    return False
               #if i is a closing bracket then pop the current opening bracket
               #and check if the index of current opening bracket is equal to 
               #the current closing bracket i.e. it's a valid pair or not
                currentOpen=stack.pop()
                if opening.index(currentOpen)!=closing.index(i):
                    return False
               
            
        #if stack becomes empty means the expression contains a valid pair
        return len(stack)==0
 

..... see more

0

Reply
User
Gagan
28 minutes ago

Easy C++ Solution


bool ispar(string x)
    {
        // Your code here
        stack<char> s;
    
        for(char c : x) {
            if(c == '{' || c == '(' || c == '[') {
                s.push(c);
            } else {
                if(s.empty()) {
                    return false;
                }
                
                char t = s.top();
                
                if((c == '}' && t == '{') || (c == ']' && t == '[') || (c == ')' && t == '(')) {
                    s.pop(); 
                } else {
                    return false;
                }
            }
        }
        
        return s.empty();
    }

..... see more

0

Reply
User
Neha kohli
53 minutes ago

JAVA SOLUTION FOR TODAY'S POTD 

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        //Defining a stack to store the elements of string x
        Stack<Character> a=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                a.push(ch);
            }else if(ch=='}' || ch==']' || ch==')'){
                //Base condition 
                if(a.isEmpty()){
                    return false;
                }
                char top=a.pop();
                //check if the top element matches the current closing bracket
                if( ((ch==')') && top!='(') || ((ch=='}') && top!='{') || ((ch==']') && top!='[') ) {
                    return false;
                } 
            }
        }
        //stack is empty ie all bracket are matched 
        return a.isEmpty();
    }
}

..... see less

0

Reply
User
Atanu Kundu
73 minutes ago

JAVA SOLUTION
 

class Solution{
    static boolean ispar(String x){
        Stack<Character> st = new Stack<>();
        for(char ch : x.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            }
            else{
                if(ch == '}') ch = '{';
                if(ch == ')') ch = '(';
                if(ch == ']') ch = '[';
                if(!st.isEmpty() && st.peek() != ch){
                    return false;
                }
                else if(st.isEmpty()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
..... see more

0

Reply
User
Saurabh Kumar
75 minutes ago

Java Easy way
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        for(char ch : x.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            }
            else{
                if(ch == '}') ch = '{';
                if(ch == ')') ch = '(';
                if(ch == ']') ch = '[';
                if(!st.isEmpty() && st.peek() != ch){
                    return false;
                }
                else if(st.isEmpty()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
 

..... see more

0

Reply
User
Abhishek Kumar Ray
85 minutes ago

-----------------------------------java solution ----------------------------------------------

 

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        
        for (char ch : x.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}

..... see more

1

Reply
User
Vinayp
93 minutes ago

hey guys ,the problem can be solved as 
1.Best to create a stack
2.now using a for loop iterate over the array(note convert the string to array)
3.if element is (  ,{  , [ add to the stack
4.if not pop and store in a variable and compare the current arr[i] with the new poped element if same continue the loop else return false

class Solution
{
    static boolean ispar(String x)
    {
        Stack<Character> st = new Stack<Character>();
        for(char ch : x.toCharArray()){
            if ( ch=='[' || ch=='{' || ch=='(' ){
                st.push(ch);
            }else{
                if ( st.isEmpty() )
                    return false;

                char open = st.pop() ;
                if( ( open=='[' && ch!=']' ) || ( open=='(' && ch!=')' ) || (open=='{' && ch!='}' ) )                
                    return false;                
            }          
        }
          return st.isEmpty();
    }
}

Does any one help me where to learn the DSA ??? Best resource suggest me friends

..... see more

0

Reply
User
Naman Dutta
95 minutes ago

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        //using stack
        char[] arr = x.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(openBra(arr[i])){
                st.push(arr[i]);
            }
            else if(st.isEmpty() || !checkSimilar(arr[i], st.pop())){
                return false;
            }
        }
        if(st.size()>0)
            return false;
        return true;
    }
    static boolean openBra(char c){
        if(c=='{' || c=='(' || c=='[')
            return true;
        return false;
    }
    static boolean checkSimilar(char x, char y){
        if(x==']' && y=='[')
            return true;
        else if(x=='}' && y=='{')
            return true;
        else if(x==')' && y=='(')
            return true;
        else
            return false;
    }
}
 

..... see more

0

Reply
Load More Comments
Output Window
Problem Solved Successfully
Suggest Feedback
Test Cases Passed
1115 / 1115
Attempts : Correct / Total
1 / 1
Accuracy :
100%
Points Scored 
2 / 2
Your Total Score:
1525 
Time Taken
0.41
Solve Next

Get min at pop
Equal point in a string of brackets
Easy string
Java (1.8)



        return a.isEmpty();


 

Custom Input
