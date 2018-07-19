public class ArraySorter {

    public int[] sortArrayLogic(int[] array) {
        int counterChanges;
        boolean isSorted = true;
        while (isSorted) {
            counterChanges = 0;
            System.out.println("come to while");
            for (int i = 0; i < array.length; i++) {
                System.out.println("for cycle");
                int tempValue;
                int j = i;
                j++;
                if (j == array.length) break;
                if (array[i] > array[j]) {
                    System.out.println("Elements is changes");
                    tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                    counterChanges++;
                    System.out.println("Counter: " + counterChanges);
                }
            }
            if (counterChanges == 0) break;
        }
        return array;
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
