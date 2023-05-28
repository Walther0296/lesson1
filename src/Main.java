public class Main {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords () {
        System.out.println("������� �1. �������� �����, ������� ��� ������ ������ ���������� � ������� ��� �����.");
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }

    //  3. �������� ����� checkSumSign(), � ���� �������� �������� ��� int ���������� a � b, � ��������������� �� ������
    //  ����������, �������� ��������. ����� ����� ������ �������������� ��� ����������, � ���� �� ����� ������ ��� ����� 0,
    //  �� ������� � ������� ��������� ������ ��������������, � ��������� ������ - ������ ��������������;
    public static void checkSumSign() {

        System.out.println("������� �2. ���������� ���� ����� ���� �����");
        int a = 1;
        int b = -2;
        int sum = a+b;

        if (sum >=0) {
            System.out.println("����� �������������");
        }
        else {
            System.out.println( "����� �������������");
        }
    }

    // 4. �������� ����� printColor() � ���� �������� ������� int ���������� value � ��������������� �� ����� ���������.
    // ���� value ������ 0 (0 ������������), �� � ������� ����� ������ ������� ��������� ��������, ���� ����� �
    // �������� �� 0 (0 �������������) �� 100 (100 ������������), �� �������, ���� ������ 100 (100 �������������) - ��������;

    public static void printColor() {
        int value = 0;
        System.out.println("������� �3. �������, ������, �������");

        if (value <= 0) {
            System.out.println("�������");
        }
        else if (value > 0 & value <=100)
        {
            System.out.println("������");
        }
        else {
            System.out.println("�������");
        }
    }

   // 5. �������� ����� compareNumbers(), � ���� �������� �������� ��� int ���������� a � b, � ��������������� �� ������
    // ����������, �������� ��������. ���� a ������ ��� ����� b, �� ���������� ������� � ������� ��������� �a >= b�,
    // � ��������� ������ �a < b�;

    public static void compareNumbers() {
        System.out.println("������� �4. a � b");
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