import java.util.Scanner;

public class prog3 {
    public static void main(String[] args)
    {
        int income;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter income: " );
        income = input.nextInt();
        double tax=0;
        if(income<=50000)
            tax=0;
        else if(income<=100000)
            tax = (income-50000)*10/100;
        else if(income<=250000)
            tax = (income-100000)*20/100+5000;
        else
            tax = (income-250000)*30/100+5000+30000;
        
        System.out.println("income: "+income+" tax: "+tax);
        input.close();
    }
}
