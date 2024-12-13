import java.util.Scanner;

public class OddEvenThread extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập một số nguyên: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " là số chẵn.");
            } else {
                System.out.println(num + " là số lẻ.");
            }
        }
    }
}
