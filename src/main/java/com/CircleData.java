package com;
import java.util.Scanner;

public class CircleData {
    public static void main(String[] args) {
        System.out.println("Enter the Radius");
        System.out.println("Enter Output Required:DIA,AR,PER,ARSEM");
        Scanner scanner=new Scanner(System.in);
        float radius=scanner.nextFloat();
        String output=scanner.next();
        float dia;
        double area;
        double per;
        double arsem;


        switch (output){
            case "DIA":
              dia=2*radius;
              System.out.println("Diameter of circle is "+dia);
              break;
            case "AR":
               area=Math.PI*radius*radius;
               System.out.println("Area of circle is "+area);
               break;
            case "PER":
                per=2*radius*Math.PI;
                System.out.println("perimeter of circle is "+per);
                break;
            case "ARSEM":
                arsem=Math.PI*radius;
                System.out.println("Area  of semi circle is "+arsem);
                break;
            default:
                System.out.println("invalied output");
                break;


        }

    }
}
