package ua.com.goit.dolshanskyi.module5.task1;

    import java.util.Arrays;

public class Array {

    private int[] array;

    public Array(int[] array)
    {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    int searchMinElement() {

        int arrayMin[] = array;
        Arrays.sort(arrayMin);
        return arrayMin[0];
    }

    int searchMaxElement() {

        int arrayMax[] = array;
        Arrays.sort(arrayMax);
        return arrayMax[arrayMax.length - 1];
    }
}
