package test;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CodeTest {
    String path ="C:\\Users\\Kirill\\Desktop\\OldFile.txt";


    @Test
    public void notEqualSource() {
        try {
            final String file = Files.readString(Paths.get(path));
            String item12 = file.replaceAll("\\b[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]{1}.{4,4}\\b", "");
            assert item12!= file;
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void notEqualNull() {
        try {
            final String file = Files.readString(Paths.get(path));
            String item12 = file.replaceAll("\\b[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]{1}.{4,4}\\b", "");
            assert item12!= null;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void notContainDeterminedWords(){
        try {
            final String file = Files.readString(Paths.get(path));
            String item12 = file.replaceAll("\\b[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]{1}.{4,4}\\b", "");
            assert item12.contains("\\b[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]{1}.{4,4}\\b") == false;
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
