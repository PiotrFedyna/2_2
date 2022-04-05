package com.company;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int w=5,i;
        for (i=1;i<=w;i++){
            for (int y=5;y>=i;y--)System.out.print(" ");

            for (int x=0;x<i;x++)
            {
                System.out.print("*");

            }
            System.out.println(" ");


        }
    }
}
