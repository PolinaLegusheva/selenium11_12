package com.pln.pageObj.test;

import com.pln.pageObj.pages.OrderTrackerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pln.pageObj.constants.Constants.INVALID_COMBINATION;

public class OrderTrackerTest extends CommonConditions{
    @Test
    public void testOrderTracker(){
        OrderTrackerPage orderTrackerPage = new OrderTrackerPage(driver);

        orderTrackerPage
                .openPage()
                .orderInputCells()
                .submitButton()
                .checkOrderStatus();

        String resultOfOrder = orderTrackerPage.checkOrderStatus();
        Assert.assertEquals(resultOfOrder, INVALID_COMBINATION);
    }
}
