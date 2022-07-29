import java.util.Arrays;

public class shellSort {
    public static void shellSort(int[]numbers){
        int n = numbers.length;
        int j;
        for(int gap = n/2;gap>=1;gap/=2){
            for(int i = gap;i<n;i++){
                int insert = numbers[i];
                for (j = i;j>=gap && numbers[j-gap]>insert;j-=gap){
                    numbers[j]=numbers[j-gap];
                }
                numbers[j]=insert;
            }
        }
        System.out.println("shellSort:"+ Arrays.toString(numbers));
    }
}
