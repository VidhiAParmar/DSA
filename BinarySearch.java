import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        int[] a = {0,1,2,3,4,5,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        System.out.print(search(a,key));
        sc.close();

    }
    static int search(int[] a, int key){
        int l = 0;
        int h = a.length - 1;
        while(l <= h){
            int mid = l + (h-l)/2;
            if(key < a[mid]){
                h = mid -1;
            }
            else if(key > a[mid]){
                l = mid +1;
            }
            else{
                return mid;
            }
        } 
        return -1;       
        
    }
}
