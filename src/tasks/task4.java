package tasks;

public class task4 {
    public static void main(String[] args) {
        // Печать чисел от 1 до 1 000 000 000
        for (long i = 1; i <= 1_000_000_000L; i++) {
            System.out.println(i);
            if (i % 10000000 == 0) { // Пауза на каждом 10 000 000 для уменьшения нагрузки на вывод
                try {
                    Thread.sleep(100); // Пауза на 100 мс
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
