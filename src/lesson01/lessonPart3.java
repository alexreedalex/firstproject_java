package lesson01;

public class lessonPart3 {
    public static void main(String[] args) {
        String word1 = "HELL ";
        String word2 = "     yeah!";
        String result = word1 + word2; // конкатенация
        System.out.println(result);

        String word1LowerCase = word1.toLowerCase(); // нижний регистр
        System.out.println(word1LowerCase);

        int length = word1.length();// длина строки
        System.out.println(length); // покажет 5 символов - 4 буквы и пробел

        String repeated = word1.repeat(3); // повтор строки
        System.out.println(repeated);

        String repeated2 = word1.repeat(3).toLowerCase(); // повтор строки + перевод в нижний регистр
        System.out.println(repeated2);

        System.out.println(word2);
        String trimmed = word2.trim(); // уберет лишние пробелы
        System.out.println(trimmed);

        String replaced = word2.replaceAll("h", "p"); // заменит символ, дублированные заменит оба
        System.out.println(replaced);

        String replaced2 = word2.replaceAll("ah", "s sir!"); // заменит символ на дописанные, оставит !
        System.out.println(replaced2);

        String word3 = "Hell\n"; // спецсимвол переноса строки
        String word4 = "yeah!";
        System.out.println(word3 + word4);



    }
}
