package task_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskTwo {
    public void txtToJson() throws IOException {

        User user1 = new User();
        user1.setName("alice");
        user1.setAge(21);

        User user2 = new User();
        user2.setName("ryan");
        user2.setAge(30);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonUser = gson.toJson(userList);

        System.out.println(jsonUser);

        FileWriter fileWriter = new FileWriter("D:\\Programming\\Java\\Homework-Module-10\\src\\main\\resources\\user.json");

        fileWriter.write(jsonUser);
        fileWriter.flush();
        fileWriter.close();
    }
}