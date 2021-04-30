import java.util.Scanner;
public class program2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int rem = a;
        int q = 0;
        while(rem>=b)
        {
            rem = rem-b;
            q += 1;
        }
        System.out.println("Quotient: "+q+" Remainder: "+rem);
        input.close();
    }
}
