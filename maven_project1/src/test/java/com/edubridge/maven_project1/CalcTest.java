package com.edubridge.maven_project1;
//import com.edubridge.maven_project.Calc;
import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.Test;

import com.edubridge.maven_project.Calc;


public class CalcTest {
@Test
public void testFindSquare() {
Calc c = new Calc();
int actual = c.findSquare(10); 
int expected = 100;

Assertions.assertEquals(expected, actual);

}
@Test
public void testFindCube() {
Calc c = new Calc();
int actual = c.findCube(10); 
int expected = 1000;

Assertions.assertEquals(expected, actual);

}
}
