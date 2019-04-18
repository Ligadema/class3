package by.yandex.sidvlada.lesson3;
import java.util.Scanner;

public class Task2 {

         public void EnterNumber() {

            System.out.println("Enter ");
            Scanner scanner = new Scanner(System.in);

            int count = scanner.nextInt();

            if (count % 10 == 7) {
                System.out.println("True ");
            } else {
                System.out.println("False ");
            }
        }
    }

