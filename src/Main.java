import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArraySorter sorter = new ArraySorter();
        int[] workArray;
        int[] sortedArrayLogic;
        int[] insertionsSortArray;


        workArray = sorter.fillerArr(10, 50);
        sortedArrayLogic = sorter.sortArrayLogic(workArray.clone());
        insertionsSortArray = sorter.insertionSort(workArray.clone());
//        System.out.println(sorter.sortArrayLogic
//                (sorter.fillerArr(50, 50)));

        sorter.printArr(workArray);
        System.out.println();
        sorter.printArr(sortedArrayLogic);
        System.out.println();
        sorter.printArr(insertionsSortArray);
    }
}
