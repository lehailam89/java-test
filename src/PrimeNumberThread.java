public class PrimeNumberThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        for (int i = 2; i <= 1_000_000; i++) {
            if (isPrime(i)) count++;
        }
        System.out.println("Số lượng số nguyên tố từ 1 đến 1 triệu là: " + count);
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
