import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RecursionExample {
public static   int first =-1;
public static int last = -1;
    static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int a = n * factorial(n - 1);
        return a;
    }

    static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        n--;
        fibonacci(b, c, n);
    }

    static int calcPower(int x, int n) { // for stack height n
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }
    public static void firstLastOccurance(String str, int idx, char element){
      
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        firstLastOccurance(str, idx+1, element);
    }
    public static boolean isSorted(int[] a, int idx){
        if(idx == a.length-1){
            return true;
        }
        if(a[idx] < a[idx+1]){
            return isSorted(a, idx+1);
        }else{
            return false;
        }
    }
    public static void moveAllX(String str, int idx, int count, String newStr){
        if(idx == str.length()){
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == 'x'){
            count++;
            moveAllX(str, idx+1, count, newStr);
        }
        else{
            newStr += curr;
            moveAllX(str, idx+1, count, newStr);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicatesRecursive(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);
        if(map[curr - 'a']){
            removeDuplicatesRecursive(str, idx+1, newStr);
        }else{
            newStr+= curr;
            map[curr -'a'] = true;
            removeDuplicatesRecursive(str, idx+1, newStr);
        }
    }
    public static void removeDuplicates(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("");
            return;
        }
    
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (newStr.indexOf(c) == -1) { // indexOf returns -1 if the character is not found
                newStr += c;
            }
        }
        System.out.println(newStr);
    }

    public static void subSequences(String str, int idx , String newStr){

        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        //to be add
        subSequences(str, idx+1, newStr+currChar);
        //or to be not add
        subSequences(str, idx+1, newStr);
    }
    public static void subSequencesUnique(String str, int idx , String newStr, HashSet<String> set){

        if(idx == str.length()){
            if (set.contains(newStr)) {
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
            
        }
        char currChar = str.charAt(idx);

        //to be add
        subSequencesUnique(str, idx+1, newStr+currChar,set);
        //or to be not add
        subSequencesUnique(str, idx+1, newStr,set);
    }

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void printCombination(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char curr = str.charAt(idx);
        String mapping = keypad[curr - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx+1, combination+mapping.charAt(i));
            
        }
    }
    public static void subSequences(Integer[] arr, int idx , Integer[] newArr, HashSet<Integer[]> set){

        if(idx == arr.length){
            if (set.contains(newArr)) {
                return;
            }else{
                set.add(newArr);
                return;
            }
            
        }

        //to be add
        Integer[] newArrWithCurrChar = Arrays.copyOf(newArr, newArr.length + 1);
        newArrWithCurrChar[newArrWithCurrChar.length - 1] = arr[idx];
        subSequences(arr, idx + 1, newArrWithCurrChar, set);
        //or to be not add
        subSequences(arr, idx+1, newArr,set);
    }

    public static void main(String[] args) {
        printSum(0, 5, 0);
        int a = factorial(4);
        System.out.println(a);
        int b = 0, c=1;
        int n=7;
        System.out.println(b);
        System.out.println(c);
        fibonacci(b, c, n-2);
        System.out.println(calcPower(2, 10));
        String str = "aabcdaeagaw";
        firstLastOccurance(str, 0, 'a');
        int[] arr = {1,2,3,3,5};
        System.out.println(isSorted(arr, 0));
        moveAllX("axbxc", 0, 0, "");
        removeDuplicatesRecursive("abcad", 0, "");
        removeDuplicates("abcad");
        subSequences("abc", 0, "");
        HashSet<String> set = new HashSet<>();
        subSequencesUnique("1-24-51", 0,"", set);
        System.out.println("print hashset");
        for (String number : set) {
            System.out.println(number);
        }
        printCombination("23", 0, "");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashSet<Integer[]> set = new HashSet<>();
        
        for (Integer[] integers : set) {
            System.out.println(Arrays.toString(integers));
        }
        sc.close();
    }
}
