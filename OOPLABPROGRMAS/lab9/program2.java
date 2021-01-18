/*Define a simple generic stack class and show the use of generic class for 2 different class tpe student and employee
class object*/


package lab9;

import java.util.Scanner;

class student {
    String name;
    int rno;

    public student(String a, int b) {
        name = a;
        rno = b;
    }

    public String toString() {
        return "name" + name + "rollno" + rno;
    }
}

class employee {
    String name;
    int id;

    public employee(String a, int b) {
        name = a;
        id = b;
    }

    public String toString() {
        return "name" + name + "id" + id;
    }
}

class stack<T> {
    T arr[];
    int top;

    public stack(T arr[]) {
        this.arr = arr;
        top = -1;
    }

    public void push(T t) {
        if (top == 99) {
            System.out.println("Stack is full");
            return;
        }
        arr[top] = t;
        top++;
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty");

        }
        return arr[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i >= top; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Student / 2 for employee");
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the size of stack");
                int n = scanner.nextInt();
                student[] std = new student[n];
                stack<student> st = new stack<student>(std);
                System.out.println("1-push");
                System.out.println("2-pop");
                System.out.println("3-display");
                System.out.println("4-exit");
                int arr=1;
                do {
                    System.out.println("Enter choice :");
                    switch (arr) {
                        case 1:
                            System.out.println("Enter student name and rno :");
                            String name = scanner.next();
                            int r = scanner.nextInt();
                            student sob = new student(name, r);
                            st.push(sob);
                            break;
                        case 2:
                            System.out.println("POPED ELEMENTS :");
                            System.out.println(st.pop());
                            break;
                        case 3:
                            System.out.println("student stack is :");
                            st.display();
                            break;
                    }
                } while (arr != 4);
                break;
            case 2:
                System.out.println("Enter the size of stack :");
                n = scanner.nextInt();
                employee[] eob = new employee[n];
                stack<employee> emp = new stack<employee>(eob);
                do {
                    System.out.println("Enter choice :");
                    arr = scanner.nextInt();
                    switch (arr) {
                        case 1:
                            System.out.println("Enter the employee name and id :");
                            String name = scanner.next();
                            int idd = scanner.nextInt();
                            switch (arr) {
                                case 2:
                                    System.out.println("POPED ELMENT :");
                                    System.out.println(emp.pop());
                                    break;
                                case 3:
                                    System.out.println("employee stack is :");
                                    emp.display();
                                    break;
                            }
                    }
                } while (arr != 4);
                break;

        }
    }
}
