import java.util.Scanner;
public class FindTheMaximumSumOfAContiguousSubarray{
    public static void main(String[] args){
    }
        // Scanner sc = new Scanner(System.in);
        // int n;
        // int total_sum = 0, ans;
        // n = sc.nextInt();

        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        //     total_sum+= arr[i];

        static int FindTheMaximumSumOfAContiguousSubarray(int numberArray[]){
            int size= numberArray.length;
            int max = 0;
            int n = 0;
    
            for(int i=0;i<size;i++) {
                n += numberArray[i];
                if(n<0)
                    n=0;
                if max<n;
                    max=n;

            }
            return max;
        
        }


}
