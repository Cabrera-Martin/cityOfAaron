/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Martin
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of calcLandCost method, of class CropControl.
     
    @Test
    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int expResult = 0;
        int result = CropControl.calcLandCost();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of buyLand method, of class CropControl.
     * Test case 1
     */
    @Test
    public void testBuyLandCase1() {
        System.out.println("buyLand - Test Case 1");
        CropData cropData = new CropData();
                
        int acresToBuy = 10;
        int landCost = 20;
        cropData.setwheatInStore(500);
        cropData.setacresOwned(2500);
        
        int expResult = 2510;
        int result = CropControl.buyLand(landCost, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test case 2
     */
    @Test
    public void testBuyLandCase2() {
        System.out.println("buyLand - Test Case 2");
        CropData cropData = new CropData();
                
        int acresToBuy = 10;
        int landCost = 20;
        cropData.setwheatInStore(0);
        cropData.setacresOwned(2500);
        int expResult = -1;
        int result = CropControl.buyLand(landCost, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method, of class CropControl.
     * Test case 3
     */
    @Test
    public void testBuyLandCase3() {
        System.out.println("buyLand - Test Case 3");
        CropData cropData = new CropData();
                
        int acresToBuy = -5;
        int landCost = 20;
        cropData.setwheatInStore(500);
        cropData.setacresOwned(2500);
        
        int expResult = -1;
        int result = CropControl.buyLand(landCost, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method, of class CropControl.
     * Test case 4
     */
    @Test
    public void testBuyLandCase4() {
        System.out.println("buyLand - Test Case 4");
        CropData cropData = new CropData();
                
        int acresToBuy = 10;
        int landCost = 60;
        cropData.setwheatInStore(500);
        cropData.setacresOwned(2500);
        
        int expResult = -1;
        int result = CropControl.buyLand(landCost, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method, of class CropControl.
     * Test case 5
     */
    @Test
    public void testBuyLandCase5() {
        System.out.println("buyLand - Test Case 5");
        CropData cropData = new CropData();
                
        int acresToBuy = 2900;
        int landCost = 5;
        cropData.setwheatInStore(15000);
        cropData.setacresOwned(2900);
        
        int expResult = 5800;
        int result = CropControl.buyLand(landCost, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
    /**
     * Test of buyLand method, of class CropControl.
     * Test case 6
     */
    @Test
    public void testBuyLandCase6() {
        System.out.println("buyLand - Test Case 6");
        CropData cropData = new CropData();
                
        int acresToBuy = 0;
        int landCost = 5;
        cropData.setwheatInStore(15000);
        cropData.setacresOwned(2900);
        
        int expResult = 2900;
        int result = CropControl.buyLand(landCost, acresToBuy, cropData);
        assertEquals(expResult, result);
    }
}
