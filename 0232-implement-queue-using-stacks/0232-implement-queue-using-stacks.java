import java.util.Stack;

class MyQueue {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    
    // Push element to the end of the queue
    public void push(int x) {
        inputStack.push(x);
    }
    
    // Removes and returns the element from the front of the queue
    public int pop() {
        peek(); // Ensure outputStack has the current elements
        return outputStack.pop();
    }
    
    // Get the front element
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }
    
    // Return whether the queue is empty
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}