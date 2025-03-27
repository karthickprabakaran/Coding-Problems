//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends



class Solution {
public:
    vector<int> leaders(vector<int>& arr) {
        int n = arr.size();
        vector<int> ans;
        int maxRight = INT_MIN; // Initialize maxRight to the smallest possible value
        
        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= maxRight) { 
                ans.push_back(arr[i]); // Add leader to the result
                maxRight = arr[i]; // Update maxRight
            }
        }

        // The leaders are added in reverse order, so reverse them
        reverse(ans.begin(), ans.end());
        return ans;
    }
};


//{ Driver Code Starts.

int main() {
    int t; // Number of test cases
    cin >> t;
    cin.ignore(); // Ignore the newline after the integer input
    while (t--) {
        vector<int> a;
        string input;

        // Input format: first number n followed by the array elements
        getline(cin, input);
        stringstream ss(input);
        int num;
        while (ss >> num)
            a.push_back(num); // Read the array elements from input string

        Solution obj;
        vector<int> result = obj.leaders(a);

        // Print the result in the required format
        if (result.empty()) {
            cout << "[]"; // Print empty brackets if no leaders are found
        } else {
            for (int i = 0; i < result.size(); i++) {
                if (i != 0)
                    cout << " ";
                cout << result[i];
            }
        }
        cout << endl;
        cout << "~" << endl;
    }

    return 0;
}

// } Driver Code Ends