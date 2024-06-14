/*
You are given an array of prices where prices[i] is the price of a
given stock on an ith day.
You want to maximize your profit by choosing a single day to buy
one stock and choosing a different day in the future to sell that
stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0
Input: prices = [9,2,5,3,1,4]
Output: 3
Explanation: Buy on day 5 (price = 1) and sell on day 6 (price = 4),
profit = 4-1 = 3.
*/
public class buySell {
   public static void main(String args[]){
        int[] arr = {9,2,5,3,1,4};
        int min=0,max=0, index=0;
        for(int i=0;i<arr.length;i++){
            min=arr[i];
            for(int j=0;j<arr.length;j++){
                if(min >= arr[j]){
                    index= j;
                    min = arr[j];
                }
            }
            max=arr[i];
            for(int j=index;j<arr.length;j++){
                if(max <= arr[j]){
                    max = arr[j];
                }
            }
            
        }
        System.out.println("max: "+ max + " min: "+ min);
        System.out.println("profit: "+(max-min));
        
   } 
}
