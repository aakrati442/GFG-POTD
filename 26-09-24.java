geeksforgeeks
Courses
Tutorials
Jobs
Practice
Contests
avatar
14



Discussions
( 331 Threads )

Most Recent
User














Submit
User
GeeksforGeeksverified
13 hours ago

Comment of the Day Challenge!

Got a knack for problem-solving? 🧠 Showcase your skills with the most insightful comment and snag a GFG T-shirt!

🔍 Guidelines:

Your comment should offer the clearest explanation and best visualization of the problem and solution.
Think pics or GIFs (Drag and Drop) or slideshows!
No copy-pasting or spamming – originality is key!
Submit your comment in a new thread. For any feedback, drop a comment below. 💬👇
💡 Upvotes, downvotes, or duplicate comments won't make the cut for Comment of the Day.

Winning: Our Marketing Team will ping you via email about your T-shirt and stock availability.

Keep coding, keep cracking, and may your comments be ever insightful!

Regards
Practice Team
..... see more

2

Reply
(Show 3 Replies)
User
Nitesh Kumar
27 minutes ago

class Solution {
  public:
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    int maxStep(vector<int>& arr) {
        // Your code herefo
        int ans = 0;
        int cnt = 0;
        for(int i = 0;i<arr.size()-1;i++){
            if(arr[i]<arr[i+1]) cnt ++;
            else{
                ans = max(ans,cnt);
                cnt = 0;
            }
        }
        ans = max(cnt,ans);
        return ans;
    }
};
 

..... see more

0

Reply
User
SANJAY B
38 minutes ago

Python Easy Solution
class Solution:
    
    #Function to find maximum number of consecutive steps 
    #to gain an increase in altitude with each step.
    def maxStep(self, arr):
        #Your code here
        m=0
        ans=-1
        for i in range(len(arr)-1):
            if arr[i+1]>arr[i]:
                m+=1
            elif arr[i+1]<=arr[i]:
                m=0
            ans=max(ans,m)
        return ans

 

..... see more

1

Reply
User
Aakash Kumar
41 minutes ago

int maxStep(vector<int>& arr) {
        // Your code here
        int n=arr.size(), cnt=0, maxi=-1e9;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                cnt++;
                maxi=max(maxi, cnt);
            }else cnt=0;
        }
        return maxi;
    }
 

..... see more

0

Reply
User
Fardeen Malik
52 minutes ago

C++ Code 

 

class Solution {
  public:
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    int maxStep(vector<int>& arr) {
        // Your code here
        int ans=0, increscount=0;
        for(int i=1;i<arr.size();i++){
            if(arr[i]>arr[i-1])increscount++;
            else {
                ans=max(ans,increscount);
                increscount=0;
            }
        }
        ans=max(ans,increscount);
        return ans;
    }
};

..... see more

0

Reply
User
MD AFFAAQUE
80 minutes ago

Easy code in C++

class Solution {
  public:
    int maxStep(vector<int>& arr) {
        
        int ans=1;
        int res=1;
        for(int i=0;i<arr.size()-1;i++){
            
            if(arr[i]<arr[i+1])
            res++;
            else{
                ans=max(ans,res);
                res=1;
            }
        }
        ans=max(ans,res);
        return ans-1;
    }
};

..... see more

1

Reply
User
Sujal Kumar
82 minutes ago

Very Easy Solution in Java with O(n) time comlexity

class Solution {
    public int maxStep(int arr[]) {
        int max=0;
        int curr=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                curr++;
                
            }else{
                curr=0;
            }
            max=Math.max(curr,max);
        }
        return max;
    }
}

..... see less

1

Reply
User
shivam
99 minutes ago

Easy java Solution

class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int i=1,j=0;
        int max=0;
        while(i<arr.length){
            int cnt=0;
            while(i<arr.length&&arr[j]<arr[i]){
                j++;i++;
                cnt++;
            }
            max=Math.max(cnt,max);
            i++;j++;
        }
        return max;
    }
}

..... see more

0

Reply
User
notsotypical developer
109 minutes ago

@GeeksforGeeks 
We need to find the maximum increase in altitude i.e.
maximum number of consecutive buildings in increasing order.
So,

We keep two variables:

current_increase_in_altitude -> initialize it to zero -> If we are going from  i to (i+1) and arr[i+1] > arr[i], we got an increase, so increase  current_increase_in_altitude by 1. But, if arr[i+1] < arr[i], reset current_increase_in_altitude to zero.


maximum_increase_in_altitude: while traversing compare current_increase_in_altitude with maximum_increase_in_altitude, set it the max between two values.


Pseudo Code:

int current_increase_in_altitude = 0;
int maximum_increase_in_altitude = 0;
       

Traverse array arr from i = 1 to arr.size()

{

            if(arr[i-1] < arr[i]) {
                current_increase_in_altitude++;
            }
            else {
                current_increase_in_altitude= 0;
            }
            maximum_increase_in_altitude = max(current_increase_in_altitude, maximum_increase_in_altitude);
        }
        return maximum_increase_in_altitude;
}

..... see more

0

Reply
User
Ritika Bera
2 hours ago

class Solution:
    #Function to find maximum number of consecutive steps 
    #to gain an increase in altitude with each step.
    def maxStep(self, arr):
        #Your code here
        max_consecutive_step=0
        count_inc_steps=0
        
        for index in range(1, len(arr)):
            if arr[index-1]<arr[index]:
                count_inc_steps+=1
            else:
                count_inc_steps=0
            max_consecutive_step=max(max_consecutive_step, count_inc_steps)
        
        
        return max_consecutive_step

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
1563 
Time Taken
1.06
Solve Next

Find Kth Rotation
Bitonic Point
Missing element of AP
Java (1.8)
Average Time: 30m



        return max;



Custom Input
