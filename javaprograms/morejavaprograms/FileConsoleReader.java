import java.io.*;

public class FileConsoleReader {
    public static void main(String[] args) {

        String myString;

        /** Create and use a file reader */
        try (BufferedReader myBufferedReader = new BufferedReader(new FileReader("test.txt"))) {

            while ((myString = myBufferedReader.readLine()) != null) {
                /** Read the file from existing file and display them on screen */
                System.out.println(myString);
            }
            myBufferedReader.close();

        } catch (IOException e) {
            System.out.println("I/O Error...");
        }
    }

}
