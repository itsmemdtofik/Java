//program of commandLineArgument using java
public class commandLineArgumnt {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int c = (num1 + num2 + num3 + num4) / 4;
        System.out.println("Total Average value is=" + c);
    }

}