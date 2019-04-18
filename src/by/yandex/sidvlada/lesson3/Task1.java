package by.yandex.sidvlada.lesson3;

public class Task1 {

    public void HoursWeeks() {

        int s = 3700;
        int sec;
        int m;
        int min, h;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println(h + " часов" + min + " минут" + sec + " секунд");

        int week;
        int day;
        int w, d;
        d = h % 24;
        day = (d - h)/24;
        week = day%7;
        System.out.println(day + " дней " + week + " недель ");
    }
}