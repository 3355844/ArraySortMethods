public class ArraySorter {

    //   Сортировка методом вставки
    public int[] insertionSort(int[] array) {
        int counter = 0;
        int key;
        for (int i = 1; i < array.length; i++) {
            key = array[i]; // значення змінної
            int j = i - 1; // індекс попереднього елемента

            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
                counter++;
            }
            array[j + 1] = key;
        }
        System.out.println("\nCycles Insert Method : " + counter);
        return array;
    }

    public int[] sortArrayLogic(int[] array) {
        int counterChanges;
        int arrayCycleCounter = 0;
        while (true) {
            counterChanges = 0;
            for (int i = 0; i < array.length; i++) {
                int tempValue;
                arrayCycleCounter++;
                if ((i + 1) == array.length) break;
                if (array[i] < array[i + 1]) {
                    tempValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempValue;
                    counterChanges++;
                }
            }
            if (counterChanges == 0) break;
        }
        System.out.println("\nCycles Our method: " + arrayCycleCounter);
        return array;
    }


    public void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //    Метод заполняющий массив
    public int[] fillerArr(int size, int maxArrayNumber) {

        int[] resultArr = new int[size];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = (int) (Math.random() * (maxArrayNumber + 1));
            System.out.print(resultArr[i] + " ");
        }
        return resultArr;
    }
}
