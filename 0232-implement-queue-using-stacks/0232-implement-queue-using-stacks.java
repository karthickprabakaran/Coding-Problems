import java.util.Stack;

class MyQueue {

    Stack<Integer> firstStack;   // Stack to handle push operations
    Stack<Integer> secondStack;  // Stack to reverse order for pop/peek

    public MyQueue() {
        firstStack  = new Stack<>();
        secondStack  = new Stack<>();
    }
    
    public void push(int x) {
        // Always push to firstStack
        firstStack.push(x);
    }
    
    public int pop() {
        // Move elements from firstStack to secondStack only if secondStack is empty
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop()); // Reverse order
            }
        }
        return secondStack.pop(); // Pop from secondStack (queue front)
    }
    
    public int peek() {
        // Move elements only if secondStack is empty
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
        return secondStack.peek(); // Peek the front element
    }
    
    public boolean empty() {
        // Queue is empty only if both stacks are empty
        return firstStack.isEmpty() && secondStack.isEmpty();
    }
}