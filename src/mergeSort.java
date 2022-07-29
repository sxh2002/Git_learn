public class mergeSort {
    public static void mergeSort(int[]numbers){
        mergeSort(numbers,0,numbers.length-1);
    }
    public static void mergeSort(int[]numbers,int start,int end){
        if(start<end){
            int middle = (start+end)/2;
            mergeSort(numbers,start,middle);
            mergeSort(numbers,middle+1,end);
            merge(numbers,start,middle,end);
        }
    }
    private static void merge(int[] numbers,int start,int middle,int end){
        int len = numbers.length;
        int[] temp = new int[len];
        int i = start;
        int j = middle+1;
        int k = start;
        while(i<=middle&&j<=end){
            if(numbers[i]<numbers[j]){
                temp[k++]=numbers[i++];
            }else{
                temp[k++]=numbers[j++];
            }
        }
        while(i<=middle){
            temp[k++]=numbers[i++];
        }
        while(j<=end){
            temp[k++]=numbers[j++];
        }
        for(int m = start;m<=end;m++){
            numbers[m]=temp[m];
        }

    }
}
