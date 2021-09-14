package StudentProjects.P2_Stacks.StarterFiles.StackArray;



/**
 * * STACK where the last element in the array is the bottom of the stack
 *
 * *
 * @param <T>
 */
public class ArrayStack<T> implements StackInterface<T> {

    private T[] stack;    // Array of stack entries   
    private int topIndex; // Index of top entry   
    private static final int DEFAULT_CAPACITY = 50;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }
     

    // 1. Create array of type Object set to initial capacity, 
    //    casting it to (T[]) and then assign to stack instance varialbe
    // 2. set topIndex to initialCapacity
    public ArrayStack(int initialCapacity) {

        System.out.println("STUB ArrayStack constructor : replace with your code. ");

    } // end constructor    

    // 1. if topIndex is 0 (array is full) then call doubleArray()
    // 2. Assign newEntry to stack[topIndex - 1]
    // 3. Decrement topIndex
    @Override
    public void push(T newEntry) {

        System.out.println("STUB push method : replace with your code. ");

    } // end push    

    // 1. if stack is not empty (call isEmpty() to determine)
    //    2. set top to stack element at topIndex
    @Override
    public T peek() {
        T top = null;

        System.out.println("STUB peek method : replace with your code. ");

        return top;
    } // end peek    

    // 1. if stack is not empty (call isEmpty() method to determine)
    // 2.    set top to stack element at topIndex
    // 3.    Increment topIndex
    @Override
    public T pop() {
        T top = null;

        System.out.println("STUB pop method : replace with your code. ");

        return top;
    } // end pop    

    // if topIndex is less then stack.length
    //   set result to false 
    @Override
    public boolean isEmpty() {
        boolean result = true;

        System.out.println("STUB isEmpty method : replace with your code. ");

        return true;
    }

    // while stack is not empty (call method isEMpty to determine)
    //   Call pop 
    @Override
    public void clear() {

        System.out.println("STUB clear method : replace with your code. ");
    }

   // Declare oldStack variable of type T[]
   // Create copy of stack & assign to oldStack (Hint: use method Arrays.copyOf)
   // Create new array object that is twice length of old array and store in stack
   // start topIndex at new length - 1
   // Traverse old stack from last index to 0
   //   assign old stack element to stack[topIndex--]
   // Increment topIndex 
    private void doubleArray() {

        System.out.println("STUB doubleArray method : replace with your code. ");
    }
    
    // Traverse through stack elements and add them to str, which gets returned
    public String toString( ) {
        String str = " ";
        
        System.out.println("STUB toString method : replace with your code. ");
        
        return str;
    }

    public static void main(String[] args) {

        System.out.println("Create a stack: ");
        StackInterface<String> myStack = new ArrayStack<>();
        System.out.println("isEmpty() returns " + myStack.isEmpty());
        System.out.println("\nAdd to stack to get\n" + "Joe Jane Jill Jess Jim");

        myStack.push("Jim");
        myStack.push("Jess");
        myStack.push("Jill");
        myStack.push("Jane");
        myStack.push("Joe");
        System.out.println("\nisEmpty() returns " + myStack.isEmpty());

        System.out.println("\nTesting peek and pop:");
        while (!myStack.isEmpty()) {
            String top = myStack.peek();
            System.out.println("\n" + top + " is at the top of the stack.");
            top = myStack.pop();
            System.out.println(top + " is removed from the stack.");
        } // end while  

        System.out.print("\nThe stack should be empty: ");
        System.out.println("isEmpty() returns " + myStack.isEmpty());
        System.out.println("\nAdd to stack to get\n" + "Jim Jess Joe\n");
        myStack.push("Joe");
        myStack.push("Jess");
        myStack.push("Jim");

        System.out.println("\nTesting clear:");
        myStack.clear();

        System.out.println("The stack should be empty: ");
        System.out.println("\nisEmpty() returns " + myStack.isEmpty());
        /*
        System.out.println("\n myStack.peek() returns ");
        System.out.println(myStack.peek());
        System.out.println("\n myStack.pop()  returns ");
        System.out.println(myStack.pop());
         */
    } // end main

} // end ArrayStack
