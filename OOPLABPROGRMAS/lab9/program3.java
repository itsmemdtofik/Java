/* Define a generic list to implement singly linked list and show the use of the generic class for 2 different class type
integer and double class object*/

package lab9;

import java.util.Scanner;

class LinkedList<T> {
    Node root;

    class Node<T> {
        T data;
        Node<T> rightlink;

        Node(T a) {
            this.data = a;
            rightlink = null;
        }
    }

    public LinkedList insert(LinkedList<T> list, T d) {
        Node<T> temp = new Node<T>(d);
        temp.rightlink = null;
        if (list.root == temp) {
            list.root = temp;
        } else {
            Node<T> last = list.root;
            while (last.rightlink != null) {
                last = last.rightlink;
            }

        }
        return list;
    }

    public LinkedList delete(LinkedList<T> list) {
        T data;
        if (list.root == null) {
            System.out.println("Underflow");
        } else if (list.root.rightlink == null) {
            data = (T) list.root;
            System.out.println("Poped " + data);
        } else {
            Node<T> last = list.root;
            Node<T> leftlink = null;
            while (last.rightlink == null) {
                leftlink = last;
                last = last.rightlink;

            }
            data = last.data;
            last = leftlink;
            last.rightlink = null;
            System.out.println("Popped " + data);
        }
        return list;
    }

    public void display(LinkedList<T> list) {
        T data;
        Node<T> last = list.root;
        while (last != null) {
            System.out.println(last.data);
            last = last.rightlink;
        }
    }
}

public class program3 {
    public static void main(String[] args) {
        LinkedList<Integer> listob = new LinkedList<Integer>();
        LinkedList<Double> listob1 = new LinkedList<Double>();
        System.out.println("1-Insert");
        System.out.println("2-Delete");
        System.out.println("1-Display");
        System.out.println("1-Exit");
        Scanner scanner = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter choice :");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Integer and Double values :");
                    int n = scanner.nextInt();
                    double d = scanner.nextDouble();
                    listob = listob.insert(listob, n);
                    listob1 = listob1.insert(listob1, d);
                    break;
                case 2:
                    System.out.println("Integer :");
                    listob = listob.delete(listob);
                    listob1 = listob1.delete(listob1);
                    break;
                case 3:
                    System.out.println("Integer linked list :");
                    listob.display(listob);
                    System.out.println("Double linked list :");
                    listob1.display(listob1);
                    break;
            }
        } while (ch != 4);

    }
}
