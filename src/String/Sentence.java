package String;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Sentence extends Code {
    private String[] sentence;
    public  void code() throws IOException {
        try {
            final String file = Files.readString(Paths.get(path));
            sentence = file.split("\\.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
