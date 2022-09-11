import constants.Questions;
import constants.Request;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class MainPage extends BasePage{

    private By statusButton = By.className("Header_Link__1TAG7");
    private By orderNumberFeald=By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    private By goButton=By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']");

    private By cookeButton=By.className("App_CookieButton__3cvqF"); // Кнопка для закрытия модалки с куки

    private By questionOne = By.id("accordion__heading-0"); // Первый вопрос
    private By questionTwo = By.id("accordion__heading-1"); // ВТорой вопрос
    private By questionThree = By.id("accordion__heading-2"); // Третий вопрос
    private By questionFour = By.id("accordion__heading-3"); // Четвертый вопрос
    private By questionFive = By.id("accordion__heading-4"); // Птяый вопрос
    private By questionSix = By.id("accordion__heading-5"); // Шестой вопрос
    private By questionSeven = By.id("accordion__heading-6"); // Седьмой вопрос
    private By questionEight = By.id("accordion__heading-7"); // Восьмой вопрос

    private By requestOne = By.id("accordion__panel-0"); // Первый ответ
    private By requestTwo = By.id("accordion__panel-1"); // Второй ответ
    private By requestThree = By.id("accordion__panel-2"); // Третий ответ
    private By requestFour = By.id("accordion__panel-3"); // Четвертый ответ
    private By requestFive = By.id("accordion__panel-4"); // Пятый ответ
    private By requestSix = By.id("accordion__panel-5"); // Шестой ответ
    private By requestSeven = By.id("accordion__panel-6"); // Седьмой ответ
    private By requestEight = By.id("accordion__panel-7"); // Восьмой ответ

    private By orderUpButton = By.className("Button_Button__ra12g");
    private By orderMiddleButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public MainPage(WebDriver webDriver){
        super(webDriver);
    }
    public void clickOrderStatusButton(){ // Метод нажатия на кнопку "Статус заказа"
        webDriver.findElement(statusButton).click();
    }
    public void enterOrderNumber(String text) { // Метод ввода в поле номера заказа
        webDriver.findElement(orderNumberFeald).sendKeys(text);
    }
    public void clickGoButton(){ // Метод нажатия на кнопку "Go!"
        webDriver.findElement(goButton).click();
    }
    public void clickOrderUpButton () {
        webDriver.findElement(orderUpButton).click();
    }
    public void clickOrderMiddleButton () {
        webDriver.findElement(orderMiddleButton).click();
    }

    public void checkFirstQuestion(){ // Метод запуска и проверки вопроса и ответа #1
        webDriver.findElement(questionOne).click();
        String actualQuestion = webDriver.findElement(questionOne).getText();
        String actualRequest = webDriver.findElement(requestOne).getText();
        assertEquals("Ошибка", Questions.ONE, actualQuestion);
        assertEquals("Ошибка", Request.ONE, actualRequest);
    }
    public void checkTwoQuestion(){ // Метод запуска и проверки вопроса и ответа #2
        webDriver.findElement(questionTwo).click();
        String actualQuestion = webDriver.findElement(questionTwo).getText();
        String actualRequest = webDriver.findElement(requestTwo).getText();
        assertEquals("Ошибка", Questions.TWO, actualQuestion);
        assertEquals("Ошибка", Request.TWO, actualRequest);

    }
    public void checkThreeQuestion(){ // Метод запуска и проверки вопроса и ответа #3
        webDriver.findElement(questionThree).click();
        String actualQuestion = webDriver.findElement(questionThree).getText();
        String actualRequest = webDriver.findElement(requestThree).getText();
        assertEquals("Ошибка", Questions.THREE, actualQuestion);
        assertEquals("Ошибка", Request.THREE, actualRequest);

    }
    public void checkFourQuestion(){ // Метод запуска и проверки вопроса и ответа #4
        webDriver.findElement(questionFour).click();
        String actualQuestion = webDriver.findElement(questionFour).getText();
        String actualRequest = webDriver.findElement(requestFour).getText();
        assertEquals("Ошибка", Questions.FOUR, actualQuestion);
        assertEquals("Ошибка", Request.FOUR, actualRequest);

    }
    public void checkFiveQuestion(){ // Метод запуска и проверки вопроса и ответа #5
        webDriver.findElement(questionFive).click();
        String actualQuestion = webDriver.findElement(questionFive).getText();
        String actualRequest = webDriver.findElement(requestFive).getText();
        assertEquals("Ошибка", Questions.FIVE, actualQuestion);
        assertEquals("Ошибка", Request.FIVE, actualRequest);

    }
    public void checkSixQuestion(){ // Метод запуска и проверки вопроса и ответа #6
        webDriver.findElement(questionSix).click();
        String actualQuestion = webDriver.findElement(questionSix).getText();
        String actualRequest = webDriver.findElement(requestSix).getText();
        assertEquals("Ошибка", Questions.SIX, actualQuestion);
        assertEquals("Ошибка", Request.SIX, actualRequest);

    }
    public void checkSevenQuestion(){ // Метод запуска и проверки вопроса и ответа #7
        webDriver.findElement(questionSeven).click();
        String actualQuestion = webDriver.findElement(questionSeven).getText();
        String actualRequest = webDriver.findElement(requestSeven).getText();
        assertEquals("Ошибка", Questions.SEVEN, actualQuestion);
        assertEquals("Ошибка", Request.SEVEN, actualRequest);

    }
    public void checkEightQuestion(){ // Метод запуска и проверки вопроса и ответа #8
        webDriver.findElement(questionEight).click();
        String actualQuestion = webDriver.findElement(questionEight).getText();
        String actualRequest = webDriver.findElement(requestEight).getText();
        assertEquals("Ошибка", Questions.EIGHT, actualQuestion);
        assertEquals("Ошибка", Request.EIGHT, actualRequest);
    }

public void scrollToQuestions(){ // Метод скрола до первого вопроса
    WebElement element = webDriver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();", element);
}

public void clickOnCooke() { // Метод нажатия на кнопку куки
        webDriver.findElement(cookeButton).click();
}
}