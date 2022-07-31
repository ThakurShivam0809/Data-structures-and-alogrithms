import java.util.*;
public class difference_of_arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        int[] diff = new int[n1];
        int l = arr1.length - 1;
        int m = arr2.length - 1;
        int d = 0;
        while(l>= 0){
            if(arr2[m] >= arr1[l]){
                d = arr2[m] - arr1[l];
            }
            else{
                d = arr2[m]+ 10 - arr1[l];
                arr2[m-1] = arr2[m-1] - 1;
            }
            diff[l] = d;
            m--;
            l--;
        }
        
        if(arr2[m]!= 0){
            System.out.print(arr2[l]);
        }
        for(int val : diff){
            System.out.print(val);
        }
}}
