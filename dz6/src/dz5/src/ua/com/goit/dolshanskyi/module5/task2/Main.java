package dz5.src.ua.com.goit.dolshanskyi.module5.task2;

import ua.com.goit.dolshanskyi.module6.common.InputInteger;

public class Main {

    public static void main(String[] args) {

        InputInteger intValue = new InputInteger();

        System.out.println("Please input length array ");
        int length = intValue.getIntegerFromConsole();
        int[] targetArray = new int[length];

        System.out.println("Please input integer array values");
        for(int i = 0 ; i < length ; i++ ){
            targetArray[i] = intValue.getIntegerFromConsole();
        }

        System.out.println("Target array is:");
        for (int element : targetArray) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("Result array is:");
        for (int element : bubbleSort(targetArray)) {
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
