import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Definimos um array de inteiros (numero a serem ordenados)
        int[] arr = {24, 68, 70, 10, 5, 20};

        // Exibindo o array antes da ordenação.
        System.out.println("Array antes da ordenação: " + Arrays.toString(arr));

        //Chamamos o metodo bubbleSort da classe BubbleSort.
        BubbleSort.bubbleSort(arr);

        System.out.println("Arrray depois da ordenação: " + Arrays.toString(arr));
    }
}