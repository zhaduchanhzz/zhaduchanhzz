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
public class Knights1Test {
    
    public Knights1Test() {
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
        Knights1.main(arg);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSolveProblem() {
        System.out.println("solveProblem");
        int input = 0;
        int[][] expResult = null;
        int[][] result = Knights1.solveProblem(input);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDisplay() {
        System.out.println("display");
        Knights1.display();
        fail("The test case is a prototype.");
    }
    
}
