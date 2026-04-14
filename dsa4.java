package java_with_dsa;

public class dsa4 {
    public static void main(String args[]){
        int salary=6000000;
        int tax=0;
        if(salary<500000){
            tax=(int)salary;
            
        }
        else if ( salary >500000 & salary <=1000000){
            tax=(int) ( salary*0.1);
        }
        else{
            tax=(int)(salary*0.2);
        }
        System.out.println( "your tax is " + tax);
    }
    
}
