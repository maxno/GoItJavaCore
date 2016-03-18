package ua.com.goit.dolshanskyi.module5.task2;

public class Main {

    public static void main(String[] args) {

        int[] array = {4, 7, 3, 89, 34, 45, 27};

        System.out.println("Target array is:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("Result array is:");
        for (int element : bubbleSort(array)) {
            System.out.print(element + " ");
        }

    }

    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
