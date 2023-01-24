import java.util.Arrays;

public class q1missingnumber {


    public static void main(String[] args) {
        int[] arr={3,1,0};
        int y=missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(y);
    }
    static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int crt=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[crt]){
                swap(arr,i,crt);
            }
            else{
                i++;
            }

        }
        //searching for missing index
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;}
}