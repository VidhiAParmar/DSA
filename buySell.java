
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
