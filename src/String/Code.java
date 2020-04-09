package String;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;


public class Code {
    private static final Logger log = Logger.getLogger(Code.class.getName());
    private String[] words;
    private String[] sentence;
    private String item12;
    protected String path="C:\\Users\\Kirill\\Desktop\\OldFile.txt";
    
    public  void code() throws IOException {
        try {
            final String file = Files.readString(Paths.get(path));
            words = file.split("\\s");
            sentence = file.split("\\.");
            item12 = file.replaceAll("\\b[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]{1}.{4,4}\\b", "");
            log.info("сообщение без смысловой нагрузки");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}