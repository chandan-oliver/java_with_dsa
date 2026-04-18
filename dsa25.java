package java_with_dsa;
// function overloading
public class dsa25 {
    public static int add(int a,int b){
        return a+b;
    }

    public static float add(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(add(2,3));
        System.out.println(add(2.3f,3.2f));

    }
    
}
