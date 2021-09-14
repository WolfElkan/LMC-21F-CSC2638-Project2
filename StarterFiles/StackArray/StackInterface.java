package StudentProjects.P2_Stacks.StarterFiles.StackArray;



/**
 * An interface for the ADT stack. @author Frank M. Carrano @author Timothy M.
 * Henry @version 4.0
 * @param <T>
 */
public interface StackInterface<T> {

    /**
     * Adds a new entry to the top of this stack. @param newEntry An object to
     * be added to the stack.
     * @param newEntry Entry that we'll be putting onto the top of the stack
     */
    public void push(T newEntry);

    /**
     * Removes and returns this stack's top entry. @return The object at the top
     * of the stack. @throws EmptyStackException if the stack is empty before
     * the operation.
     * @return 
     */
    public T pop();

    /**
     * Retrieves this stack's top entry. @return The object at the top of the
     * stack. @throws EmptyStackException if the stack is empty.
     * @return 
     */
    public T peek();

    /**
     * Detects whether this stack is empty. @return True if the stack is empty.
     * @return 
     */
    public boolean isEmpty();

    /**
     * Removes all entries from this stack.
     */
    public void clear();
} // end StackInterface
