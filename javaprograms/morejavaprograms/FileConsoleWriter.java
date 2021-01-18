import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.*;

public class FileConsoleWriter {
    public static void main(String[] args) {
        String myString;
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text('Stop to quit'): ");
        try (FileWriter myFileWriter = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                myString = myReader.readLine();
                if (myString.compareTo("stop") == 0)
                    break;
                myString = myString + "\r\n"; /* add new line */
                myFileWriter.write(myString);
            } while (myString.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("IO Error ");
        }

    }

}
