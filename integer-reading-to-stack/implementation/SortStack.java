package implementation;

import java.util.Collections;
import java.util.Stack;

/**
 * This class sort a stack of integers.
 * it follows the single responsibility by dealing with the sorting aspect only
 * Also the open closed principle : closed for modification and open for future
 * extensions like for example sorting from largest to the smallest etc...
 * Uses Collection to sort.
 */
public class SortStack {

    /**
     * Default Constructor
     */
    SortStack() {
    }

    /**
     * This method sorts a stack of integer from the smallest to the largest
     * 
     * @param nonSortedStack An instance of the non-sorted stack from the MyStack
     *                       class
     * @return sortedStack a sorted stack that contains the sorted integer in
     *         MyStack.
     */
    public Stack<Integer> ascendingSort(implementation.MyStack nonSortedStack) {
        // creating an instance of the MyStack that will hold the sorted stack
        implementation.MyStack sortedStack = new implementation.MyStack();
        // get a copy of the unsorted stack and copy it's content to sorted stack then
        // pass it to
        // Collections.sort()
        nonSortedStack.getStack().forEach(number -> sortedStack.addToStack(number));

        Collections.sort(sortedStack.getStack());
        return sortedStack.getStack();
    }

}
