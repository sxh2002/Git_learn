import java.util.Arrays;

public class insertSort {
    public static void insertSort(int[] numbers){
        int temp;
        int j;
        int size = numbers.length;

        for(int i=0;i<size;i++){
            temp = numbers[i];
            for(j=i-1;j>=0&&temp<numbers[j];j--){
                numbers[j+1]=numbers[j];
            }
            numbers[j+1]=temp;
        }
    }
}
