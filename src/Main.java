public class Main {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords () {
        System.out.println("«адание є1. —оздайте метод, который при вызове должен отпечатать в столбец три слова.");
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }

    //  3. —оздайте метод checkSumSign(), в теле которого объ€вите две int переменные a и b, и инициализируйте их любыми
    //  значени€ми, которыми захотите. ƒалее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    //  то вывести в консоль сообщение У—умма положительна€Ф, в противном случае - У—умма отрицательна€Ф;
    public static void checkSumSign() {

        System.out.println("«адание є2. ќпределить знак суммы двух чисел");
        int a = 1;
        int b = -2;
        int sum = a+b;

        if (sum >=0) {
            System.out.println("—умма положительна€");
        }
        else {
            System.out.println( "—умма отрицательна€");
        }
    }

    // 4. —оздайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    // ≈сли value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение У расныйФ, если лежит в
    // пределах от 0 (0 исключительно) до 100 (100 включительно), то У∆елтыйФ, если больше 100 (100 исключительно) - У«еленыйФ;

    public static void printColor() {
        int value = 0;
        System.out.println("«адание є3.  расный, желтый, зеленый");

        if (value <= 0) {
            System.out.println(" расный");
        }
        else if (value > 0 & value <=100)
        {
            System.out.println("∆елтый");
        }
        else {
            System.out.println("«еленый");
        }
    }

   // 5. —оздайте метод compareNumbers(), в теле которого объ€вите две int переменные a и b, и инициализируйте их любыми
    // значени€ми, которыми захотите. ≈сли a больше или равно b, то необходимо вывести в консоль сообщение Уa >= bФ,
    // в противном случае Уa < bФ;

    public static void compareNumbers() {
        System.out.println("«адание є4. a и b");
        int a = 100;
        int b = 200;

        if (a>=b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }


}