package com.pln.pageObj.test;

import com.pln.pageObj.pages.HomePage;
import com.pln.pageObj.pages.ManPage;
import com.pln.pageObj.pages.OrderTrackerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.pln.pageObj.constants.Constants.FILTERED_PAGE;

public class FilterSortTest extends CommonConditions{
    @Test
    public void testFilterSort(){
        ManPage manPage = new ManPage(driver);

        manPage
                .openPage()
                .clickFilterSort()
                .clickCategory()
                .clickClothingCategory()
                .clickSize()
                .chooseSize()
                .clickDeleteFilter()
                .clickApply();

        String resultOfOrder = manPage.checkFilteredPage();
        Assert.assertEquals(resultOfOrder, FILTERED_PAGE);
    }
}
