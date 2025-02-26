package implementation;

import java.util.Stack;

/**
 * This class implements a stack using the java collection stack
 * By using the java collection stack we avoid reinventing the wheel,
 * because
 * we do not plan on learning more about wheels.
 * It only uses 2 methods from the stack collection which are
 * push, and pop
 * It uses the following guidelines:
 * - encapsulation by making the stack private
 * - Single responsibility by managing the stack only
 * - error handling
 * - Java collections
 * - Most of the code from last week has been reused
 */
public class MyStack {
    /**
     * Define a private empty stack of integer named unsortedStack
     */
    private Stack<Integer> unsortedStack = new Stack<>();

    /**
     * Default constructor that initializes an empty stack.
     */
    public MyStack() {
    }

    /**
     * constructs a stack with a parameter number using the push method from
     * the java stack collection
     * 
     * @param number an Integer to add to the stack
     */
    public MyStack(int number) {
        unsortedStack.push(number);
    }

    /**
     * This method is a getter that returns the stack list that will always be
     * unsorted
     * 
     * @return unsortedStack the private stack used in the class
     */
    public Stack<Integer> getStack() {
        return this.unsortedStack;
    }

    /**
     * This method push a number to the stack
     * 
     * @param number The integer to push in the stack
     */
    public void addToStack(int number) {
        unsortedStack.push(number); // code reuse
    }

    /**
     * This method pops a number from the stack when not empty
     * Otherwise provide a message regarding the emptiness of the stack
     * 
     * @return popped the element removed from the stack
     */
    public int removeFromStack() {
        if (!unsortedStack.isEmpty()) {
            int popped = unsortedStack.pop(); // code reuse
            return popped;
        } else {
            System.out.println("The stack is empty nothing to remove");
            return 0;
        }
    }

}