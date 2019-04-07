package epam_week3;
import java.util.*;
class RodCuttingProblem {
    public static void special(int length){
        int count=-1,flag=0,digit;
        if(length==1||length==2)
             System.out.println("0");
            else{
                while(length!=1){
                    digit=length%2;
                    count++;
                    if(flag==0&&digit==0)
                       flag=1;
                    length=length/2;
                }
                if(flag==0)
                 count=count+1;
                System.out.println(count);
                count=-1;
                flag=0;
            }
    }
    public static void main(String args[] ) throws Exception {
        int test_cases,length;
        Scanner sc=new Scanner(System.in);
        test_cases=sc.nextInt();
        for(int i=0;i<test_cases;i++){
            length=sc.nextInt();
            special(length);
        }
        sc.close();
    }
}