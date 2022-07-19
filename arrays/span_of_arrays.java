import java.util.*;
public class span_of_arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int j = 0; j<arr.length;j++ ){
            if(max< arr[j]){
                max = arr[j];
            }
            if (min> arr[j]){
                min = arr[j];
            }
        }
        System.out.println(max - min);

        //This is the shorter method 
        //Arrays.sort(arr);
        // System.out.println(arr[n-1]- arr[0]);
        
    }
}
