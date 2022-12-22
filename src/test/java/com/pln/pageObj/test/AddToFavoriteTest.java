package com.pln.pageObj.test;

import com.pln.pageObj.pages.CatalogPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pln.pageObj.constants.Constants.EMPTY_CART;

public class AddToFavoriteTest extends CommonConditions{
    @Test
    public void testAddItemToFavorite() throws InterruptedException {
        CatalogPage catalogPage = new CatalogPage(driver);

        catalogPage
                .openPage()
                .putProductInCart()
                .closePopUp()
                .checkCart();
        String result = catalogPage.checkCartStatus();

        Assert.assertTrue(EMPTY_CART.contains(result));
    }
}
