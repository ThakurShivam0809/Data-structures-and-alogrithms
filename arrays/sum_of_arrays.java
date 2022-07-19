import java.util.*;
public class sum_of_arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();        }
        int max = (m>n?m:n);
        int[] sum = new int[max] ;
        int c = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length -1;
        while(k>=0){
            int d = c;
            if(i >= 0){
                d += arr1[i]; 
            }
            if(j >= 0){
                d += arr2[j]; 
            }
            c = d/10;
            d = d%10;
            sum[k] = d;
            i--;
            j--;
            k--;
        } 
        System.out.println(" ");
        if (c>0){
            System.out.println(c);
        }
        for(int v : sum){
            System.out.println(v);
        }   
    }
}
