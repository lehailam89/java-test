import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 5};
        Sorter sorter = (array) -> Arrays.sort(array);

        sorter.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }
}
