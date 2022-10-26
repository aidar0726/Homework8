public class Main {
    public static void main(String[] args) {
        System.out.println("массивы часть 1");

        System.out.println("задание 1");
        int[] array = new int[]{1, 2, 3};
        double[] arrayFractionalNumbers = {1.57, 7.654, 9.986};

        System.out.println("задание 2");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }

        System.out.println("задание 3");
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i - 1]);
        }

        System.out.println("задание 4");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
            }

            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
    }
}