package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {   
        Scanner s =  new Scanner(System.in);
        int SALESPEOPLE = 0;
        System.out.println("Enter the number of salespeople : ");
        SALESPEOPLE= s.nextInt();

        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int max=0;
        int max_indx=0;
        int min=Integer.MAX_VALUE;

        int min_indx=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[i]>max){
                max=sales[i];max_indx=i;
            };
            if(sales[i]<min){
                min=sales[i];min_indx=i;
            };
        }
        System.out.println("\nTotal sales: " + sum);

        //average sale
        System.out.println("====Average Sale====");
        System.out.println((double)sum/SALESPEOPLE);

        //maximum sale
        System.out.println("Salesperson "+(max_indx+1)+" had the highest sale with $"+max+".");

        //minimum sale
        System.out.println("Salesperson "+(min_indx+1)+" had the lowest sale with $"+min+".");

        //4
        Scanner newScan = new Scanner(System.in);
        double value=0.0;
        System.out.println("Enter a value:");
        value=newScan.nextInt();
        int exceeded=0;
        for(int i=0;i<sales.length;i++){
            if(sales[i]>value){
                exceeded+=1;
                System.out.println("Salesperson "+(i+1)+" has more sales than $"+value+".");
            }
        }
        System.out.println("Total of salespersons that have sales more than $"+value+" is "+exceeded+"");

    }
}