import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("enter 4 number");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target value");
        int target= sc.nextInt();
        int n=0,m=0;
        boolean f = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    n=i;
                    m=j;
                    f = true;
                    break;
                }
            }
        }
        if(f){
            System.out.println(n + " "+ m);
        }
        else{
            System.out.println("sum not found");
        }
        sc.close();


    }
}
