import java.util.Arrays;

//kadane's algorithm
public class q9sub_array {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
       int y= maxSubArray(arr);
        System.out.println(y);

    }
    static int maxSubArray(int[] nums) {
    int sum=0;
    int maxi=nums[0];
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sum>maxi)
        {maxi=sum;}
        if(sum<0)
        {sum=0;}
    }
    return maxi;
    }
}
