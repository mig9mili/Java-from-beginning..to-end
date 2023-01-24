public class q5set_mismatch {

    public int[] findErrorNums(int[] arr) {
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
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return new int[] {arr[index],index+1};
            }
        }
        return new int[] {-1,-1};

    }
    static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;}
}
