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
    public void cLickOnAllQuestions(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.scrollToQuestions();
        mainPage.checkFirstQuestion();
        mainPage.checkTwoQuestion();
        mainPage.checkThreeQuestion();
        mainPage.checkFourQuestion();
        mainPage.checkFiveQuestion();
        mainPage.checkSixQuestion();
        mainPage.checkSevenQuestion();
        mainPage.checkEightQuestion();
    }

    @Test
    public void testMadeOrderWithUpButton(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.clickOrderUpButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.chooseMetrochooseMetroKrasnyiVorota();
        orderPage.writeNameInInput("Иван", "Иванов", "Домой", "791599737583");
        orderPage.cllickOnNextStepButton();
        orderPage.orderDayArrive("11.09.2022");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickTwoDay(); // 2 дня
        orderPage.clickGrayHopelessness(); // Серая безысходность
        orderPage.writeCommentСourier("Код домофона - 1991");
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }
    @Test
    public void testMadeOrderWithMiddleButton(){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOnCooke();
        mainPage.clickOrderMiddleButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.chooseMetroCherkizovskaya();
        orderPage.writeNameInInput("Генадий", "Федоров", "На Дачу", "898128912343");
        orderPage.cllickOnNextStepButton();
        orderPage.orderDayArrive("01.10.2022");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickThreeDay(); // 3 дня
        orderPage.clickBlackPearl(); // Черный цвет
        orderPage.writeCommentСourier("Код домофона - 1991");
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }

}
