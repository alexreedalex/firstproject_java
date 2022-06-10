package lesson01;

public class lessonPart2 {
    public static void main(String[] args) {

            char[] myArray = new char[6];
            myArray[2] = 'с';
            myArray[4] = 'о';
            myArray[5] = 'к';
            myArray[1] = 'е';
            myArray[0] = 'ч';
            myArray[3] = 'н';

            int result = lessonPart2.function(5, 4); //обращаюсь к созданному классу lessonPart2
            System.out.println(result);

            String text = String.copyValueOf(myArray); // копирует значение из массива
//            System.out.println(text.toUpperCase()); // делает все буквы заглавными
            String result2 = text.toUpperCase(); // делаем заглавные буквы и записываем в переменную result2
            System.out.println(result2);
    }
    public static int function(int x, int z) {
        return x * 2 * z;
    }
}
