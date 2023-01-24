import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class q2find_all_number_disappeared_in_array {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer>  y=findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(y);



    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
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
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(j+1);
            }

        }
        return ans;
    }
    static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;}
}

