import java.util.Arrays;
// Dutch National Flag algorithm
public class q7sortcolors {
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortColors(int[] arr) {
        int low=0;
        int hi=arr.length-1;
        int mid=0;
        int temp;
        while(mid<=hi){
            switch (arr[mid]){
                case 0:{
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[hi];
                    arr[hi]=temp;
                    hi--;
                    break;
                }
            }
        }

    }
}
