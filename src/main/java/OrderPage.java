
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class OrderPage extends BasePage {

    public OrderPage(WebDriver webDriver) {
        super(webDriver);
    }
    private By inputName=By.xpath("//input[@placeholder='* Имя']");
    // Поле Имя
    private By inputSecondName=By.xpath("//input[@placeholder='* Фамилия']");
    // Поле Фамилия
    private By inputAdress=By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    // Поле Куда привезти заказ
    private By inputMetro=By.className("select-search__input");
    // Поле выбора метро
    private By chooseMetroKrasnyiVorota=By.xpath("//button[@value='7']");
    // Локатор метро "Красные ворота"
    private By inputMetroSelectCherkizovskaya=By.xpath("//button[@value='2']");
    // Локатор метро "Черкизовская"
    private By inputTelefonNumber=By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Поле для заполнения номера телефона
    private By buttonNextStep=By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // Кнопка "Далее"
    private By dayOrderArrive=By.xpath("//input[@placeholder='* Когда привезти самокат']");
    // Поле даты когда привезти самокат
    private By inputRentalPeriod = By.xpath(".//div[@class='Dropdown-control']/div[@class='Dropdown-placeholder']");
    // Клик "двое суток"
    private By checkBoxTwoDay = By.xpath(".//div[@class='Dropdown-menu']/div[2]");
    // Клик "Трое суток"
    private By checkBoxThreeDay = By.xpath(".//div[@class='Dropdown-menu']/div[3]");
    //  Заголовок "Про аренду"
    private By headingSamokat = By.xpath(".//div[@class='Order_Header__BZXOb']");
    // Чекбокс "Черный жемчуг"
    private By checkboxBlackPearl = By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='black']");
    // Чекбокс "Серая безысходность"
    private By checkboxGrayHopelessness = By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='grey']");
    // Input "Комментарий курьеру"
    private By commentСourier = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    // Кнопка внизу "Заказать"
    private By buttonOrderMiddle = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // Кнопка "Да" в подтверждении заказа
    private By yesButtonConfirmButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text() ='Да']");
    // Кнопка "Посмотреть статус"
    protected By buttonViewOrder = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Посмотреть статус']");

    public void chooseMetrochooseMetroKrasnyiVorota(){ // Метод выбора Метро для доставки
        webDriver.findElement(inputMetro).click();
        webDriver.findElement(chooseMetroKrasnyiVorota).click();
    }
    public void chooseMetroCherkizovskaya(){ // Метод выбора Метро для доставки
        webDriver.findElement(inputMetro).click();
        webDriver.findElement(inputMetroSelectCherkizovskaya).click();
    }

    public void writeNameInInput(String name, String secondname, String adress, String number) {
        webDriver.findElement(inputName).sendKeys(name);
        webDriver.findElement(inputSecondName).sendKeys(secondname);
        webDriver.findElement(inputAdress).sendKeys(adress);
        webDriver.findElement(inputTelefonNumber).sendKeys(number);
    }
    public void cllickOnNextStepButton(){ // Метод нажатие на кнопку "Далее"
        webDriver.findElement(buttonNextStep).click();
   }
    public void orderDayArrive(String day){ // Метод заполнения даты прибытия
        webDriver.findElement(dayOrderArrive).sendKeys(day);
    }
    public void clickRentalPeriod () {
        webDriver.findElement(inputRentalPeriod).click();
    }
    public void clickThreeDay () {
        webDriver.findElement(checkBoxThreeDay).click();
    }
    public void clickTwoDay() {
        webDriver.findElement(checkBoxTwoDay).click();
    }
    public void clickEmptySpace() {
        webDriver.findElement(headingSamokat).click();
    }
    public void clickBlackPearl() {
        webDriver.findElement(checkboxBlackPearl).click();
    }
    public void clickGrayHopelessness() {
        webDriver.findElement(checkboxGrayHopelessness).click();
    }
    public void clickButtonOrderMiddle() {
        webDriver.findElement(buttonOrderMiddle).click();
    }
    public void clickYesButtonConfirmOrder() {
        webDriver.findElement(yesButtonConfirmButton).click();
    }
    public  void writeCommentСourier(String text) {
        webDriver.findElement(commentСourier).sendKeys(text);
    }
    public boolean displayingButtonViewOrder () {
        return webDriver.findElement(buttonViewOrder).isDisplayed();
    }
    }



