public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2");
        int maxSum = -1;
        int minSum = 300_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");

        System.out.println("Задание 3");
        int day = 30;
        double mediumSum = sum / day;
        System.out.println("Средняя сумма трат за месяц составила " + mediumSum + " рублей.");

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);}
        }
    }