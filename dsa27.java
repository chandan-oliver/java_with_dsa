package java_with_dsa;
// prime no in range
public class dsa27 {
    public static boolean prime(int n){
        boolean isprime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
            }
            
        }
        return isprime;
    }

    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.println(i +" ");

            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeinrange(10);

    }
    
}
