import java.util.Arrays;

public class quickSort {
    public static void quickSort(int[]numbers){
        quickSort(numbers,0,numbers.length-1);
        System.out.println("快速排序："+ Arrays.toString(numbers));
    }
    public static void quickSort(int[]numbers,int low,int high){
        if(low>high){
            return;
        }
        int i = low;
        int j = high;
        int key = numbers[low];
        while(i<j) {
            while (numbers[j] > key && j > i) {
                j--;
            }
            while (numbers[i] <= key && i < j) {
                i++;
            }
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        int temp = numbers[i];
        numbers[i] = numbers[low];
        numbers[low] = temp;
        quickSort(numbers,low,i-1);
        quickSort(numbers,i+1,high);

    }
}
