package by.yandex.sidvlada.lesson3;

public class Task4 {

    public void Money() {
        int d = 90;
        int e = 0;
        int i = d + e;
        int x = i % 10;

        if ((i >= 5 | i < 1) && x >= 5 | x == 0) {
            System.out.println(i + " рублей");
        } else if (0 < x && x < 2) {
            System.out.println(i + " рубль");
        } else {
            System.out.println(i + " рубля");
        }
    }
}
