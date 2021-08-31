/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        final double CF = 0.09290304;
        System.out.printf("What is the length of the room in feet? ");
        String cas = sc.nextLine();
        System.out.printf("What is the width of the room in feet? ");
        String ras = sc.nextLine();
        int l = Integer.parseInt(cas);
        int w = Integer.parseInt(ras);
        int a = l * w;
        double m = CF * a;
        System.out.printf("You entered dimensions of %d by %d.\nThe area is\n%d square feet\n%.3f square meters", l, w, a, m);
    }
}