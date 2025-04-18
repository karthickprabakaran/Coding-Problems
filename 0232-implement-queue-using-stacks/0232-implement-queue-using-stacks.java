import java.util.Stack;

class MyQueue {

    Stack<Integer> firstStack;
    Stack<Integer> secondStack;

    public MyQueue() {
        firstStack  = new Stack<>();
        secondStack  = new Stack<>();
    }
    
    public void push(int x) {
        firstStack.push(x);
    }
    
    public int pop() {
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
        return secondStack.pop();
    }
    
    public int peek() {
        if (secondStack.isEmpty()) {
            while (!firstStack.isEmpty()) {
                secondStack.push(firstStack.pop());
            }
        }
        return secondStack.peek();
    }
    
    public boolean empty() {
        return firstStack.isEmpty() && secondStack.isEmpty();
    }
}