package lesson02;

public class myHomeworkLesson2 {
    public static void main(String[] args) {

        //Задача 1

        int index = 1;
        while (index < 101){
            System.out.print(index + "a ");
            index += 1;
        }

        //Задача 2

        int ageChildren = 18;
        if (ageChildren < 6) {
            System.out.println("\n" + "Пошел в детский сад");
        } else if (ageChildren < 11) {
            System.out.println("\n" + "Пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("\n" + "Пошел в среднюю школу");
        } else {
            System.out.println("\n" + "Пошел в университет");
        }
        //перенос строки сделал, чтоб к первому заданию не прилипало, пока не доходит почему не переносится с println

        //Задача 3

        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = false;
        boolean toast = false;
        boolean sausage = true;
        boolean eggs = true;
        if (chicken && vegetables && sour && toast) {
            System.out.println("Цезарь");
        } else if (vegetables && eggs && (sausage || chicken)) {
            System.out.println("Оливье");
        } else if (vegetables) {
            System.out.println("Овощной салат");
        } else {
            System.out.println("У меня ничего нет");
        }

        //Задача 4

        Spider homeSpider = new Spider(8, "Spidy");
        Fly homeFly = new Fly(6, "Maggot");
        System.out.println("У " + homeSpider.name + " " + homeSpider.legs + " ног.");
        System.out.println("А у " + homeFly.getName() + " " + homeFly.getLegs() + " ног.");
        //просто попробовал так и так вывести
    }
}

