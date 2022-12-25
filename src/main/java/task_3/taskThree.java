package task_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class taskThree {

    public void sumWords(){
        int n = 10;
        Map<String, Integer> words = new HashMap<>();

        try {
            Scanner wordScanner = new Scanner(new File("D:\\Programming\\Java\\" +
                    "Homework-Module-10\\src\\main\\resources\\words.txt"));
            wordScanner.useDelimiter("[^A-Za-z]+");

            while (wordScanner.hasNext()) {
                String word = wordScanner.next().toLowerCase();
                Integer count = words.get(word);
                words.put(word, (count == null) ? 1 : count + 1);
            }
            ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(words.entrySet());

            entries.sort((ent1, ent2) -> (Objects.equals(ent1.getValue(), ent2.getValue()))
                    ? ent1.getKey().compareTo(ent2.getKey())
                    : ent2.getValue() - ent1.getValue());

            for (Map.Entry<String, Integer> ent : entries) {
                if (--n < 0) break;
                System.out.printf("%s %d\n", ent.getKey(), ent.getValue());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
