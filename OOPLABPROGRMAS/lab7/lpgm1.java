/* ###LAB7 PROGRAMS (INTERFACE AND EXCEPTION HANDLING)##
 * Create a class phone (String brand,int numCapacity)which contain an interface Capable(make AudioCall(String all num),
 * make audio call(String all num)
 * 2.Create subclass called basicPhone and smartPhone and implement the method appropriately.
 * Demonstrate the creation of both class object by calling appropriate constructor which accept value from user.
 * Using object called the method of interface*/
package lab7;

import java.util.Scanner;

class phone {
    public interface Capable {
        void AudioCall(String callNum);

        void VideoCall(String callNum);
    }

    String brand;
    int memoryCapacity;
    String type;

    phone(String a, int b, String c) {
        brand = a;
        memoryCapacity = b;
        type = c;
    }

    public void display() {
        System.out.println("Brand of Phone = " + brand);
        System.out.println("Memory Capacity of phone = " + memoryCapacity);
        System.out.println("The Types of Phone = " + type);
    }
}

abstract class basicPhone extends phone implements phone.Capable {
    basicPhone(String br, int memo, String tp) {
        super(br, memo, tp);

    }

    @Override
    public void AudioCall(String callNum) {
        System.out.println("Service not available = " + callNum);
    }
}

abstract class smartPhone extends phone implements phone.Capable {
    smartPhone(String br, int memo, String tp) {
        super(br, memo, tp);
    }

    @Override
    public void VideoCall(String callNum) {
        System.out.println("Calling number is = " + callNum);
    }
}

class lpgm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Brand : ");
        String brand = scanner.next();
        System.out.println("Enter the Memory Capacity : ");
        int memory = scanner.nextInt();
        System.out.println("Enter the type of Phone : ");
        String type = scanner.next();
        phone pob = new phone(brand, memory, type);
        pob.display();
        System.out.println("Enter the phone number : ");
        String name = scanner.next();
        System.out.println("Calling from Basic phone : ");
        System.out.println("Number is = " + name);
        basicPhone bob = new basicPhone(brand, memory, type) {
            @Override
            public void VideoCall(String callNum) {
                System.out.println("Brand is = " + brand);
            }
        };
        bob.VideoCall(brand);
        bob.AudioCall(brand);
        bob.display();
        smartPhone sob = new smartPhone(brand, memory, type) {
            @Override
            public void AudioCall(String callNum) {
                System.out.println("Brand is = " + brand);
            }
        };
        sob.AudioCall(brand);
        sob.VideoCall(brand);
        sob.display();
    }
}