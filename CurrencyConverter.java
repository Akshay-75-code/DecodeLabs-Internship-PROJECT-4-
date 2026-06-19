import java.util.*;
public class CurrencyConverter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String again=" ";

        do { 
         System.out.println("==============================");
         System.out.println("     CURRENCY CONVERTER     ");
         System.out.println("==============================");
         
         System.out.println("Available Currencies:");
         System.out.println("- INR");
         System.out.println("- USD");
         System.out.println("- EUR");
         System.out.println("- GBP");
         System.out.println("- JPY");

         System.out.println("\nEnter Base Currency :");
         String from=sc.next().toUpperCase();
         System.out.println("Enter Target Currency :");
         String to=sc.next().toUpperCase();

         System.out.println("Enter Amount :");
         double amount=sc.nextDouble();

         double inr=0;
         if(from.equals("INR")){
            inr=amount;
         }
         else if(from.equals("USD")){
            inr = amount * 83.5;
         }
         else if(from.equals("EUR")){
            inr=amount*90.0;
         }
         else if(from.equals("GBP")){
            inr=amount*106.0;
         }
         else if(from.equals("JPY")){
            inr=amount*0.58;
         }
         else{
            System.out.println("Invalid Base Currency!!");
            continue;
         }


         double result=0;
         if(to.equals("INR")){
            result=inr;
         }
         else if(to.equals("USD")){
            result=inr/83.5;
         }
         else if(to.equals("EUR")){
            result=inr/90.0;
         }
         else if(to.equals("GBP")){
            result=inr/106.0;
         }
         else if(to.equals("JPY")){
            result=inr/0.58;
         }
         else{
            System.out.println("Invalid Target Currency!!");
            continue;
         }

         System.out.println("----------RESULT----------");
         System.out.println("Amount              : "+amount+" "+ from);
         System.out.printf("Converted Amount : %.2f %s\n", result, to);
         System.out.println("--------------------------");

         System.out.println("Do you want another conversion?(Y/N): ");
         again=sc.next();

        }while(again.equalsIgnoreCase("Y"));  
            System.out.println("Thank you for using Currency Converter!");
            sc.close();
        
    }
}