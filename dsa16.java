package java_with_dsa;
import java.util.*;
// function return typr is String
public class dsa16 {
    public static String fullname(){
        Scanner sc=new Scanner(System.in);
        String f_name=sc.nextLine();
        String l_name=sc.nextLine();
        String full_name=f_name +" "+l_name; 

        return full_name;
    }
    public static void main(String args[]){
        System.out.println(fullname());

    }
    
}
