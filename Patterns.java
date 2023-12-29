public class Patterns {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        } 
        System.out.println();
    }
    static void pattern3(int n){
         for (int i = n; i >0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }   
    }
    static void pattern5(int n){
        for (int i = 0; i < 2*n; i++) {
            int c =  i >n ? 2*n -i : i;
            for (int j = 0; j < c; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern6(int n){
         for (int i = 0; i < 2*n; i++) {
            int c =  i >n ? 2*n -i : i;
            int space = n - c;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < c; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {

            for (int space = 0; space < n-i; space++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
             for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern8(int n){
        for (int i = 1; i <= 2*n; i++) {
            int c =  i >n ? 2*n -i : i;

            for (int space = 0; space < n-i; space++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j+" ");
            }
             for (int j = 2; j <= c; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
