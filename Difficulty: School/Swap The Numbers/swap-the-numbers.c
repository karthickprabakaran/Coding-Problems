//{ Driver Code Starts
// Initial Template for C

#include <stdio.h>


// } Driver Code Ends

// variable a and b has been declared and initialized
// Write the swap code below
void swap(int *a, int *b) {
    // code here
    int temp = *a;
    *a = *b;
    *b = temp;
}

// code till here



//{ Driver Code Starts.

int main() {

    int t;
    scanf("%d", &t);

    while (t--) {
        int a, b;
        scanf("%d %d", &a, &b);
        swap(&a, &b);
        printf("%d %d\n", a, b);
        printf("~%s", "\n");
    }

    return 0;
}
// } Driver Code Ends