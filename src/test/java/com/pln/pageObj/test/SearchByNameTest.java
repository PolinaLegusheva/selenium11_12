package com.pln.pageObj.test;

import com.pln.pageObj.pages.CatalogPage;
import com.pln.pageObj.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pln.pageObj.constants.Constants.SEARCH_INPUT;
import static com.pln.pageObj.constants.Constants.SUGGESTION_INPUT;

public class SearchByNameTest extends CommonConditions {
    @Test
    public void testFindProductByName() throws InterruptedException {
        String enterText = SEARCH_INPUT;
        HomePage homePage = new HomePage(driver);
        CatalogPage catalogPage = new CatalogPage(driver);
        String expectedText = SUGGESTION_INPUT ;

        homePage
                .openPage()
                .enterNameOfSearch(enterText);

        String res = catalogPage.getTextFromTitle();

        Assert.assertEquals(res, expectedText);
    }
}
