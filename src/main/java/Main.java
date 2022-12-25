import task_1.taskOne;
import task_2.taskTwo;
import task_3.taskThree;

public class Main {
    public static void main(String[] args) {

        taskOne oneTask = new taskOne();
        oneTask.readFile(); /* Should be 987-123-4567
                                         (123) 456-7890 */

        taskTwo twoTask = new taskTwo();
        twoTask.txtToJson();

        taskThree threeTask = new taskThree();
        threeTask.sumWords(); /* Should be the 4
                                           is 3
                                           sunny 2
                                           day 1 */
    }
}