import java.util.*;
public class find_element_in_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length;i++ ){
            arr[i] = sc.nextInt();
        }
        int com = sc.nextInt();
        int res = -1;
        for(int i = 0; i< arr.length; i++){
            if(com == arr[i]){
                res = i;
                break;
            }
        
        }
        System.out.println(res);
       
            
    }
    
}
