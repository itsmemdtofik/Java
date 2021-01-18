interface Stack {
    void push(int item); // Storing an item to stack

    int pop(); // Delteing an item from stack

    boolean isEmpty(); // Return if Stack is empty

    boolean isFull(); // Return if stack is full
}

class FixedStack implements Stack {
    private int[] stk;
    private int top;

    FixedStack(int size) {
        stk = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return (top == stk.length - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full:");
        } else {
            stk[++top] = item;

        }

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty:");
            return -1;
        } else {
            return stk[top--];
        }
    }

    void Display() {
        if (isEmpty()) {
            System.out.println("Stack is empty:");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stk[i] + "");
            }
        }
    }
}

public class Stack_Interface {
    public static void main(String[] args) {
        /* You can Use Refrence variable Stack myStack where Stack is Interface name */
        FixedStack st = new FixedStack(5);
        // Put some number on to the stack
        for (int i = 0; i < 5; i++)
            st.push(i);
        // pop the element of the Stack
        for (int i = 0; i < 3; i++)
            System.out.println(st.pop());
        
        st.Display();
    }
}
