package String;

import java.util.List;


public class Text {

    private List <String> words;
    private List <String> sentence;
    private List <String> item12;
    private List<char[]> symbol;

    public List<char[]> getSymbol() {
        return symbol;
    }

    public void setSymbol(List<char[]> symbol) {
        this.symbol = symbol;
    }

    public List<String> getItem12() {
        return item12;
    }

    public List<String> getSentence() {
        return sentence;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public void setSentence(List<String> sentence) {
        this.sentence = sentence;
    }

    public void setItem12(List<String> item12) {
        this.item12 = item12;
    }

//    This is another method in one function
/*
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
            log.warning("что-то пошло не так");
        }
    }

 */
}