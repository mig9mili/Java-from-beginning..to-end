import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args){

        int[] arr={5,3,2,4,1,6};
        insertionsorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void insertionsorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[i]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }

        }
    }
    static void swap(int[] arr,int fri,int sec){
        int temp=arr[fri];
        arr[fri]=arr[sec];
        arr[sec]=temp;
    }

}
