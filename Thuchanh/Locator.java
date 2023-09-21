package Thuchanh;

public class Locator {
    //Login
    public static String HeaderLoginpage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id ='email']";
    public static String inputPassword = "//input[@id ='password']";
    public static String checkboxRemember = "[//input[@id ='remember']]";
    public static String buttonLogin = "//button[@type ='submit']";
    public static String linkForgot = "//a[@href ='https://crm.anhtester.com/admin/authentication/forgot_password']";
    public static String headerLogin = "//h1[normalize-space()='Login']";

    //Dashboard
    public static String checksearch = "//table[@id='DataTables_Table_0']//tr[1]//td[3]";
    public static String menuDashboard = "//span[normalize-space()= 'Dashboard']";
    public static String menuCustomers = "//span[normalize-space() = 'Customers']";
    public static String menuSale = "//span[normalize-space() = 'Sales']";
    public static String menuSubscriptions = "//span[normalize-space() = 'Subscriptions']";
    public static String menuExpenses = "//span[normalize-space() = 'Expenses']";
    public static String menuContracts = "//span[normalize-space() = 'Contracts']";
    public static String menuProjects = "//span[normalize-space() = 'Projects']";
    public static String menuTasks = "//span[normalize-space() = 'Tasks']";
    public static String menuSupport = "//span[normalize-space() = 'Support']";
    public static String menuLeads = "//span[normalize-space() = 'Leads']";
    public static String menuEstimateRequest = "//span[normalize-space() = 'EstimateRequest']";
    public static String menuKnowledgeBase = "//span[normalize-space() = 'KnowledgeBase']";
    public static String menuUtilities = "//span[normalize-space() = 'Utilities']";
    public static String menuReports = "//span[normalize-space() = 'Reports']";

    //Customer
    public static String buttonNewCustomer = "//a[normalize-space()= 'New Customer']";
    public static String buttonImportCustomers = "//a[normalize-space()= 'Import Customers']";
    public static String buttonContacts = "//a[contains(@href, 'clients/all_contacts')]";
    public static String headerCustomersSummary = "//span[normalize-space() = 'Customers Summary']";
    public static String inputSearchCustomers = "//div[@id = 'DataTables_Table_0_filter']//input[@type  ='search']";


    //New Customers
    public static String inputCompany = "//input[@id='company']";
    public static String inputVATNumber = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String clickdropdownGroups = "//button[@data-id='groups_in[]']";
    public static String inputSearchdropdownGroupt = "//div[@app-field-wrapper='groups_in[]']//input[@type='search']";
    public static String clickdropdownCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchdropdownCurrency = "//div[@app-field-wrapper='default_currency']//input[@type='search']";
    public static String clickdropdownLanguage = "//button[@data-id='default_language']";
    public static String selectLanguage = "//span[normalize-space()='Italian']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputCode = "//input[@id='zip']";
    public static String clickdropdownCountry = "//button[@data-id='country']";
    public static String inputSearchcountry = "//div[@app-field-wrapper='country']//input[@type='search']";
    public static String clickSaveandCreat = "//button[normalize-space()= 'Save and create contact']";
    public static String clickSave = "//div[@id='profile-save-section']//button[normalize-space()= 'Save']";
    public static String headerProfile = "//h4[normalize-space()='Profile']";
    public static String getTextGroupts = "//button[@title='VIP']";
    public static String getTextCurrency = "//button[@title='USD']";
    public static String getTextLanguage = "//button[@title='Italian']";
    public static String getTextCountry = "//button[@title='Vietnam']";
    public static String linkDetailCustomer = "//td[@class='sorting_1']/a";

    //Contacts
    public static String linkScreenContracts = "//a[normalize-space()='Contacts']";
    public static String linkScreenContracts1 = "//a[normalize-space()='Contacts 1']";
    public static String headercreenContracts = "//h4[normalize-space()='Contacts']";
    public static String addNewContracts = "//a[normalize-space()='New Contact']";
    public static String headerAddContactDialog = "//h4[normalize-space()='Add new contact']";
    public static String chooseFile = "//input[@id='profile_image']";
    public static String inputFristName = "//input[@id='firstname']";
    public static String inputLastname = "//input[@id='lastname']";
    public static String inputPosition = "//input[@id='title']";
    public static String inputPhoneNumber = "//input[@id='phonenumber']";
    public static String clickdropdownDirection = "//button[@title='System Default']";
    public static String selectDirection = "//span[normalize-space()='RTL']";
    public static String inputPasswordContact = "//input[@name='password']";
    public static String buttonShowPassword = "//span[@class='input-group-addon tw-border-l-0']/a";
    public static String buttonGenerate = "//a[@class='generate_password']";
    public static String checkboxDoNotSendEmail = "//input[@id='donotsendwelcomeemail']";
    public static String buttonSaveContacts = "//form[@id='contact-form']//button[normalize-space()='Save']";
    public static String buttonCloseContact = "//button[normalize-space()='Close']";
    public static String inputSearchContact = "//div[@id = 'DataTables_Table_0_filter']//input[@type  ='search']";
    public static String linkDetailContactst = "//td[@class='sorting_1']/a";
    public static String getTextDirectionContacts = "//button[@title='LTR']";

    //Projects
    public static String buttonNewProject = "//a[normalize-space() = 'New Project']";
    public static String headerProjectsSummary = "//span[normalize-space()= 'Projects Summary']";
    public static String inputSearchProject = "//div[@id = 'DataTables_Table_0_filter']//input[@type  ='search']";

    //New Projects
    public static String headerAddNewProject = "//form[@id='project_form']/descendant::h4[normalize-space()='Add new project']";
    public static String inputProjectName = "//label[normalize-space()='* Project Name']/following-sibling::input";
    public static String clickdropdownCustomerProject = "//label[normalize-space()='* Customer']/following-sibling::div//button";
    public static String inputSearchCustomerProject = "//label[normalize-space()='* Customer']/following-sibling::div//input[@type='search']";
    public static String checkboxCalculate = "//input[@id='progress_from_tasks']";
    public static String loadProjects = "//label[contains(text(),'Progress')]/following-sibling::input[@name='progress']";
    public static String clickdropdownBillingType = "//label[normalize-space()='* Billing Type']/following-sibling::div//button";
    public static String selectBillingType = "//span[normalize-space()='Fixed Rate']";
    public static String clickdropdownStatus = "//label[normalize-space()='Status']/following-sibling::div//button";
    public static String selectdropdownStatus = "//span[normalize-space()='On Hold']";
    public static String inputTotalRate = "//label[normalize-space()='Total Rate']/following-sibling::input";
    public static String inputEstimatedHours = "//label[normalize-space()='Estimated Hours']/following-sibling::input";
    public static String clickdropdownMembers = "//label[normalize-space()='Members']/following-sibling::div//button[@data-id='project_members[]']";
    public static String inputMembers = "//label[normalize-space()='Members']/following-sibling::div//input[@type='search']";
    public static String clickStartDate = "///label[@for='start_date']/following-sibling::div//input/";
    public static String clickDeadline = "///label[@for='deadline']/following-sibling::div//input/";
    public static String inputTags = "//label[normalize-space()='Tags']/following-sibling::input[@id='tags']";
    public static String inputDescription = "//body[@data-id='description']";
    public static String getTextDescription = "//div[normalize-space()='RTL']";
    public static String checkboxSendprojectcreatedemail = "//div[@class='checkbox checkbox-primary tw-mb-0']/descendant::input";
    public static String buttonsave = "//div[@class='panel-footer text-right']/child::button";
}
