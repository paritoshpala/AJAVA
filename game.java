import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        
        Random rd =new Random();
         int y=rd.nextInt(1,100);
         System.out.println("Guess Number is: "+y);
        
       
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Your Number: ");
            int x=sc.nextInt();
            while(true){
            if(x==y){
            System.out.println("number is "+x);  
            break;        
          }
          else {
            if(x>y){
                System.out.println("the entered number is greater guess a smaller one");
                x=sc.nextInt();

            }
            else{
                System.out.println("the entered number is smaller guess a greater one");
                 x=sc.nextInt();
            }
            
            }
              
          }
        }
    }

