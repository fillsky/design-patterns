package strategy.sort.algorythm;

public class CountingSort implements SortInterface {
    @Override
    public int[] sortMe(int[] array) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length ; i++) {
            if (max < array[i]){
                max = array[i];
            }

        }

        int [] countArray = new int [max+1];

        for (int i = 0; i < array.length; i++) {
            countArray[i]++;
        }

        int [] sortedArray = new int[array.length];
        int counter = 0;

        for (int i = 0; i < countArray.length;) {
            if(countArray[i]>0){
                sortedArray[counter] = i;
                counter++;
                countArray[i]--;
            } else {

                i++;
            }

        }
        return sortedArray;
    }


}
