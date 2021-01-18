/** */
import java.util.Scanner;

class Prime_Number {

    public static int isPrime(int a) {

        int f=1;
        for(int i=2; i<a; i++){
            if(a%i==0){
                f=0;
                break;
            }

        }
        if(f==1)return 1;
        else return 0;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is prime or not :");
        int b=scanner.nextInt();
        scanner.nextLine();
        int c=isPrime(b);
        if(c==1) {
            System.out.println("The number is prime \n");
        }else {
            System.out.println("Number is not prime ");
        }
        System.out.println("Enter the value for n : ");
            int d=scanner.nextInt();
            for(int i=1; i<=d; i++){
                if(isPrime(i)==1)

                    System.out.print("\n"+i);
            }
        }

    }

