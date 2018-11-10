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
    
    /**
     * Test of wheatForFood method, of class CropControl.
     * Test Case 1
     */
    @Test
    public void testWheatForFoodCase1() {
        System.out.println("wheatForFood - Test Case 1");
        CropData cropData = new CropData();
        int wheatInStore = 4000;
        int wheatForFood = 2000;
        int expResult = 2000;
        int result = CropControl.wheatForFood(wheatInStore, wheatForFood, cropData);
        assertEquals(expResult, result);
        
    }
  /**
     * Test of wheatForFood method, of class CropControl.
     * Test Case 2
     */
    @Test
    public void testWheatForFoodCase2() {
        System.out.println("wheatForFood - Test Case 2");
        CropData cropData = new CropData();
        int wheatInStore = 200;
        int wheatForFood = 150;
        int expResult = 150;
        int result = CropControl.wheatForFood(wheatInStore, wheatForFood, cropData);
        assertEquals(expResult, result);
        
    }
  /**
     * Test of wheatForFood method, of class CropControl.
     * Test Case 3
     */
    @Test
    public void testWheatForFoodCase3() {
        System.out.println("wheatForFood - Test Case 3");
        CropData cropData = new CropData();
        int wheatInStore = 0;
        int wheatForFood = 500;
        int expResult = -1;
        int result = CropControl.wheatForFood(wheatInStore, wheatForFood, cropData);
        assertEquals(expResult, result);
        
    }
     /**
     * Test of wheatForFood method, of class CropControl.
     * Test Case 4
     */
    @Test
    public void testWheatForFoodCase4() {
        System.out.println("wheatForFood - Test Case 4");
        CropData cropData = new CropData();
        int wheatInStore = 3000;
        int wheatForFood = -500;
        int expResult = -1;
        int result = CropControl.wheatForFood(wheatInStore, wheatForFood, cropData);
        assertEquals(expResult, result);
        
    }
      /**
     * Test of wheatForFood method, of class CropControl.
     * Test Case 5
     */
    @Test
    public void testWheatForFoodCase5() {
        System.out.println("wheatForFood - Test Case 5");
        CropData cropData = new CropData();
        int wheatInStore = 300;
        int wheatForFood = 300;
        int expResult = 300;
        int result = CropControl.wheatForFood(wheatInStore, wheatForFood, cropData);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 1
     */
    @Test
    public void testPlantCropsCase1() {
        System.out.println("plantCrops + Test Case 1");
        CropData cropData = new CropData();
        int acresToPlant = 100;
        cropData.setacresOwned(1000);
        cropData.setpopulation(500);
        cropData.setwheatInStore(300);
                        
        int expResult = 250;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);       
    }
    
/**
     * Test of plantCrops method, of class CropControl.
     * Test Case 2
     */
    @Test
    public void testPlantCropsCase2() {
        System.out.println("plantCrops + Test Case 2");
        CropData cropData = new CropData();
        int acresToPlant = 800;
        cropData.setacresOwned(1000);
        cropData.setpopulation(500);
        cropData.setwheatInStore(300);
                        
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);       
    }
    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 3
     */
    @Test
    public void testPlantCropsCase3() {
        System.out.println("plantCrops + Test Case 3");
        CropData cropData = new CropData();
        int acresToPlant = 100;
        cropData.setacresOwned(1000);
        cropData.setpopulation(3);
        cropData.setwheatInStore(300);
                        
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);       
    }
    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 4
     */
    @Test
    public void testPlantCropsCase4() {
        System.out.println("plantCrops + Test Case 4");
        CropData cropData = new CropData();
        int acresToPlant = 100;
        cropData.setacresOwned(50);
        cropData.setpopulation(500);
        cropData.setwheatInStore(300);
                        
        int expResult = -1;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);       
    }
    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 5
     */
    @Test
    public void testPlantCropsCase5() {
        System.out.println("plantCrops + Test Case 5");
        CropData cropData = new CropData();
        int acresToPlant = 1000;
        cropData.setacresOwned(1000);
        cropData.setpopulation(500);
        cropData.setwheatInStore(500);
                        
        int expResult = 0;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);       
    }
    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 6
     */
    @Test
    public void testPlantCropsCase6() {
        System.out.println("plantCrops + Test Case 6");
        CropData cropData = new CropData();
        int acresToPlant = 0;
        cropData.setacresOwned(1000);
        cropData.setpopulation(500);
        cropData.setwheatInStore(300);
                        
        int expResult = 300;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);       
    }
    /**
     * Test of setOffering method, of class CropControl.
     * Test Case 1
     */
    @Test
    public void testSetOfferingCase1() {
        System.out.println("setOffering + Test Case 1");
        int percentageToPay = 10;
        int expResult = 10;
        int result = CropControl.setOffering(percentageToPay);
        assertEquals(expResult, result);        
    }
    /**
     * Test of setOffering method, of class CropControl.
     * Test Case 2
     */
    @Test
    public void testSetOfferingCase2() {
        System.out.println("setOffering + Test Case 2");
        int percentageToPay = -10;
        int expResult = -1;
        int result = CropControl.setOffering(percentageToPay);
        assertEquals(expResult, result);        
    }
    /**
     * Test of setOffering method, of class CropControl.
     * Test Case 3
     */
    @Test
    public void testSetOfferingCase3() {
        System.out.println("setOffering + Test Case 3");
        int percentageToPay = 120;
        int expResult = -1;
        int result = CropControl.setOffering(percentageToPay);
        assertEquals(expResult, result);        
    }
    /**
     * Test of setOffering method, of class CropControl.
     * Test Case 4
     */
    @Test
    public void testSetOfferingCase4() {
        System.out.println("setOffering + Test Case 4");
        int percentageToPay = 0;
        int expResult = 0;
        int result = CropControl.setOffering(percentageToPay);
        assertEquals(expResult, result);        
    }
    /**
     * Test of setOffering method, of class CropControl.
     * Test Case 5
     */
    @Test
    public void testSetOfferingCase5() {
        System.out.println("setOffering + Test Case 5");
        int percentageToPay = 100;
        int expResult = 100;
        int result = CropControl.setOffering(percentageToPay);
        assertEquals(expResult, result);        
    }

   

    /**
     * Test of wheatForFood method, of class CropControl.
     * Test Case 1 redo
     */
    @Test
    public void testWheatForFoodcase1redo() {
        System.out.println("wheatForFood + Test Case 1 redo");
        CropData cropData = new CropData();
        int wheatInStore = 4000;
        int wheatForFood = 2000;
        int expResult = 2000;
        int result = CropControl.wheatForFood(wheatInStore, wheatForFood, cropData);
        assertEquals(expResult, result);
        
    }

   
}
