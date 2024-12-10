public class BubbleSort {

    public static void bubbleSort(int[] array) {

        // Esse for itera o array e garante que o maior número vá para a sua posição correta
        for (int index = 0; index < (array.length - 1); index++) {

            // Esse for percorre o array até a posição não ordenada;
            // A cada iteração desse for, o primeiro for(que está acima) precisa percorrer menos elementos, já que os maiores números estão ordenados no final do array.
            for (int j = 0; j < array.length - index - 1; j++) {

                // Verificando se o número atual é maior do que o próximo
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j]; // guarda de forma temporária o valor do número atual
                    array[j] = array[j + 1]; // substituição do número atual pelo número seguinte
                    array[j + 1] = temp; // coloca o valor do número atual no próximo elemento
                }
            }
        }
    }


}