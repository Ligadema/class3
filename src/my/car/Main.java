package my.car;

import java.util.Scanner;
import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
 /*
        int s = 3700;
        int sec;
        int m;
        int min, h;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println(h + " часов " + min + " минут " + sec + " секунд");

        int week;
        int day;
        int w, d;
        d = h % 24;
        day = (d - h)/24;
        week = day%7;
        System.out.println(day + " дней " + week + " недель "); */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи ");
       int a = scanner.nextInt();
        //Console c =System.console();
        //System.out.println("Enter password: ");
        //char[] ch=c.readPassword();
        //String pass=String.valueOf(ch);//converting char array into string
       //System.out.println("Password is: "+pass);

    }
}
