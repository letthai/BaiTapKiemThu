package org.example;


import org.junit.Assert;
import org.junit.Test;

//phuong phap tuong dương manh
public class SumScoreTestTD {

    SumScore sumScore = new SumScore();
    @Test
    public void Test_01 () {
        final String expected = "Khong do";
        final String actual = sumScore.score(21.25, 5);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_02 () {
        final String expected = "Tin";
        final String actual = sumScore.score(25.75, 4);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_03 () {
        final String expected = "Toan 2";
        final String actual = sumScore.score(31.5, 6.5);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_04 () {
        final String expected = "Khong do";
        final String actual = sumScore.score(19.75, 8);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_05 () {
        final String expected = "Tin";
        final String actual = sumScore.score(24, 6.75);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_06 () {
        final String expected = "Toan 1";
        final String actual = sumScore.score(28.25, 7);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}
