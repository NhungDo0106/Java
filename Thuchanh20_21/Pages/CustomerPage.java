package ThucHanhBai20_21.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CustomerPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private String header = "Customers Summary";
    private String headerCreate = "Quick Create";
    private String headerInvoice1 = "Create New Invoice";
    private String headerEstimate1 = "Create New Estimate";
    private String headerProposal1 = "New Proposal";
    private String headerCreditNote1 = "New Credit Note";
    private String headerCustomer11 = "Customer Details";
    private String headerSubsription1 = "New Subscription";
    private String headerProject1 = "Add new project";
    private String headerTask1 = "Add new task";
    private String headerExpense1 = "Add new Expense";
    private String headerContract1 = "Contract Information";
    private String headerArticle1 = "Add new article";
    private String headerTicket1 = "Ticket Information";
    private String headerEvent1 = "Add new event";

    private By headerCustomer = By.xpath("//span[normalize-space()='Customers Summary']");
    private By buttonAddNewCustomer = By.xpath("//a[normalize-space()='New Customer']");
    private By inputSearchCustomer = By.xpath("//div[@id='DataTables_Table_0_filter']//input[@type = \"search\"]");
    private By buttonCreate = By.xpath("//i[@class='fa-regular fa-plus fa-lg']");
    private By headerQuickCreate = By.xpath("//li[normalize-space()='Quick Create']");
    private By InvoicePage = By.xpath("//span[normalize-space()='Invoice']");
    private By EstimatePage = By.xpath("//span[normalize-space()='Estimate']");
    private By ProposalPage = By.xpath("//span[normalize-space()='Proposal']");
    private By CreditNotePage = By.xpath("//span[normalize-space()='Credit Note']");
    private By CustomerPage = By.xpath("//span[normalize-space()='Customer']");
    private By SubscriptionPage = By.xpath("//span[normalize-space()='Subscription']");
    private By ProjectPage = By.xpath("//span[normalize-space()='Project']");
    private By TaskPage = By.xpath("//span[normalize-space()='Task']");
    private By ExpensePage = By.xpath("//span[normalize-space()='Expense']");
    private By ContractPage = By.xpath("//span[normalize-space()='Contract']");
    private By ArticlePage = By.xpath("//span[normalize-space()='Article']");
    private By TicketPage = By.xpath("//span[normalize-space()='Ticket']");
    private By EventPage = By.xpath("//span[normalize-space()='Event']");
    private By headerInvoice = By.xpath("//span[normalize-space()='Create New Invoice']");
    private By headerEstimate = By.xpath("//span[normalize-space()='Create New Estimate']");
    private By headerProposal = By.xpath("//span[normalize-space()='New Proposal']");
    private By headerCreditNote = By.xpath("//span[normalize-space()='New Credit Note']");
    private By headerCustomer1 = By.xpath("//a[normalize-space()='Customer Details']");
    private By headerSubsription = By.xpath("//span[normalize-space()='New Subscription']");
    private By headerProject = By.xpath("//h4[normalize-space()='Add new project']");
    private By headerTask = By.xpath("//h4[@id='myModalLabel']");
    private By headerExpense = By.xpath("//h4[normalize-space()='Add new Expense']");
    private By headerContract = By.xpath("//h4[normalize-space()='Contract Information']");
    private By headerArticle = By.xpath("//span[normalize-space()='Add new article']");
    private By headerTicket = By.xpath("//h4[normalize-space()='Ticket Information']");
    private By headerEvent = By.xpath("//h4[normalize-space()='Add new event']");

    public CustomerPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void OpenCustomerHeader(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerCustomer));
        Assert.assertTrue(driver.findElement(headerCustomer).isDisplayed(),"Header customer not display");
        Assert.assertEquals(driver.findElement(headerCustomer).getText(),header);
    }

    public void clickButtonAddNew() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonAddNewCustomer));
        driver.findElement(buttonAddNewCustomer).click();
    }

    public void searchCustomer(String customerName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(inputSearchCustomer).sendKeys(customerName);
    }

    public void clickButtonCreate() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(buttonCreate).click();

    }

    public void OpenQuickCreatePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        Assert.assertTrue(driver.findElement(headerQuickCreate).isDisplayed(),"Not open create page");
        Assert.assertEquals(driver.findElement(headerQuickCreate).getText(),headerCreate);
    }

    public void clickInvoice() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(InvoicePage).click();
        Assert.assertTrue(driver.findElement(headerInvoice).isDisplayed(),"Header Create New Invoice not display");
        Assert.assertEquals(driver.findElement(headerInvoice).getText(),headerInvoice1);

    }


    public void clickEstimate() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(EstimatePage).click();
        Assert.assertTrue(driver.findElement(headerEstimate).isDisplayed(),"Header Create New Estimate not display");
        Assert.assertEquals(driver.findElement(headerEstimate).getText(),headerEstimate1);
    }

    public void clickProposal() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(ProposalPage).click();
        Assert.assertTrue(driver.findElement(headerProposal).isDisplayed(),"Header Create New Proposal not display");
        Assert.assertEquals(driver.findElement(headerProposal).getText(),headerProposal1);
    }


    public void clickCreditNote() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(CreditNotePage).click();
        Assert.assertTrue(driver.findElement(headerCreditNote).isDisplayed(),"Header Create New Credit Note not display");
        Assert.assertEquals(driver.findElement(headerCreditNote).getText(),headerCreditNote1);
    }


    public void clickCustomer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(CustomerPage).click();
        Assert.assertTrue(driver.findElement(headerCustomer1).isDisplayed(),"Header Create New Customer not display");
        Assert.assertEquals(driver.findElement(headerCustomer1).getText(),headerCustomer11);
    }


    public void clickSubscription() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(SubscriptionPage).click();
        Assert.assertTrue(driver.findElement(headerSubsription).isDisplayed(),"Header Create New Subscription not display");
        Assert.assertEquals(driver.findElement(headerSubsription).getText(),headerSubsription1);
    }


    public void clickProject() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(ProjectPage).click();
        Assert.assertTrue(driver.findElement(headerProject).isDisplayed(),"Header Create New Project not display");
        Assert.assertEquals(driver.findElement(headerProject).getText(),headerProject1);
    }


    public void clickTask() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(TaskPage).click();
        Assert.assertTrue(driver.findElement(headerTask).isDisplayed(),"Header Create New Task not display");
        Assert.assertEquals(driver.findElement(headerTask).getText(),headerTask1);
    }


    public void clickExpense() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(ExpensePage).click();
        Assert.assertTrue(driver.findElement(headerExpense).isDisplayed(),"Header Create New Expense not display");
        Assert.assertEquals(driver.findElement(headerExpense).getText(),headerExpense1);
    }


    public void clickContract() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(ContractPage).click();
        Assert.assertTrue(driver.findElement(headerContract).isDisplayed(),"Header Create New Contract not display");
        Assert.assertEquals(driver.findElement(headerContract).getText(),headerContract1);
    }


    public void clickArticle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(ArticlePage).click();
        Assert.assertTrue(driver.findElement(headerArticle).isDisplayed(),"Header Create New Article not display");
        Assert.assertEquals(driver.findElement(headerArticle).getText(),headerArticle1);
    }


    public void clickTicket() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(TicketPage).click();
        Assert.assertTrue(driver.findElement(headerTicket).isDisplayed(),"Header Create New Ticket not display");
        Assert.assertEquals(driver.findElement(headerTicket).getText(),headerTicket1);
    }


    public void clickEvent() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputSearchCustomer));
        driver.findElement(EventPage).click();
        Assert.assertTrue(driver.findElement(headerEvent).isDisplayed(),"Header Event not display");
        Assert.assertEquals(driver.findElement(headerEvent).getText(),headerEvent1);
    }
}
