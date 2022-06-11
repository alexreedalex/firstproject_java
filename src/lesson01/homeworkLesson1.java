package lesson01;

import java.util.Arrays;

public class homeworkLesson1 {
        public static void main(String[] args) {
            //Базовый уровень
            //Задача №1
            //Дано (их менять нельзя)

            String hi = "                Hello ";
            String world = " WoRld!";
            char newLine = '\n';

            //Создать из трех переменных единую строку,
            //Привести к правильному виду (Ниже), убрать лишние слова,

            String trimmed = hi.trim(); // убираем пробелы
            String worldLowerCase = world.toLowerCase(); // приводим к нижнему регистру
            String repeated = (trimmed + worldLowerCase + newLine).repeat(3); // три вывода со смещением строки
            System.out.println(repeated); // вывод

            //затроить (Можно вызвать тольку одну команду System.out.print())
            //
            //Результат вывода на экран:
            //Hello world!
            //Hello world!
            //Hello world!

            // done



            //Задача №2
            //Создать переменные с ростом (!в метрах), весом.
            //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
            //Пример результата вывода на экран:
            //21.0

            double height = 1.8; // рост
            double weight = 72; // вес
            System.out.printf( "%.1f", (weight / (height * height))); // вывод имс по формуле
            // нашел вариант форматирования строки в дополнение к выводу
            // более просто варианта приведения к одной цифре после запятой пока не нашел

            // done



            //Задача №3
            //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
            //и снова создать строку, вывести на экран

            System.out.println('\n'); // добавил перенос, чтобы с прошлой строкой не слипалось. Пока такой костыль
            char[] myArray = new char[5];
            myArray[0] = 'a';
            myArray[1] = 'b';
            myArray[2] = 'c';
            myArray[3] = 'd';
            myArray[4] = 'e';
            String myString0 = Arrays.toString(myArray);
            System.out.println(myString0);
            myArray[3] = 'h';
            String myString01 = Arrays.toString(myArray);
            System.out.println(myString01);

            // done



            //Продвинутый уровень
            //Задача №1
            //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

            String myString = "234";
//            int A = Integer.valueOf(myString); // преобразует в обьект Integer, но нам, видимо, нужен второй вариант
            int B = Integer.parseInt(myString); // возвращает примитивный int в качестве вывода - условие задачи?
            String phrase = "some_text"; // добавляем поставленную строку
            int length = phrase.length(); // узнаем длину строки
            int exercise = B + length; // суммируем значения
            System.out.println(exercise); // вывод суммы для проверки

            // done



            //Задача №2
            //Посчитать (a+b)^2 = ?, при a=3, b=5

            int result = homeworkLesson1.function(3,5); // функция выведена ниже
            System.out.println(result); // вывод результата

            // done



            //Задача №3
            //Создать два массив чисел:
            // 1,2,5,7,10
            // 2,3,2,17,15
            // Создать массив чисел, в котором будут: все числа из этих двух массивов,
            // и результат умножения чисел с одинаковым порядковым номером

            int[] myArray11 = new int[5];
            myArray[0] = 1;
            myArray[1] = 2;
            myArray[2] = 5;
            myArray[3] = 7;
            myArray[4] = 10;

            int[] myArray22 = new int[5];
            myArray[0] = 2;
            myArray[1] = 3;
            myArray[2] = 2;
            myArray[3] = 17;
            myArray[4] = 15;

            int[] myArray33 = new int[5];


            //Ожидаемый результат:
            //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
            //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
            //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

            //Задача №4
            //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов

            //Экспертный уровень
            //Задача №1
            //Создать метод маскирования персональных данных, который:
            //Телефон (до/после маскирования): 79991113344 / 7999***3344
            //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
            //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
            //
            //Входящие параметры: String text
            //Возвращаемый результат: String
            //
            //Примеры возможного текста:
            //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
            //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
            //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

            //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
            //Регулярные выражения, класс StringBuilder
        }
    public static int function(int a, int b) {
        return (a + b) * (a + b);
    }
    }