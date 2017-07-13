/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import paintcostestimator.PaintCostEstimator;

/**
 *
 * @author MANOJ
 */
public class JUnitTest {
    PaintCostEstimator test;
    public JUnitTest() {
    }
    
   
    @Before
    public void setUp() {
        test=new PaintCostEstimator();
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void testNo_of_rooms() {
         test.No_of_rooms=4;
         assertEquals(4, test.NoOfRooms());
     }
}
