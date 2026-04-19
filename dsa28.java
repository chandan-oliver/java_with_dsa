package java_with_dsa;
// binary to decimal
public class dsa28 {
    public static void bintodec(int binnum){
        int pow=0;
        int mynum=binnum;
        int decnum=0;
        while(binnum>0){
            int lastd=binnum%10;
            decnum=decnum+(lastd*(int) Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        
        }
        System.out.println(mynum  + " --> " + decnum );
    }
    public static void main (String args[]){
        bintodec(101);

    }
    
}
