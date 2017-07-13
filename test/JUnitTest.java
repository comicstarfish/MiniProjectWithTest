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
        test = new PaintCostEstimator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void NoOfRooms() {                                                      //TO TEST THE FUNCTION SET THE VARIABLE. CANNOT TEST FOR SCANNER I/P
        assertEquals(1, test.NoOfRooms());                                         //LINE 46 IN CLASS FILE        
    }

    @Test
    public void height() {                                                         //TO TEST THE FUNCTION SET THE VARIABLE. CANNOT TEST FOR SCANNER I/P
        assertEquals(8, test.heightInput());                                       //LINE 68 IN CLASS FILE
    }

    @Test
    public void TotalRoomArea(){                                                   //LINE 148 IN CLASS FILE
        assertEquals(1280, test.TotalroomArea(),0.1);
    }
    
    @Test
    public void paintCostEstimate() {
        assertEquals(3200,test.paintCostEstimate(test.TotalroomArea(),test.PremiumPaintCost), 0.1);
    }
    
    @Test
    public void labourCostEstimate(){
        assertEquals(3840,test.labourCostEstimate(test.TotalroomArea()),0.1);
    }
    
    @Test
    public void totalCostEstimate(){
        assertEquals(7040,test.totalCostEstimate(test.paintCostEstimate(test.TotalroomArea(), test.PremiumPaintCost),test.labourCostEstimate(test.TotalroomArea())),0.1);
    }
  
}
