import java.util.*;

public class LinearSearch {
    public static void main(String args[]){
        int[] a= {1,4,5,6,8,9,34,6,78,2,0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(key== a[i]){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Found key");
        }
        else{
            System.out.println("Key not found");
        }
        sc.close();
    }
}
