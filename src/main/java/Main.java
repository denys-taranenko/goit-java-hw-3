import task_1.TaskOne;
import task_2.TaskTwo;
import task_3.TaskThree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        TaskOne taskOne = new TaskOne();
        taskOne.readFile();                /* Should be 987-123-4567
                                           (123) 456-7890 */

        TaskTwo taskTwo = new TaskTwo();
        try {
            taskTwo.txtToJson();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }                                  /* Should be [
                                                          {
                                                            "name": "alice",
                                                            "age": 21
                                                          },
                                                          {
                                                            "name": "ryan",
                                                            "age": 30
                                                          }
                                                        ] */

        TaskThree taskThree = new TaskThree();
        taskThree.sumWords();              /* Should be the 4
                                           is 3
                                           sunny 2
                                           day 1 */
    }
}