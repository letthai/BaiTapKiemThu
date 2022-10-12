package org.example;

import org.junit.Assert;
import org.junit.Test;

//kiem thu bang kiem thu bang
public class SumScoreB {
    SumScore score = new SumScore();

    @Test
    public void Testcase_01() {
        final String expected = "Toan 1";
        final String actual = score.score(30.5, 8);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_02() {
        final String expected = "Tin";
        final String actual = score.score(24.25, 7);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_03() {
        final String expected = "Khong do";
        final String actual = score.score(23, 7);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_04() {
        final String expected = "Khong hop le";
        final String actual = score.score(42, 8);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_05() {
        final String expected = "Toan 2";
        final String actual = score.score(28, 5);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_06() {
        final String expected = "Tin";
        final String actual = score.score(24.25, 4);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_07() {
        final String expected = "Khong do";
        final String actual = score.score(21.25,2);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Testcase_08() {
        final String expected = "Khong hop le";
        final String actual = score.score(43, 6.75);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

}
