package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.TabletPage;

public class SortTest extends BaseTest {

    @Test
    public void testSort(){
        TabletPage tabletPage=homePage.clickTablet();
        tabletPage.clickSort();
    }
}
