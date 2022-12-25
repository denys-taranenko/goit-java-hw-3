import task_1.taskOne;
import task_2.taskTwo;

public class Main {
    public static void main(String[] args) {

        taskOne oneTask = new taskOne();
        oneTask.readFile(); /* Should be 987-123-4567
                                         (123) 456-7890 */

        taskTwo twoTask = new taskTwo();
        twoTask.readFile();
    }
}