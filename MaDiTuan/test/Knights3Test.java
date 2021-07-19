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
public class Knights3Test {
    
    public Knights3Test() {
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
        String[] args = null;
        Knights3.main(args);
        fail("The test case is a prototype.");
    }

 
    @Test
    public void testSolveProblem() {
        System.out.println("solveProblem");
        int input = 0;
        int[][] expResult = null;
        int[][] result = Knights3.solveProblem(input);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }


    @Test
    public void testDisplay() {
        System.out.println("display");
        Knights3.display();
        fail("The test case is a prototype.");
    }
    
}
