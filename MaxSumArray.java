public class MaxSumArray {
    public static void main(String args[]){
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        int currentSum = a[0];
        int maxSum = a[0];
        for(int i=1;i<a.length;i++){
           currentSum = Math.max(a[i],currentSum + a[i]);
           maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println(maxSum);
    }
}
