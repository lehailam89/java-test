//public class Main {
//    public static void main(String[] args) {
//        // Chạy Thread tính số nguyên tố
////        PrimeNumberThread primeThread = new PrimeNumberThread();
////        primeThread.start();
//
//        // Chạy Thread kiểm tra chẵn/lẻ
////        OddEvenThread oddEvenThread = new OddEvenThread();
////        oddEvenThread.start();
//
//        // Chạy quản lý sinh viên
////        StudentManagement.main(null);
//
//        // Chạy sắp xếp mảng
//        SortDemo.main(null);
//    }
//}

import java.util.*;
import java.util.concurrent.*;

public class Main {

    // a. Tạo 1 thread tính toán số nguyên tố
    static class PrimeNumberThread extends Thread {
        @Override
        public void run() {
            int count = 0;
            for (int i = 2; i <= 1000000; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            System.out.println("Số lượng số nguyên tố từ 1 đến 1 triệu là: " + count);
        }

        private boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }

    // b. Tạo thread yêu cầu người dùng nhập số và kiểm tra chẵn lẻ
    static class OddEvenThread extends Thread {
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

    // C. Lớp lưu trữ danh sách sinh viên và điểm số
    static class StudentManagement {
        public static void main(String[] args) {
            LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
            students.put("Nguyen A", 8);
            students.put("Tran B", 7);
            students.put("Nguyen C", 9);
            students.put("Le D", 6);

            // Sắp xếp theo họ tên (nếu tên trùng thì sắp xếp theo họ)
            List<Map.Entry<String, Integer>> studentList = new ArrayList<>(students.entrySet());
            studentList.sort((entry1, entry2) -> {
                String name1 = entry1.getKey().split(" ")[0];
                String name2 = entry2.getKey().split(" ")[0];
                return name1.compareTo(name2);
            });

            // In ra danh sách sinh viên theo thứ tự họ tên
            System.out.println("Danh sách sinh viên theo thứ tự họ tên:");
            for (Map.Entry<String, Integer> entry : studentList) {
                System.out.println(entry.getKey() + " - Điểm: " + entry.getValue());
            }
        }
    }

    // D. Giao diện Sorter với phương thức sort
    @FunctionalInterface
    interface Sorter {
        void sort(int[] arr);
    }

    // Demo sắp xếp mảng
    static class SortDemo {
        public static void main(String[] args) {
            int[] arr = {42, 7, 19, 25, 31};

            // Lambda expression để triển khai phương thức sort
            Sorter sorter = (array) -> Arrays.sort(array);

            sorter.sort(arr); // Sắp xếp mảng
            System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        }
    }

    // Main method để gọi các hàm theo yêu cầu
    public static void main(String[] args) {
        // Chạy Thread tính số nguyên tố
//        System.out.println("Chạy Thread tính số nguyên tố...");
//        PrimeNumberThread primeThread = new PrimeNumberThread();
//        primeThread.start();

        // Chạy Thread kiểm tra chẵn/lẻ
//        System.out.println("Chạy Thread kiểm tra chẵn/lẻ...");
//        OddEvenThread oddEvenThread = new OddEvenThread();
//        oddEvenThread.start();

        // Chạy quản lý sinh viên
//        System.out.println("Chạy quản lý sinh viên...");
//        StudentManagement.main(null);

//         Chạy sắp xếp mảng
        System.out.println("Chạy sắp xếp mảng...");
        SortDemo.main(null);
    }
}

