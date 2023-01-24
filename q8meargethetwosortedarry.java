import java.util.Arrays;
public class q8meargethetwosortedarry {

    public static void main(String[] args){
        int[] X = { 1, 4, 7, 8, 10 };
        int[] Y = { 2, 3, 9 };

        merge(X, Y);

        System.out.println("X: " + Arrays.toString(X));
        System.out.println("Y: " + Arrays.toString(Y));
    }
    static void merge(int[] x,int[] y){

        int m=x.length;
        int n=y.length;
       // already in the correct order; otherwise, swap it with the next smaller
        for(int i=0;i<m;i++){
            // compare the current element of `X[]` with the first element of `Y[]`
            if(x[i]>y[0]) {
                //swap
                int temp = x[i];
                 x[i]=y[0];
                y[0] = temp;

                // move `Y[0]` to its correct position to maintain the sorted
                // order of `Y[]`. Note: `Y[1…n-1]` is already sorted
                int first = y[0];
                int k=0;
                for(k=1;k<n&&y[k]<first;k++){
                    y[k-1]=y[k];
                }
                y[k-1]=first;
            }


        }
    }

}
