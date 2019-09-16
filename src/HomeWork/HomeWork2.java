package HomeWork;

public class HomeWork2 {
    public static void main(String[] args)
}

//Домашнее задание к уроку 2. Основные конструкции

//Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    static void changeArray() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Замена 1: ");
        for (int z = 0; z < arr.length; z++) {
            System.out.print(arr[z] + " ");
            if (arr[z] == 0) arr[z] = 1;
            else arr[z] = 0;
        }
        System.out.print("\nЗамена 2: ");
        for (int z : arr) {
            System.out.print(z + " ");
        }
    }

//Задание 2. Задать пустой целочисленный массив размером 8.
//С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    static void createArray() {
        int[] arr = new int[8];
        for (int a = 0, b = 0; a < arr.length; a++, b += 3) {
            arr[a] = b;
            System.out.print(arr[a] + " ");
        }
    }
//Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2;

    static void changeArray2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Часть 1: ");

        for (int g : arr) {
            System.out.print(g + " ");
        }

        System.out.print("\nЧасть 2: ");

        for (int g = 0; g < arr.length; g++) {
            if (arr[g] < 6) arr[g] *= 2;
            System.out.print(arr[g] + " ");
        }
    }

//Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    static void createArray2() {
        int length = 9;

        int[][] arr = new int[length][length];
        for (int x = 0; x < length; x++) {
            for (int y = 0; y < length; y++) {
                if ((x == y) || (x == length - 1 - y)) {
                    arr[x][y] = 1;
                }
            }
        }

//Задание 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        static void minAndMaxArr() {
            int[] arr = {3, 6, -5, 4, -8, 7, 2, 1, -1, 9, 3, 5, 1};
            int min = arr[0];
            int max = arr[0];
            System.out.print("В этом массиве: ");
            for (int h : arr) {
                System.out.print(h + " ");
            }

            for (int h = 0; h < arr.length; h++) {
                min = (min < arr[h]) ? min : arr[h];
                max = (max > arr[h]) ? max : arr[h];
            }
            System.out.println("\nМинимальная ячейка: " + min + "\nМаксимальная ячейка: " + max);
        }

//Задание 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

        static boolean checkBalance(int[] arr) {
            int leftSum = 0, rightSum = 0;

            for (int s = 0; s < arr.length + 1; s++) {
                leftSum = 0;
                rightSum = 0;

                for (int m = 0; m < s; m++) {
                    leftSum += arr[m];
                }

                for (int m = s; m < arr.length; m++) {
                    rightSum += arr[m];
                }

                if (leftSum == rightSum) return true;
            }
            return false;
        }

//7. **** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить
// все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

        static void modifyArray(int[] arr, int n) {
            System.out.print("Часть 1: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }

            System.out.print("(n = " + n + ")");

            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    // Right
                    int tmp = arr[arr.length - 1];
                    for (int j = arr.length - 1; j > 0; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[0] = tmp;
                }
            } else if (n < 0) {
                for (int i = 0; i < n * (-1); i++) {
                    // Left
                    int tmp = arr[0];
                    for (int j = 0; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = tmp;
                }
            }

            System.out.print("\nЧасть 2: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }

//Additianl Line for Pull Request
    static void AddLine {
        System.out.print("AddLine");
       }
