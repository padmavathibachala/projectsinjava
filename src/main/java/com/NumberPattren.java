package com;

public class NumberPattren {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i%3==0)
                    break;
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}