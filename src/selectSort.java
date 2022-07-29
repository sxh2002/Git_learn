import java.util.Arrays;

public class selectSort {
    public static void selectSort(int[] numbers){
        int size = numbers.length;
        int temp;
        int k;
        for(int i=0;i<size-1;i++){
            k=i;
            for(int j=i;j<size-1;j++){
                if(numbers[j]>numbers[j+1]){
                    k=j+1;
                }
            }
            temp=numbers[i];
            numbers[i]=numbers[k];
            numbers[k]=temp;
        }
        System.out.println("选择排序后："+ Arrays.toString(numbers));
    }
}
