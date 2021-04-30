import java.util.Scanner;
class program1{
    static double angle(int hour, int min)
    {
        double min_angle = 360.0*min/60.0;
        double hour_angle = 360.0*hour/12.0 + 30*min/60.0;
        double ans;
        if(hour_angle>min_angle)
            ans = hour_angle - min_angle;
        else
            ans = min_angle - hour_angle;
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int min = input.nextInt();
        System.out.println(angle(hour, min));
        input.close();
    }
}
