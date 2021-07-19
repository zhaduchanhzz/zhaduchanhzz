/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhaduchanh
 */
public class Knights2Test {
    
    public Knights2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] arg = null;
        Knights2.main(arg);
    }

    @Test
    public void testSolveProblem() {
        System.out.println("solveProblem");
        int input = 0;
        int[][] expResult = null;
        int[][] result = Knights2.solveProblem(input);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testDisplay() {
        System.out.println("display");
        int[][] matrix = null;
        int n = 0;
        Knights2.display(matrix, n);
    }
       @Test
    public void testSolveProblemOutofRange() {
        System.out.println("solveProblem");
        int input = 9*10^24;
        int[][] expResult = null;
        int[][] result = Knights2.solveProblem(input);
        assertArrayEquals(expResult, result);
    }
       @Test
    public void testSolveProblemNegative() {
        System.out.println("solveProblem");
        int input = -99999999;
        int[][] expResult = null;
        int[][] result = Knights2.solveProblem(input);
        assertArrayEquals(expResult, result);
    }
    
}
