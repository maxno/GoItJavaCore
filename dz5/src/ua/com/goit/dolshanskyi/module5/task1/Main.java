package ua.com.goit.dolshanskyi.module5.task1;

public class Main {

    public static void main(String[] args) {

        int[] targetArray = {5, 6, 2, 9, 10, 58};

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
