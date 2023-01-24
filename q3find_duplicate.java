
import java.util.Arrays;

public class q3find_duplicate {
    public static void main(String[] args) {
    int[] arr={2,3,2,1};
    int y=findDuplicate(arr);
    System.out.println(Arrays.toString(arr));//sorted array will not be there
    System.out.println(y);
    }
    static int findDuplicate(int[] arr) {
        int i = 0;

        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int crt = arr[i] - 1;
                if (arr[i] != arr[crt]) {
                    swap(arr, i, crt);
                } else {
                    return arr[i];

                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;}

}




