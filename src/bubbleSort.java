import java.util.Arrays;

public class bubbleSort {
    public static void bubbleSort(int[] numbers){
        int temp;
        int size=numbers.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("冒泡排序后："+ Arrays.toString(numbers));
    }
}


