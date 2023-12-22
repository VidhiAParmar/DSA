public class MaxMulSubArray {
    public static int mulOfSubArray(int[] a){
        int curr= a[0];
        int max = a[0];
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<0){
                int temp;
                temp=curr;
                curr=min;
                min=temp;
            }
            curr = Math.max(curr, curr*a[i]);
            min = Math.min(min,min*a[i]);
            max = Math.max(max,curr);
        }
        return max;
    }
    public static void main(String args[]){
        int[] a = {2,-3,2,4};
        int res = mulOfSubArray(a);
        System.out.println(res);
    }
}
