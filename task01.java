import java.util.Random;

/*(Дополнительное) Реализовать алгоритм сортировки слиянием */
/**
 * task01
 */
public class task01 {

    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int [rand.nextInt(20, 40)];
        for (int k = 0; k < array.length; k++) {
            array[k] = rand.nextInt(0, 100);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        int [] newArray = MergeSort(array);
        for (int j : newArray) {
            System.out.print(j + " ");
        }
    }
    
    static int [] MergeSort(int[] initArray){
        if (initArray.length == 1){
            return initArray;
        }
        else{
            int middle = initArray.length/2;
            int[]leftHalfArr = new int[middle];
            int[]rightHalfArr = new int [initArray.length - middle];
            for (int i = 0; i < leftHalfArr.length; i++) {
                leftHalfArr[i] = initArray[i];
            }
            for (int j = 0; j < rightHalfArr.length; j++) {
                rightHalfArr[j] = initArray[j + middle];
            }
            leftHalfArr = MergeSort(leftHalfArr);
            rightHalfArr = MergeSort(rightHalfArr);
            int []result = new int [initArray.length];
            int i = 0;
            int j = 0;
            for (int k = 0; k < result.length; k++) {
                if (i == leftHalfArr.length){
                    result[k] = rightHalfArr[j];
                    j++;
                } else if (j == rightHalfArr.length){
                    result[k] = leftHalfArr[i];
                    i++;
                } else if (leftHalfArr[i] > rightHalfArr[j]){
                    result[k] = rightHalfArr[j];
                    j++;
                } else{
                    result[k] = leftHalfArr[i];
                    i++;
                }                                                                               
            }
            return result;           
        }
    }
}
