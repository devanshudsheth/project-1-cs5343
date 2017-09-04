
import java.util.Scanner;
import java.lang.String;

public class EvaluateTemperature 

{
    public static void main(String[] args) throws Exception
         {
         double Temp = 0;
         Scanner s = new Scanner(System.in);
         System.out.println("Please select Celsius or Fahrenheit. Press C for Celsius and F for Fahrenheit.");
         String TempSelect=s.nextLine();
         if(!TempSelect.equalsIgnoreCase("c") && !TempSelect.equalsIgnoreCase("f"))  //incorrect input case
               {
               System.out.println("Sorry, incorrect input.");
               System.exit(1);                                         //exit at 1 for incorrect input
               }
         System.out.println("Please enter a temperature");        
         int input=s.nextInt();
         if(TempSelect.equalsIgnoreCase("c"))                          //check if celsius using string equalsIgnoreCase method
               {
               Temp = input*1.8+32;
               System.out.println("Converted Fahrenheit Temperature is" + " " + Temp);  //print converted temperature  
               }
         else if(TempSelect.equalsIgnoreCase("f"))                     //check if fahrenheit using equalsIgnoreCase method
               {
               Temp = input;
               }
         if(Temp<=0)                                                   //check various cases for the temperature and print accordingly
               {
               System.out.println("extremely cold");
               }
         else if (Temp<=32)  
               {
               System.out.println("very cold");
               }
         else if (Temp<=50)  
               {
               System.out.println("cold");
               }
         else if (Temp<=70)  
               {
               System.out.println("mild");
               }
         else if (Temp<=90)  
               {
               System.out.println("warm");
               }
         else if (Temp<=100)  
               {
               System.out.println("hot");
               }
         else if (Temp>100)  
               {
               System.out.println("very hot");
               }
         else
               {
               System.out.println("Invalid Entry");
               }
           
        }
    
}
