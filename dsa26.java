package java_with_dsa;
// check if a number is prime or not
public class dsa26 {
    public static boolean pime(int n){
        boolean isprime=true;
        for (int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
            }
            break;
        }
        return isprime;
    }
    public static void main(String args[]){
        System.out.println(pime(4));

    }
    
}
