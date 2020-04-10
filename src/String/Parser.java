package String;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Parser {
    private static String readFileContent(String path) throws IOException {
        return Files.readString(Paths.get("C:\\Users\\Kirill\\Desktop\\OldFile.txt"));
    }
    private static List<String> parseWords(String text){
        return List.of(text.split(" "));
    }
    private static List<String> parseSentences(String text){
        return List.of(text.split("\\."));
    }
    private static List<String> parseItem12(String text){
        return List.of(text.replaceAll("\\b[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]{1}.{4,4}\\b", ""));
    }
    private static List<char[]> parseSymbol(String text){
        return List.of(text.toCharArray());
    }


    public static Text parseText(String path) throws IOException {
        final String rawText = readFileContent(path);
        final List<String> words = parseWords(rawText);
        final List<String> sentences = parseSentences(rawText);
        final List<String> item12 = parseItem12(rawText);
        final List<char[]> symbol = parseSymbol(rawText);
        final Text text = new Text();
        text.setWords(words);
        text.setSentence(sentences);
        text.setItem12(item12);
        text.setSymbol(symbol);
        return text;
    }
}
