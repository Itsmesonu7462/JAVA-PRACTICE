#include <stdio.h>
#include <stdlib.h>

int* generateFibonacci(int n) {
    int* fib = (int*)malloc(n * sizeof(int));  // Allocate memory for n Fibonacci numbers
    if (n >= 1) fib[0] = 0;  // First Fibonacci number is 0
    if (n >= 2) fib[1] = 1;  // Second Fibonacci number is 1
    
    // Generate the Fibonacci sequence
    for (int i = 2; i < n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];  // Each term is the sum of the previous two
    }

    return fib;  // Return the pointer to the Fibonacci sequence
}

// Do not edit this part of code
int main() {
    int t;
    scanf("%d", &t);  // Read number of test cases
    while (t-- > 0) {
        int n;
        scanf("%d", &n);  // Read the value of n for each test case
        int *fib = generateFibonacci(n + 1);  // Generate Fibonacci sequence up to n (n+1 for 0-based index)
        printf("%d\n", fib[n]);  // Output the nth Fibonacci number
        free(fib);  // Free the allocated memory after use
    }
    return 0;
}
