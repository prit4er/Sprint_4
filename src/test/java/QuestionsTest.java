import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class QuestionsTest extends BaseUI {

    @Test
    public void orderNotFoundShouldBeDisplayd(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderStatusButton();
        mainPage.enterOrderNumber("123");
        mainPage.clickGoButton();
        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver);
        boolean isDisplayed = orderStatusPage.orderNotFoundIsDisplayed();
        Assert.assertTrue("Order not found image is not displayed", isDisplayed);
    }

    @Test
    public void cLickOnFirstQuestions(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.scrollToQuestions();
        mainPage.checkFirstQuestion();
    }
    @Test
    public void cLickOnSecondQuestions() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.scrollToQuestions();
        mainPage.checkTwoQuestion();
    }
    @Test
    public void cLickOnThreeQuestions() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.scrollToQuestions();
        mainPage.checkThreeQuestion();
    }
    @Test
    public void cLickOnFouruestions() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.scrollToQuestions();
        mainPage.checkFourQuestion();
    }
    @Test
    public void cLickOnFiveQuestions() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.scrollToQuestions();
        mainPage.checkFiveQuestion();
    }
    @Test
    public void cLickOnSixQuestions() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.scrollToQuestions();
        mainPage.checkSixQuestion();
    }
    @Test
    public void cLickOnSevenQuestions() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.scrollToQuestions();
        mainPage.checkSevenQuestion();
    }
    @Test
    public void cLickOnEightQuestions() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.scrollToQuestions();
        mainPage.checkEightQuestion();
    }
    @Test
    public void testMadeOrderWithUpButton(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.clickOrderUpButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.chooseMetrochooseMetroKrasnyiVorota();
        orderPage.writeNameInInput("????????", "????????????", "??????????", "791599737583");
        orderPage.cllickOnNextStepButton();
        orderPage.orderDayArrive("11.09.2022");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickTwoDay(); // 2 ??????
        orderPage.clickGrayHopelessness(); // ?????????? ??????????????????????????
        orderPage.writeComment??ourier("?????? ???????????????? - 1991");
        orderPage.clickButtonOrderMiddle(); // ????????????????
        orderPage.clickYesButtonConfirmOrder(); // ???????????? ????
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("???????????? '???????????????????? ????????????' ???? ??????????????", isDisplayed);
    }
    @Test
    public void testMadeOrderWithMiddleButton(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.clickOrderMiddleButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.chooseMetroCherkizovskaya();
        orderPage.writeNameInInput("??????????????", "??????????????", "???? ????????", "898128912343");
        orderPage.cllickOnNextStepButton();
        orderPage.orderDayArrive("01.10.2022");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickThreeDay(); // 3 ??????
        orderPage.clickBlackPearl(); // ???????????? ????????
        orderPage.writeComment??ourier("?????? ???????????????? - 1991");
        orderPage.clickButtonOrderMiddle(); // ????????????????
        orderPage.clickYesButtonConfirmOrder(); // ???????????? ????
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("???????????? '???????????????????? ????????????' ???? ??????????????", isDisplayed);
    }

}
