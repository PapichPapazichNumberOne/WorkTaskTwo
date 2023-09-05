public class Main {

    public static void main(String[] args) {
        System.out.println(checkSumInRange(5, 7));
        printPositiveOrNegative(-3);
        System.out.println(isNegative(-5));
        printStringMultipleTimes("Hello, World!", 3);

        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        flipBinaryArray(binaryArray);
        printArray(binaryArray);

        int[] hundredArray = createArray(100, 1);
        printArray(hundredArray);

        int[] multiplyLessThanSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSixByTwo(multiplyLessThanSix);
        printArray(multiplyLessThanSix);

        int[][] squareArray = createSquareArray(5);
        printTwoDimensionalArray(squareArray);
    }

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void flipBinaryArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }

    public static void multiplyLessThanSixByTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static int[][] createSquareArray(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            result[i][i] = 1;
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printTwoDimensionalArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
