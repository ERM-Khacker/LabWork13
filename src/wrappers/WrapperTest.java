package wrappers;

import static jdk.nashorn.internal.objects.Global.Infinity;

/*1   Создать пакет wrappers в своем проекте, дальнейшая работа будет вестись в нем.
        2  Создать класс WrapperTest, с main методом*/
public class WrapperTest {
    public static void main(String[] args) {
      /*  2.1 Для каждого типа данных создать по 4 переменные и проинициализировать разными
        вариантами:
        •  Из примитива, используя автоупаковку
        •  С помощью метода valueOf
        •  С помощью new
        •  Распарсить значение из строки*/

        Byte b1 = 10;
        Byte b2 = Byte.valueOf((byte) 12);
        Byte b3 = new Byte((byte) 11);
        Byte b4 = Byte.parseByte("111");

        Short s1 = 10;
        Short s2 = Short.valueOf((short) 150);
        Short s3 = new Short((short) 161);
        Short s4 = Short.parseShort("244");

        Integer i1 = 19999;
        Integer i2 = Integer.valueOf(2000);
        Integer i3 = new Integer(30000);
        Integer i4 = Integer.parseInt("400000");

        Long l1 = 500000L;
        Long l2 = Long.valueOf(4000000);
        Long l3 = new Long(34434343);
        Long l4 = Long.parseLong("434242323");

        Float f1 = 23.2321f;
        Float f2 = Float.valueOf(242.23f);
        Float f3 = new Float(2.23f);
        Float f4 = Float.parseFloat("32.3");

        Double d1 = 342.424;
        Double d2 = Double.valueOf(332.31);
        Double d3 = new Double(233.5);
        Double d4 = Double.parseDouble("24.311");

        Character c1 = 332;
        Character c2 = Character.valueOf((char) 224);
        Character c3 = new Character((char) 100);
        Character c4 = Character.valueOf('R');


        /*3.Создать переменную типа Double присвоить ей значение с дробной частью.*/
        Double value = 100.2;
        /*3.1 Создать переменные примитивных типов (byte, short, int, float, long)*/
        byte num1 = 100;
        short num2 = 1000;
        int num3 = 100000;
        long num4 = 1000000;
        float num5 = 120.3f;
        /*3.2 Преобразовать и присвоить значение Double каждому из примитивных типов
        используя специальные методы или автораспаковку.*/
        Double num6 = (double) num1;
        Double num7 = (double) num2;
        Double num8 = (double) num3;
        Double num9 = (double) num4;
        Double num10 = Double.valueOf(num5);

      /*4  Проверить значения NaN и Infinity.
        4.1 Создать 2 переменные типа Double, одной из них присвоить значение 0.0.*/
        Double n1 = 111.1;
        Double n2 = 0.0;

        /*4.2 Создать переменную типа Double nanValue и присвоить ей значение, деления
        ненулевой переменной на нулевую.*/
        Double nanValue = n1 / n2; // ошибка в задании! Тут как раз получается Infinity а не NaN

        /*4.3 Создать переменную infinityValue и присвоить ей значение, деления нулевой
        переменной саму на себя.*/
        Double infinityValue = n2 / n2; // ошибка в задании! А тут получается  как раз NaN а не Infinity

        /*4.4 Вывести nanValue и infinityValue на экран.*/
        System.out.println(nanValue); // Infinity
        System.out.println(infinityValue); // NaN

        WrapperTest wrap = new WrapperTest();
        wrap.isNaN(0.0, 0.0);
        wrap.isInfinity(20.2, 0.0);

        /*5. Создать 2 переменных типа Long присвоить обеим значения 120*/
        Long longer1 = 120L;
        Long longer2 = 120L;

        /*5.1 Вывести на экран результат сравнения этих переменных по оператору ==.*/
        System.out.println(longer1 == longer2); // true

        /*5.2 Заменить значения переменных на 1200, перепроверить сравнение.*/
        longer1 = 1200L;
        longer2 = 1200L;
        System.out.println(longer1 == longer2); //false
    }

    /*4.5 Добавить по 2 блока if для каждого числа в которых проверяется результат
       выполнения методов isNaN и isInfinity.
       Если число NaN вывести текст «Переменная {{имя переменной}} = NaN»
       Если число Infinity вывести текст «Переменная {{имя переменной}} = Infinity»*/
    void isNaN(double number1, double number2) {
        double result = number1 / number2;
        if (Double.isNaN(number1 / number2)) {
            System.out.println("Переменная {{result}} = NaN");
        } else {
            System.out.println(result);
        }
    }

    void isInfinity(double number1, double number2) {
        double result = number1 / number2;
        if (number1 / number2 == Infinity) {
            System.out.println("Переменная {{result}} = Infinity");
        } else {
            System.out.println(result);
        }
    }
}
