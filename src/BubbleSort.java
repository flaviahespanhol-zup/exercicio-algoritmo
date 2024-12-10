public class BubbleSort {

    public static void bubbleSort(int[] array) {

        for (int index = 0; index < (array.length - 1); index++) {
            for (int j = 0; j < array.length - index - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


}