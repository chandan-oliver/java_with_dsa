package java_with_dsa;
// bionomial coefficent
public class dsa23 {
    public static int fact(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
            

        }
        return f;
    }
    public static int binocoff(int n,int r){
        int fun=fact(n);
        int fur=fact(r);
        int fun_r=fact(n-r);
        int binom=fun/(fur*fun_r);
        return binom;

    }
    public static void main(String args[]){
        System.out.println(binocoff(5,2));
     

    }
    
}
