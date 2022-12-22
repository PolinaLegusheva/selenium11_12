package com.pln.pageObj.test;

import com.pln.pageObj.pages.CatalogPage;
import com.pln.pageObj.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pln.pageObj.constants.Constants.EMPTY_BAG;

public class AddToBagTest extends CommonConditions{
    @Test
    public void testAddItemToFavorite() throws InterruptedException {
        ProductPage productPage = new ProductPage(driver);

        productPage
                .openPage()
                .chooseSize()
                .putProductInBag()
                .checkBag()
                .checkBagStatus();
        String result = productPage.checkBagStatus();

        Assert.assertTrue(EMPTY_BAG.contains(result));
    }
}
