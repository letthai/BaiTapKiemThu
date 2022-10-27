package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SumScoreAllCuse {
    SumScore score = new SumScore();

    @Test
    public void Testcase_01() {
        final String expected = "Khong hop le";
        final String actual = score.score(25, -5);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_02() {
        final String expected = "Toan 2";
        final String actual = score.score(27.75, 5);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Testcase_03() {
        final String expected = "Tin";
        final String actual = score.score(24.75, 7.25);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_04() {
        final String expected = "Khong do";
        final String actual = score.score(19,4.25);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_05() {
        final String expected = "Khong hop le";
        final String actual = score.score(41, 6);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
}
}
