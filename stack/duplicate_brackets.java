import java.util.*;

public class duplicate_brackets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i = 0; i< n.length(); i++){
            char c = n.charAt(i);
            if( c == ')' ){
                if(st.peek() == '('){
                    System.out.println("True");
                    return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
        System.out.println("False");

    
}}
