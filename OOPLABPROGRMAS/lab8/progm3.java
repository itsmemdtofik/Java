/* Write and execute a java program to experiment a producer and consumer problem using inter-thread communication*/

package lab8;
class Q{
    int n;
    boolean valuSet=false;
    synchronized int get(){
        if(!valuSet){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Got "+n);
        valuSet=false;
        notify();
        return n;
    }
    synchronized int Rest(int n){
        if(valuSet){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Got "+n);
        valuSet=false;
        notify();
        return n ;
    }
    synchronized void put(int n){
        if(!valuSet){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        this.n=n;
        valuSet=true;
        System.out.println("put : "+n);
        notify();
    }
}

abstract class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q=q;
        new Thread(this,"producer");
    }
    public void mainly(){
        int i=0;
        while (true){
            q.put(i++);
        }
    }
}

 abstract class Consumer implements Runnable{
    Q q;
    Thread thra;
    Consumer(Q q){
        this.q=q;
        thra=new Thread(this,"comsumer");
    }
    public void main(){
        while (true){
            q.get();
        }
    }
}
public class progm3 {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q) {
            @Override
            public void run() {

            }
        };
        new Consumer(q) {
            @Override
            public void run() {
                    int i=0;
                    while (true){
                        q.put(i++);
                }
            }
        };
        System.out.println("PRESS CONTROL-C TO STOP....");
    }
}
