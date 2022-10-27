package org.example;

import java.util.Scanner;

public class SumScore {
    public String score(double sum, double m) {
        String z;
        if(m < 0 || sum < 0) {
            z = "Khong hop le";
        }
        else if(27.5 <= sum && sum <= 40) {
            if(m > 6.75) {
                z = "Toan 1";
            }
            z = "Toan 2";
        }
        else if(23.25 <= sum && sum < 27.5) {
            z = "Tin";
        }
        else if(0 <= sum && sum < 23.25) {
           z = "Khong do";
        }
        else z = "Khong hop le";
        return z;
    }
}