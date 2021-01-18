
/**
 * Create a class called stack for sorting the instance variable are. An Integer
 * Array. An Integer for sorting the top of the stack(TOS).Include method for
 * initializing the TOS. pushing an element to the stack and for copying an
 * element from the stack. The Push() method should also check for "Stack
 * Overflow" POP should also check for stack underflow. Use display() method to
 * display the content of the stack.
 * 
 */

import java.util.Scanner;

class Stack {
    int[] sortStack = new int[100];

    int tos = -1;

    public void push(int item) /* for inserting element into stack in stack order */
    {
        if (tos == 99) {
            System.out.println("stack is Overflow");
            return;
        } else {
            sortStack[++tos] = item;
        }
    }

    public int pop() /* for retriving element from stack */
    {
        if (tos == -1) {
            System.out.println("stack underflow");
            return 0;
        } else
            return sortStack[tos--];
    }

    public boolean empty_stack() /* check that stack is empty or not */
    {
        if (tos == -1)
            return true;
        else
            return false;
    }

    public void display() /* for printing the stack contains */
    {
        int temp = 0;

        if (!empty_stack()) {
            temp = pop();
            System.out.println(temp);
            display();
        }
        push(temp);
    }

}

public class Stack_for_Sorting {
    public static void main(String[] args) {

        int choice; /* variable used to store tupe of operation */
        Stack ob1 = new Stack(); /* created stack */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n --------------------------------------");
            System.out.println("\n 1-PUSH()");
            System.out.println("\n 2-POP()");
            System.out.println("\n 3-DISPLAY()");
            System.out.println("\n 4-EXIT()");
            System.out.println("\n --------------------------------------");
            System.out.println("\n Enter your choice = ");
            choice = scanner.nextInt(); /* reading type value */
            System.out.println("\n --------------------------------------\n");
            switch (choice) {
                case 1:
                    System.out.println("Enter the first element = ");
                    // s.nextInt();
                    ob1.push(scanner.nextInt()); /* reading integer and pushed it into the stack */
                    break;

                case 2:
                    System.out.println("Element  poped is = " + ob1.pop());
                    break;

                case 3:
                    System.out.println("Total element of stack is  = ");
                    ob1.display();
                    break;
                default:
                    System.out.println("You have exited = ");
                    return;

            }

        }
    }

}
