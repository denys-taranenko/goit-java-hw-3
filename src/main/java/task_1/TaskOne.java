package task_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TaskOne {

    public void readFile() {
        File file = new File("D:\\Programming\\Java\\Homework-Module-10\\src\\main\\resources\\file1.txt");

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            while (bufferedReader.ready()) {
                String phoneNumber = bufferedReader.readLine().strip();
                if (phoneNumber.matches("^((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}-?\\d{4}$")) {
                    System.out.println(phoneNumber);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
