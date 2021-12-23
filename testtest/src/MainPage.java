import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class MainPage {

    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-mount\"]/div[2]/div/div/div/div/form/div/div/div[1]/div[2]/div[1]/div/div[2]/input")
    private WebElement takeLogin;

    @FindBy(xpath = "//*[@id=\"app-mount\"]/div[2]/div/div/div/div/form/div/div/div[1]/div[2]/div[2]/div/input")
    private WebElement takePassword;

    @FindBy(xpath = "//*[@id=\"app-mount\"]/div[2]/div/div[2]/div/div/div/div/div[1]/nav/div[2]/div/a[2]/div/div[2]/div[1]/div/div")
    private WebElement chek;


    @FindBy(xpath = "//*[@id=\"app-mount\"]/div[2]/div/div[2]/div/div/div/div/div[1]/nav/div[2]/div/a[2]/div")
    private WebElement firstLS;

    @FindBy(xpath = "//*[@id=\"app-mount\"]/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/main/form/div/div[1]/div/div[3]/div[2]/div")
    private WebElement textLS;

    @FindBy(xpath = "//*[@id=\"app-mount\"]/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/main/form/div/div[1]/div/div[3]/div")
    private WebElement toPressEnter;


    @FindBy(xpath = "//*[@id=\"app-mount\"]/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/main/form/div/div[1]/div/div[4]/div[4]/button/div/div")
    private WebElement smilePanel;

    @FindBy(xpath = "/html/body/div[1]/div[5]/div/section/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[1]/ul[1]/li[1]/button")
    private WebElement FirstSmile;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/main/div[1]/div/div/ol/li[27]/div/div[1]/div/span/img")
    private WebElement SmileChek;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/main/div[1]/div/div/ol/li[2]/div/div[1]/div")
    private WebElement response;

@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/section/div[2]/div[1]/svg")
private WebElement toCall;

@FindBy(xpath = "/html/body/div[1]/div[5]/div[2]/div/div/form/div[1]/div[1]/h2")
private WebElement CallChek;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/main/div[1]/div/div/ol/li[35]/div/div[2]")
    private WebElement toGifChek;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/main/form/div/div[2]/div/div[3]/div")
    private WebElement toGifsand;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/main/div[1]/div/div/ol/li[42]/div/div[1]/div")
    private WebElement tableflip;

    public void sendMessage (String message){
        firstLS.click();
        textLS.sendKeys(message);
        toPressEnter.sendKeys(Keys.ENTER);
    }

    public String getResponse() {
        return response.getText();
    }

    public void Authorization (String login, String password){
        takeLogin.sendKeys(login);
        takePassword.sendKeys(password);
        takePassword.sendKeys(Keys.ENTER);
    }

    public String AuthorizationChek (){
        return chek.getText();
    }


    public void sendSmile (){
        smilePanel.click();
        FirstSmile.click();
        toPressEnter.sendKeys(Keys.ENTER);
    }

    public String SmileChek (){
        return SmileChek.getAttribute("src");
    }

    public void slashSand (String gif) throws InterruptedException {
        firstLS.click();
        textLS.sendKeys("/g");
        toPressEnter.sendKeys(Keys.ENTER);
        Thread.sleep(600);
        toGifsand.sendKeys(gif);
        Thread.sleep(300);
        toGifsand.sendKeys(Keys.ENTER);
    }

    public String GifChek (){
        return toGifChek.getAttribute("class");
    }

    public void tableflip () throws InterruptedException {
        firstLS.click();
        textLS.sendKeys("/ta");
        toPressEnter.sendKeys(Keys.ENTER);
        Thread.sleep(300);
        toGifsand.sendKeys(Keys.ENTER);
    }

    public String tableflipChek (){
        return tableflip.getAttribute("class");
    }
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
