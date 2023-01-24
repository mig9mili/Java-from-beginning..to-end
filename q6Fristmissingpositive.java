public class q6Fristmissingpositive {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            int crt=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[crt]){
                swap(arr,i,crt);
            }
            else{
                i++;
            }

        }
        //searching for missing index
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;}

    }

