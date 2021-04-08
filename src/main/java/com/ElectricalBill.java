package com;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class ElectricalBill {
    public static DecimalFormat df=new DecimalFormat("0.00");
    public static void main(String[] args) {
        System.out.println("Enter the previous reading:");
        System.out.println("Enter the current reading:");
        Scanner scanner=new Scanner(System.in);
        int previous=scanner.nextInt();
        int current=scanner.nextInt();
        int userConsumed=current-previous;
        double cost;
        double great;
        if(userConsumed>30 &  userConsumed<70){
            cost=(30*2.3)+((userConsumed-30)*2.3);
            System.out.println("Bill amount is:"+" "+df.format(cost));
        }
         else if(userConsumed>70 &  userConsumed<100){
            cost=(30*2.3)+(userConsumed-30)*3.5;
            System.out.println("Bill amount is:"+" "+df.format(cost));
        }
         else if (userConsumed>100){
            great =(30*2.3)+(70*3.5);
            cost=great+((userConsumed-100)*4.6);
            System.out.println("Bill amount is:"+" "+df.format(cost));
        }
         else {
            System.out.println("invalied");
        }
    }
}
