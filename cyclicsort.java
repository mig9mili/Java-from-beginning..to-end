
import java.util.Arrays;
public class cyclicsort {

 // when question  given number is 1 till N then use cyclicsort
    public static void main(String[] args){
           int[] arr={2,1,3,4,5};
              sort(arr);
            System.out.println(Arrays.toString(arr));


    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int crt=arr[i]-1;
            if(arr[i]!=arr[crt]){
                swap(arr,i,crt);
            }
            else{
                i++;
            }

        }
    }

    static void swap(int[] arr,int first,int sec){
    int temp=arr[first];
    arr[first]=arr[sec];
    arr[sec]=temp;}

}
