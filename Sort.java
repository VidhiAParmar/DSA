import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 35, 89, 7, 834, 23 };
        // bubble(arr);
        // selection(arr);
        insertion(arr);

    }

    static void bubble(int[] a) {
        // time complexity = O(n^2)
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) { // length-i-1 because at every time 1 is sorted in array
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void selection(int[] a) {
        // search for minimum element and swap it to first position..
        //time compexity O(n^2)
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    static void insertion(int[] a) {
        // array divide into two parts 
        // time complexity O(n^2)
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i-1;
            while ( j >=0 && current < a[j]) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        System.out.println(Arrays.toString(a));
    }
}
