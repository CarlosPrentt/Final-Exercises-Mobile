package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MenuScreen;
import screens.PrivacyAndLegalScreen;
import util.tests.BaseMobileTest;

public class LegalAndPrivacyTest extends BaseMobileTest {
    @Test()
    public void navigateToMenuScreen() {
        log.info("Start Navigation to Menu Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MenuScreen menu = dashBoard.goToMenuScreen();
        PrivacyAndLegalScreen privacy = menu.goToPrivacyScreen();

        log.info("Scroll Down");
        menu.scroll();

        log.info("Validate Profile Button");
        Assert.assertTrue(menu.profileIsDisplayed(), "Profile Button not displayed");

        log.info("Validate Property Rules Button");
        Assert.assertTrue(menu.rulesIsDisplayed(), "Property Rules Button not displayed");

        log.info("Validate Link to Account Button");
        Assert.assertTrue(menu.linkToAccountIsDisplayed(), "Link to Account Button not displayed");

        log.info("Validate Help Button");
        Assert.assertTrue(menu.helpIsDisplayed(), "Help Button not displayed");

        log.info("Validate Privacy and Legal Button");
        Assert.assertTrue(menu.privacyAndLegalIsDisplayed(), "Privacy and Legal Button not displayed");

        log.info("Show Legal and Privacy");
        menu.goToPrivacyScreen();

        log.info("Validate Privacy Policy Button");
        Assert.assertTrue(privacy.privacyPolicyIsDisplayed(), "Privacy Policy Button not displayed");

        log.info("Validate Terms of Use Button");
        Assert.assertTrue(privacy.termsOfUseIsDisplayed(), "Terms of Use Button not displayed");

        log.info("Validate Supplemental Terms and Conditions Button");
        Assert.assertTrue(privacy.supplementalTermsIsDisplayed(), "Supplemental Terms Button not displayed");

        log.info("Validate Legal Notices Button");
        Assert.assertTrue(privacy.legalNoticesIsDisplayed(), "Legal Notices Button not displayed");

        log.info("Validate Property Rules Button");
        Assert.assertTrue(privacy.propertyRulesIsDisplayed(), "Property Rules Button not displayed");

        log.info("Validate Electronic Comunications Button");
        Assert.assertTrue(privacy.electronicCommunicationsIsDisplayed(), "Electronic Comunications Button not displayed");
    }
}
