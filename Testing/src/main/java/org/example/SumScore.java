package org.example;

import java.util.Scanner;

public class SumScore {
    public String score(double sum, double m) {
        /*Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double l = sc.nextDouble();
        double e = sc.nextDouble();*/
        if(m < 0 || sum < 0) {
            return ("Khong hop le");
        }
        else if(27.5 <= sum && sum <= 40) {
            if(m > 6.75) {
                return ("Toan 1");
            }
            return ("Toan 2");
        }
        else if(23.25 <= sum && sum < 27.5) {
            return ("Tin");
        }
        else if(0 <= sum && sum < 23.25) {
            return ("Khong do");
        }
        else return ("Khong hop le");
    }
}