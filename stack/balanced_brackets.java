import java.util.*;

import javax.xml.transform.Source;


public class balanced_brackets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i = 0; i< n.length(); i++){
            char c = n.charAt(i);
            if(c == '('|| c=='{'|| c=='['){
                st.push(c);
            }
            if(c == '}'){
                boolean val = closebrac(st,'{');
                if (val == false){
                    System.out.println(val);
                    return;
                }}
            else if(c == ']'){
                boolean val = closebrac(st,'[');
                if (val == false){
                    System.out.println(val);
                    return;
                }}
            else if(c == ')'){
                boolean val = closebrac(st,'(');
                if (val == false){
                    System.out.println(val);
                    return;
               }}
            }
        if(st.size() != 0){
            System.out.println("False");    
        }else{
        System.out.println("True");
        }
    }
    
    public static Boolean closebrac(Stack<Character> st, char cl ){
        if(st.size()==0){
            return false;
        } else if( st.peek() !=cl){
            return false;
        }else{
            st.pop();
            return true;
        }
    }}
