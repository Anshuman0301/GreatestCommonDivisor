package JavaCodes;

import java.util.Scanner;

public class GreatestCommonDivisor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:-");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int gcd=1;

        if(x==0 || y==0)
        {
            System.out.println("Enter the number greater the 0");
        }
        else {

            for (int i = 1; i <= x && i <= y; i++) {
                if (x % i == 0 && y % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("GCD of two given numbers is " + gcd);
        }
    }
}
