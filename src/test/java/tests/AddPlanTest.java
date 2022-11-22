package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AddPlanScreen;
import screens.DashBoardScreen;
import screens.MapScreen;
import util.tests.BaseMobileTest;

public class AddPlanTest extends BaseMobileTest {

    @Test
    public void navigateToAddingPlans(){
        log.info("Start Navigation to Add Plans");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        AddPlanScreen addPlan = dashBoard.goToAddPlanScreen();

        log.info("Validate Reserve Dining Option");
        Assert.assertTrue(addPlan.diningAvailabilityIsDisplayed(), "Reserve Dining Option not displayed");
    }
}
