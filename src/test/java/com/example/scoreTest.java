package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for getting letterGrade.
 */
public class scoreTest 
{
    @Test
    public void partitionTest1()
    {
      char grade = score.letterGrade(-5);
      System.out.println("{<0, <-5, X>}");
      assertEquals(grade, 'X');
    }

    @Test
    public void partitionTest2()
    {
      char grade = score.letterGrade(35);
      System.out.println("{0~59, <35, F>}");
      assertEquals(grade, 'F');
    }

    @Test
    public void partitionTest3()
    {
      char grade = score.letterGrade(65);
      System.out.println("{60~69, <65, D>}");
      assertEquals(grade, 'D');
    }

    @Test
    public void partitionTest4()
    {
      char grade = score.letterGrade(75);
      System.out.println("{70~79, <75, C>}");
      assertEquals(grade, 'C');
    }

    @Test
    public void partitionTest5()
    {
      char grade = score.letterGrade(85);
      System.out.println("{80~89, <85, B>}");
      assertEquals(grade, 'B');
    }

    @Test
    public void partitionTest6()
    {
      char grade = score.letterGrade(95);
      System.out.println("{90~100, <95, A>}");
      assertEquals(grade, 'A');
    }

    @Test
    public void partitionTest7()
    {
      char grade = score.letterGrade(105);
      System.out.println("{>100, <105, X>}");
      assertEquals(grade, 'X');
    }

    @Test
    public void boundaryTests()
    {
        char grade = score.letterGrade(-2);
        System.out.println("{-1, <-2, X>}");
        assertEquals(grade, 'X');

        grade = score.letterGrade(-1);
        System.out.println("{-1, <-1, X>}");
        assertEquals(grade, 'X');

        grade = score.letterGrade(0);
        System.out.println("{0, <0, F>}");
        assertEquals(grade, 'F');

        grade = score.letterGrade(1);
        System.out.println("{0, <1, F>}");
        assertEquals(grade, 'F');

        grade = score.letterGrade(58);
        System.out.println("{59, <58, F>}");
        assertEquals(grade, 'F');

        grade = score.letterGrade(59);
        System.out.println("{59, <59, F>}");
        assertEquals(grade, 'F');

        grade = score.letterGrade(60);
        System.out.println("{60, <60, D>}");
        assertEquals(grade, 'D');

        grade = score.letterGrade(61);
        System.out.println("{60, <61, D>}");
        assertEquals(grade, 'D');

        grade = score.letterGrade(68);
        System.out.println("{69, <68, D>}");
        assertEquals(grade, 'D');

        grade = score.letterGrade(69);
        System.out.println("{69, <69, D>}");
        assertEquals(grade, 'D');

        grade = score.letterGrade(70);
        System.out.println("{70, <70, C>}");
        assertEquals(grade, 'C');

        grade = score.letterGrade(71);
        System.out.println("{70, <71, C>}");
        assertEquals(grade, 'C');

        grade = score.letterGrade(78);
        System.out.println("{79, <78, C>}");
        assertEquals(grade, 'C');

        grade = score.letterGrade(79);
        System.out.println("{79, <79, C>}");
        assertEquals(grade, 'C');

        grade = score.letterGrade(80);
        System.out.println("{80, <80, B>}");
        assertEquals(grade, 'B');

        grade = score.letterGrade(81);
        System.out.println("{80, <81, B>}");
        assertEquals(grade, 'B');

        grade = score.letterGrade(88);
        System.out.println("{89, <88, B>}");
        assertEquals(grade, 'B');

        grade = score.letterGrade(89);
        System.out.println("{89, <89, B>}");
        assertEquals(grade, 'B');

        grade = score.letterGrade(90);
        System.out.println("{90, <90, A>}");
        assertEquals(grade, 'A');

        grade = score.letterGrade(91);
        System.out.println("{90, <91, A>}");
        assertEquals(grade, 'A');

        grade = score.letterGrade(99);
        System.out.println("{100, <99, A>}");
        assertEquals(grade, 'A');

        grade = score.letterGrade(100);
        System.out.println("{100, <100, A>}");
        assertEquals(grade, 'A');

        grade = score.letterGrade(101);
        System.out.println("{101, <101, X>}");
        assertEquals(grade, 'X');

        grade = score.letterGrade(102);
        System.out.println("{101, <102, X>}");
        assertEquals(grade, 'X');
    }
}
