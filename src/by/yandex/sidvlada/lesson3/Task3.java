package by.yandex.sidvlada.lesson3;

public class Task3 {

    public void Summ() {

        int a = 300;
        int b = 3;
        int r = 2;
        double p=3.14;

        double s1;
        double s2;

        s1 = a*b;
        s2 = p*Math.pow(r, 2);

        if (s1 < s2) {

            System.out.println ("да");
        }

        else {
            System.out.println ("нет");
        }
    }
}
