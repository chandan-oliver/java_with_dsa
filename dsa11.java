package java_with_dsa;
// reverse anumber
public class dsa11 {
    public static void main(String args[]){
        int num=10899;
        while(num>0){
            int lastnum=num%10;
            System.out.println(lastnum);
            num=num/10;
        }
    }
    
}
