package dz5.src.ua.com.goit.dolshanskyi.module5.task1;

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

        Array array = new Array(targetArray);

        System.out.println("Target array is:");
        for (int element : targetArray) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("Max element target array is: " + array.searchMaxElement());
        System.out.println("Min element target array is: " + array.searchMinElement());
    }
}
