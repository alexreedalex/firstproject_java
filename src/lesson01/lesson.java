package lesson01;

public class lesson {
    public static void main(String[] args) {
        int myNumber = 5;
//        System.out.print(myNumber);


        byte myByte = -127;
        byte myByte2 = 127;
//        byte 0 -> 255

        short myShort = -32000;
        short myShort2 = 32000;
//        0 -> 64000

        long myLong = 9_200_000_000_000_000_000L;

        float myFloat = 3.123456789123456f;
        double myDouble = 3.123456789123456789;
//        System.out.println(myFloat);
//        System.out.println(myDouble);

        boolean myBoolean = true;
        boolean myBoolean2 = false;

        char letter = 'a';
//        System.out.println(letter + 1);

        int myInteger = 100;
        int myInteger2 = myInteger;

        myInteger = 101;
//        System.out.println(myInteger);
//        System.out.println(myInteger2);

//        [1, 2, 3, 4]
//        int[] myArray = new int[4];
        char[] myArray = new char[6]; //ссылка1
        myArray[2] = 'с';
        myArray[4] = 'о';
        myArray[5] = 'к';
        myArray[1] = 'е';
        myArray[0] = 'ч';
        myArray[3] = 'н';
        System.out.println(myArray); //выведет чеснок

        char[] myArray2 = myArray; //ссылка1
        myArray[0] = 'к';
        System.out.println(myArray2); //выведет кеснок
        myArray2[0] = 'ы';
        System.out.println(myArray); //выведет ыеснок
        System.out.println(myArray2); //выведет ыеснок

        Object user = new Object();
        Object user2 = user;

        int testInt = 1000;
        int testInt2 = 13;
        int result = testInt + testInt2;
        System.out.println(result);
        int result2 = testInt * testInt2;
        System.out.println(result2);
        int result3 = testInt - testInt2;
        System.out.println(result3);
        int result4 = testInt / testInt2;
        System.out.println(result4); //целочисленные типы поделятся без остатка
        double result5 = testInt / (double) testInt2;
        //меняем целочисленный тип возвращаемых данных на вещественный + преобразовываем testInt2 в вещественный
        System.out.println(result5); //произойдет деление с остатком



    }
}
