import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // Conditional Statements
        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
        //Switch statements
        switch(a){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:
                System.out.println("Invalid");
            
        }
        //For loop

           for(int i=1;i<=a;i++){
            System.out.println(i+" ");

           }
           //while loop
           while(a!=0){
            System.out.println(a+" ");
            a--;
           }
            int j=1;
        //Do while loop
         do{
            System.out.println(j);
            j++;
         }while(j<=5);


    }
    
}