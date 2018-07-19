import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArraySorter sorter = new ArraySorter();
        int[] workArray;

        workArray = sorter.fillerArr(10, 50);
        workArray = sorter.sortArrayLogic(workArray);


//        System.out.println(sorter.sortArrayLogic
//                (sorter.fillerArr(50, 50)));
        System.out.println(Arrays.toString(workArray));

    }
}
