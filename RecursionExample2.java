public class RecursionExample2 {

    public static void printPermutations(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+ str.substring(i+1);
            printPermutations(newStr, permutation+curr);
        }
    }

    public static int coutPath(int i,int j,int n,int m){
        if(i==n || j == m){
            return 0;
        }
        if( i== n-1 && j==m-1){
            return 1;
        }
        //move down
        int down = coutPath(i+1, j, n, m);

        int right = coutPath(i, j+1, n, m);

        return down+right;
    }

    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
        int way1 = callGuests(n-1);

        int way2 =(n-1) * callGuests(n-2);

        return way1+way2;
    }
    public static void main(String[] args) {
        printPermutations("abc", "");
        System.out.println(coutPath(0, 0, 3, 3));
        System.out.println(callGuests(4));
    }
}
