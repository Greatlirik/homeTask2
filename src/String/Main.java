package String;


import java.io.IOException;
import java.util.logging.Logger;
/*Создать программу обработки фрагмента текста учебника по программированию с использованием элементов, например:
Символ, Слово, Предложение, Текст, Абзац, Листинг, Лексема, Знак препинания и др.*/

// пункт 12.Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
public class Main {
     private static final Logger log = Logger.getLogger(Text.class.getName());
     public static void main(String[] args) throws IOException {
         final Text text = Parser.parseText("C:\\Users\\Kirill\\Desktop\\OldFile.txt");
         log.info("все идет по плану");
       }
}

