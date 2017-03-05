import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dsfsd {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='about_us.php']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a[href='ajax_form.php']")
    @CacheLookup
    private WebElement ajaxFormScript;

    @FindBy(css = "#nav li:nth-of-type(4) ul li:nth-of-type(6) a")
    @CacheLookup
    private WebElement bookingForm;

    @FindBy(css = "#main p:nth-of-type(8) a:nth-of-type(2)")
    @CacheLookup
    private WebElement bookingFormScript;

    @FindBy(css = "a[href='unbranded_form.php']")
    @CacheLookup
    private WebElement clickHere;

    @FindBy(name = "Email_Address")
    @CacheLookup
    private WebElement comments1;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement comments10;

    @FindBy(name = "Password")
    @CacheLookup
    private WebElement comments2;

    @FindBy(name = "comments")
    @CacheLookup
    private WebElement comments3;

    @FindBy(name = "your_name")
    @CacheLookup
    private WebElement comments4;

    @FindBy(css = "#main div:nth-of-type(9) table tbody tr td textarea")
    @CacheLookup
    private WebElement comments5;

    @FindBy(name = "color")
    @CacheLookup
    private WebElement comments6;

    @FindBy(name = "color")
    @CacheLookup
    private WebElement comments7;

    @FindBy(name = "color")
    @CacheLookup
    private WebElement comments8;

    @FindBy(name = "color")
    @CacheLookup
    private WebElement comments9;

    @FindBy(css = "a[href='contact.php']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[href='/html_form.zip']")
    @CacheLookup
    private WebElement downloadTheCompleteHtmlForm;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement emailAddress;

    @FindBy(css = "a[href='email_form.php']")
    @CacheLookup
    private WebElement emailFormScript;

    @FindBy(css = "a[href='email_friend.php']")
    @CacheLookup
    private WebElement emailPageToFriend;

    @FindBy(css = "a[href='#formexample']")
    @CacheLookup
    private WebElement exampleHtmlForm;

    @FindBy(css = "a[href='faqs.php']")
    @CacheLookup
    private WebElement faqs;

    @FindBy(css = "#main div:nth-of-type(1) a")
    @CacheLookup
    private WebElement findOutMore;

    @FindBy(name = "first_name")
    @CacheLookup
    private WebElement firstName;

    @FindBy(css = "#main p:nth-of-type(8) a:nth-of-type(1)")
    @CacheLookup
    private WebElement formBuilderApplication;

    @FindBy(css = "#main p:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement formCreatedUsingHtml;

    @FindBy(css = "a[href='form-emailer.php']")
    @CacheLookup
    private WebElement formEmailer;

    @FindBy(css = "#main p:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement formProcessing;

    @FindBy(css = "#main ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement formProcessingCode;

    @FindBy(css = "a[href='#formtags']")
    @CacheLookup
    private WebElement formTag;

    @FindBy(css = "#headleft a")
    @CacheLookup
    private WebElement freeContactForm1;

    @FindBy(css = "#nav li:nth-of-type(4) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement freeContactForm2;

    @FindBy(css = "#footer a")
    @CacheLookup
    private WebElement freeContactForm3;

    @FindBy(css = "a[href='feedbackform.php']")
    @CacheLookup
    private WebElement freeFeedbackForm;

    @FindBy(css = "#nav li:nth-of-type(1) a")
    @CacheLookup
    private WebElement freeForm;

    @FindBy(css = "a[href='rsvp_form.php']")
    @CacheLookup
    private WebElement freeRsvpForm;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "#main div:nth-of-type(24) p b a")
    @CacheLookup
    private WebElement html5ResponsiveContactForm;

    @FindBy(css = "a[href='#checkboxes']")
    @CacheLookup
    private WebElement htmlCheckboxes;

    @FindBy(css = "a[href='#dropdowns']")
    @CacheLookup
    private WebElement htmlDropDownMenus;

    @FindBy(name = "something")
    @CacheLookup
    private WebElement htmlDropdownSelectFieldInAction;

    @FindBy(css = "a[href='#fileupload']")
    @CacheLookup
    private WebElement htmlFileUpload;

    @FindBy(css = "#main div:nth-of-type(4) form table tbody tr:nth-of-type(6) td a")
    @CacheLookup
    private WebElement htmlForm;

    @FindBy(css = "#main ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement htmlFormCode;

    @FindBy(css = "a[href='html_form.php']")
    @CacheLookup
    private WebElement htmlFormScript;

    @FindBy(css = "a[href='#passwordfield']")
    @CacheLookup
    private WebElement htmlPasswordField;

    @FindBy(css = "a[href='#radiobuttons']")
    @CacheLookup
    private WebElement htmlRadioButtons;

    @FindBy(css = "a[href='#submitbuttons']")
    @CacheLookup
    private WebElement htmlSubmitButtons1;

    @FindBy(css = "a[href='#resetbuttons']")
    @CacheLookup
    private WebElement htmlSubmitButtons2;

    @FindBy(css = "a[href='#textfield']")
    @CacheLookup
    private WebElement htmlTextField;

    @FindBy(css = "a[href='#textarea']")
    @CacheLookup
    private WebElement htmlTextareaField;

    @FindBy(css = "#highlighter_244484 table tbody tr td:nth-of-type(2) div.container div:nth-of-type(49) code:nth-of-type(14) a")
    @CacheLookup
    private WebElement httpwwwFreecontactformComhtmlformPhp;

    @FindBy(name = "last_name")
    @CacheLookup
    private WebElement lastName;

    @FindBy(css = "input.ui-button.ui-widget.ui-state-default.ui-corner-all")
    @CacheLookup
    private WebElement logIn;

    @FindBy(css = "a[href='members.php']")
    @CacheLookup
    private WebElement members;

    @FindBy(css = "#nav li:nth-of-type(4) ul li:nth-of-type(7) a")
    @CacheLookup
    private WebElement orderForm;

    @FindBy(css = "#main p:nth-of-type(8) a:nth-of-type(3)")
    @CacheLookup
    private WebElement orderFormScript;

    private final String pageLoadedText = "This is just an example form for you, if you need something a little different from the one below, then please have a look through our other web pages (we have many other forms available)";

    private final String pageUrl = "/html_form.php";

    @FindBy(css = "a[href='privacy_policy.php']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "#nav li:nth-of-type(3) a")
    @CacheLookup
    private WebElement proForm;

    @FindBy(css = "a[href='#']")
    @CacheLookup
    private WebElement products;

    @FindBy(css = "#nav li:nth-of-type(4) ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement professionalFormBuilder;

    @FindBy(name = "color")
    @CacheLookup
    private List<WebElement> radioButtonGroupInAction1;

    @FindBy(name = "color")
    @CacheLookup
    private List<WebElement> radioButtonGroupInAction2;

    @FindBy(name = "color")
    @CacheLookup
    private List<WebElement> radioButtonGroupInAction3;

    @FindBy(name = "color")
    @CacheLookup
    private List<WebElement> radioButtonGroupInAction4;

    private final String radioButtonGroupInActionValue = "green";

    private final String radioButtonGroupInActionValue = "red";

    private final String radioButtonGroupInActionValue = "blue";

    private final String radioButtonGroupInActionValue = "white";

    @FindBy(name = "your_name")
    @CacheLookup
    private WebElement resetButtonFieldInAction1;

    @FindBy(name = "dummysubmit")
    @CacheLookup
    private WebElement resetButtonFieldInAction2;

    @FindBy(css = "#nav li:nth-of-type(2) a")
    @CacheLookup
    private WebElement responsiveForm;

    @FindBy(name = "selectedfile")
    @CacheLookup
    private WebElement selectAFileToUpload;

    @FindBy(css = "#main div:nth-of-type(4) form table tbody tr:nth-of-type(6) td input[type='submit']")
    @CacheLookup
    private WebElement submitForm1;

    @FindBy(name = "dummysubmit")
    @CacheLookup
    private WebElement submitForm2;

    @FindBy(name = "telephone")
    @CacheLookup
    private WebElement telephoneNumber;

    @FindBy(css = "a[href='#top']")
    @CacheLookup
    private WebElement topOfPage;

    @FindBy(css = "a[href='wordpress-form.php']")
    @CacheLookup
    private WebElement wordpressContactForm;

    public dsfsd() {
    }

    public dsfsd(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public dsfsd(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public dsfsd(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Ajax Form Script Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickAjaxFormScriptLink() {
        ajaxFormScript.click();
        return this;
    }

    /**
     * Click on Booking Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickBookingFormLink() {
        bookingForm.click();
        return this;
    }

    /**
     * Click on Booking Form Script Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickBookingFormScriptLink() {
        bookingFormScript.click();
        return this;
    }

    /**
     * Click on Click Here Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickClickHereLink() {
        clickHere.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Download The Complete Html Form Script Here Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickDownloadTheCompleteHtmlFormLink() {
        downloadTheCompleteHtmlForm.click();
        return this;
    }

    /**
     * Click on Email Form Script Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickEmailFormScriptLink() {
        emailFormScript.click();
        return this;
    }

    /**
     * Click on Email Page To Friend Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickEmailPageToFriendLink() {
        emailPageToFriend.click();
        return this;
    }

    /**
     * Click on Example Html Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickExampleHtmlFormLink() {
        exampleHtmlForm.click();
        return this;
    }

    /**
     * Click on Faqs Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFaqsLink() {
        faqs.click();
        return this;
    }

    /**
     * Click on Find Out More Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFindOutMoreLink() {
        findOutMore.click();
        return this;
    }

    /**
     * Click on Form Builder Application Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFormBuilderApplicationLink() {
        formBuilderApplication.click();
        return this;
    }

    /**
     * Click on Form Created Using Html Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFormCreatedUsingHtmlLink() {
        formCreatedUsingHtml.click();
        return this;
    }

    /**
     * Click on Form Emailer Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFormEmailerLink() {
        formEmailer.click();
        return this;
    }

    /**
     * Click on Form Processing Code Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFormProcessingCodeLink() {
        formProcessingCode.click();
        return this;
    }

    /**
     * Click on Form Processing Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFormProcessingLink() {
        formProcessing.click();
        return this;
    }

    /**
     * Click on Form Tag Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFormTagLink() {
        formTag.click();
        return this;
    }

    /**
     * Click on Free Contact Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFreeContactForm1Link() {
        freeContactForm1.click();
        return this;
    }

    /**
     * Click on Free Contact Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFreeContactForm2Link() {
        freeContactForm2.click();
        return this;
    }

    /**
     * Click on Free Contact Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFreeContactForm3Link() {
        freeContactForm3.click();
        return this;
    }

    /**
     * Click on Free Feedback Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFreeFeedbackFormLink() {
        freeFeedbackForm.click();
        return this;
    }

    /**
     * Click on Free Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFreeFormLink() {
        freeForm.click();
        return this;
    }

    /**
     * Click on Free Rsvp Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickFreeRsvpFormLink() {
        freeRsvpForm.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Html5 Responsive Contact Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtml5ResponsiveContactFormLink() {
        html5ResponsiveContactForm.click();
        return this;
    }

    /**
     * Click on Html Checkboxes Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlCheckboxesLink() {
        htmlCheckboxes.click();
        return this;
    }

    /**
     * Click on Html Drop Down Menus Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlDropDownMenusLink() {
        htmlDropDownMenus.click();
        return this;
    }

    /**
     * Click on Html File Upload Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlFileUploadLink() {
        htmlFileUpload.click();
        return this;
    }

    /**
     * Click on Html Form Code Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlFormCodeLink() {
        htmlFormCode.click();
        return this;
    }

    /**
     * Click on Html Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlFormLink() {
        htmlForm.click();
        return this;
    }

    /**
     * Click on Html Form Script Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlFormScriptLink() {
        htmlFormScript.click();
        return this;
    }

    /**
     * Click on Html Password Field Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlPasswordFieldLink() {
        htmlPasswordField.click();
        return this;
    }

    /**
     * Click on Html Radio Buttons Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlRadioButtonsLink() {
        htmlRadioButtons.click();
        return this;
    }

    /**
     * Click on Html Submit Buttons Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlSubmitButtons1Link() {
        htmlSubmitButtons1.click();
        return this;
    }

    /**
     * Click on Html Submit Buttons Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlSubmitButtons2Link() {
        htmlSubmitButtons2.click();
        return this;
    }

    /**
     * Click on Html Text Field Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlTextFieldLink() {
        htmlTextField.click();
        return this;
    }

    /**
     * Click on Html Textarea Field Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHtmlTextareaFieldLink() {
        htmlTextareaField.click();
        return this;
    }

    /**
     * Click on Httpwww.freecontactform.comhtmlform.php Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickHttpwwwFreecontactformComhtmlformPhpLink() {
        httpwwwFreecontactformComhtmlformPhp.click();
        return this;
    }

    /**
     * Click on Log In Button.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickLogInButton() {
        logIn.click();
        return this;
    }

    /**
     * Click on Members Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickMembersLink() {
        members.click();
        return this;
    }

    /**
     * Click on Order Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickOrderFormLink() {
        orderForm.click();
        return this;
    }

    /**
     * Click on Order Form Script Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickOrderFormScriptLink() {
        orderFormScript.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Pro Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickProFormLink() {
        proForm.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickProductsLink() {
        products.click();
        return this;
    }

    /**
     * Click on Professional Form Builder Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickProfessionalFormBuilderLink() {
        professionalFormBuilder.click();
        return this;
    }

    /**
     * Click on Responsive Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickResponsiveFormLink() {
        responsiveForm.click();
        return this;
    }

    /**
     * Click on Submit Form Button.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickSubmitForm1Button() {
        submitForm1.click();
        return this;
    }

    /**
     * Click on Submit Form Button.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickSubmitForm2Button() {
        submitForm2.click();
        return this;
    }

    /**
     * Click on Top Of Page Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickTopOfPageLink() {
        topOfPage.click();
        return this;
    }

    /**
     * Click on Wordpress Contact Form Link.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd clickWordpressContactFormLink() {
        wordpressContactForm.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd fill() {
        setComments1PasswordField();
        setComments2PasswordField();
        setFirstNameTextField();
        setLastNameTextField();
        setEmailAddressTextField();
        setTelephoneNumberTextField();
        setComments3TextareaField();
        setComments4TextField();
        setComments5TextareaField();
        setRadioButtonGroupInAction1RadioButtonField();
        setRadioButtonGroupInAction2RadioButtonField();
        setRadioButtonGroupInAction3RadioButtonField();
        setRadioButtonGroupInAction4RadioButtonField();
        setComments6CheckboxField();
        setComments7CheckboxField();
        setComments8CheckboxField();
        setComments9CheckboxField();
        setComments10PasswordField();
        setHtmlDropdownSelectFieldInActionDropDownListField();
        setResetButtonFieldInAction1ResetField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Comments Password field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments10PasswordField() {
        return setComments10PasswordField(data.get("COMMENTS_10"));
    }

    /**
     * Set value to Comments Password field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments10PasswordField(String comments10Value) {
        comments10.sendKeys(comments10Value);
        return this;
    }

    /**
     * Set default value to Comments Password field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments1PasswordField() {
        return setComments1PasswordField(data.get("COMMENTS_1"));
    }

    /**
     * Set value to Comments Password field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments1PasswordField(String comments1Value) {
        comments1.sendKeys(comments1Value);
        return this;
    }

    /**
     * Set default value to Comments Password field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments2PasswordField() {
        return setComments2PasswordField(data.get("COMMENTS_2"));
    }

    /**
     * Set value to Comments Password field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments2PasswordField(String comments2Value) {
        comments2.sendKeys(comments2Value);
        return this;
    }

    /**
     * Set default value to Comments Textarea field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments3TextareaField() {
        return setComments3TextareaField(data.get("COMMENTS_3"));
    }

    /**
     * Set value to Comments Textarea field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments3TextareaField(String comments3Value) {
        comments3.sendKeys(comments3Value);
        return this;
    }

    /**
     * Set default value to Comments Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments4TextField() {
        return setComments4TextField(data.get("COMMENTS_4"));
    }

    /**
     * Set value to Comments Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments4TextField(String comments4Value) {
        comments4.sendKeys(comments4Value);
        return this;
    }

    /**
     * Set default value to Comments Textarea field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments5TextareaField() {
        return setComments5TextareaField(data.get("COMMENTS_5"));
    }

    /**
     * Set value to Comments Textarea field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments5TextareaField(String comments5Value) {
        comments5.sendKeys(comments5Value);
        return this;
    }

    /**
     * Set Comments Checkbox field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments6CheckboxField() {
        if (!comments6.isSelected()) {
            comments6.click();
        }
        return this;
    }

    /**
     * Set Comments Checkbox field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments7CheckboxField() {
        if (!comments7.isSelected()) {
            comments7.click();
        }
        return this;
    }

    /**
     * Set Comments Checkbox field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments8CheckboxField() {
        if (!comments8.isSelected()) {
            comments8.click();
        }
        return this;
    }

    /**
     * Set Comments Checkbox field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setComments9CheckboxField() {
        if (!comments9.isSelected()) {
            comments9.click();
        }
        return this;
    }

    /**
     * Set default value to Email Address Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setEmailAddressTextField() {
        return setEmailAddressTextField(data.get("EMAIL_ADDRESS"));
    }

    /**
     * Set value to Email Address Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setEmailAddressTextField(String emailAddressValue) {
        emailAddress.sendKeys(emailAddressValue);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setFirstNameTextField() {
        return setFirstNameTextField(data.get("FIRST_NAME"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setFirstNameTextField(String firstNameValue) {
        firstName.sendKeys(firstNameValue);
        return this;
    }

    /**
     * Set default value to Html Dropdown Select Field In Action Drop Down List field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setHtmlDropdownSelectFieldInActionDropDownListField() {
        return setHtmlDropdownSelectFieldInActionDropDownListField(data.get("HTML_DROPDOWN_SELECT_FIELD_IN_ACTION"));
    }

    /**
     * Set value to "Action" Drop Down List field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setActionDropDownListField(String ActionValue) {
        new Select(Action).selectByVisibleText(ActionValue);
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setLastNameTextField() {
        return setLastNameTextField(data.get("LAST_NAME"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setLastNameTextField(String lastNameValue) {
        lastName.sendKeys(lastNameValue);
        return this;
    }

    /**
     * Set default value to Radio Button Group In Action Radio Button field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setRadioButtonGroupInAction1RadioButtonField() {
        for (WebElement el : radioButtonGroupInAction1) {
            if (el.getAttribute("value").equals(radioButtonGroupInAction1Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Radio Button Group In Action Radio Button field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setRadioButtonGroupInAction2RadioButtonField() {
        for (WebElement el : radioButtonGroupInAction2) {
            if (el.getAttribute("value").equals(radioButtonGroupInAction2Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Radio Button Group In Action Radio Button field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setRadioButtonGroupInAction3RadioButtonField() {
        for (WebElement el : radioButtonGroupInAction3) {
            if (el.getAttribute("value").equals(radioButtonGroupInAction3Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Radio Button Group In Action Radio Button field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setRadioButtonGroupInAction4RadioButtonField() {
        for (WebElement el : radioButtonGroupInAction4) {
            if (el.getAttribute("value").equals(radioButtonGroupInAction4Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Reset Button Field In Action Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setResetButtonFieldInAction1ResetField() {
        return setResetButtonFieldInAction1ResetField(data.get("RESET_BUTTON_FIELD_IN_ACTION"));
    }

    /**
     * Set Reset Button Field In Action Reset field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setResetButtonFieldInAction1ResetField(String resetButtonFieldInActionValue) {
        resetButtonFieldInAction1.sendKeys(resetButtonFieldInActionValue);
        return this;
    }

    /**
     * Set Reset Button Field In Action Reset field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setResetButtonFieldInAction2ResetField() {
        return this;
    }

    /**
     * Set Select A File To Upload File field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setSelectAFileToUploadFileField() {
        return this;
    }

    /**
     * Set default value to Telephone Number Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setTelephoneNumberTextField() {
        return setTelephoneNumberTextField(data.get("TELEPHONE_NUMBER"));
    }

    /**
     * Set value to Telephone Number Text field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd setTelephoneNumberTextField(String telephoneNumberValue) {
        telephoneNumber.sendKeys(telephoneNumberValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd submit() {
        clickSubmitFormButton();
        return this;
    }

    /**
     * Unset Comments Checkbox field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd unsetComments6CheckboxField() {
        if (comments6.isSelected()) {
            comments6.click();
        }
        return this;
    }

    /**
     * Unset Comments Checkbox field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd unsetComments7CheckboxField() {
        if (comments7.isSelected()) {
            comments7.click();
        }
        return this;
    }

    /**
     * Unset Comments Checkbox field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd unsetComments8CheckboxField() {
        if (comments8.isSelected()) {
            comments8.click();
        }
        return this;
    }

    /**
     * Unset Comments Checkbox field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd unsetComments9CheckboxField() {
        if (comments9.isSelected()) {
            comments9.click();
        }
        return this;
    }

    /**
     * Unset default value from Html Dropdown Select Field In Action Drop Down List field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd unsetHtmlDropdownSelectFieldInActionDropDownListField() {
        return unsetHtmlDropdownSelectFieldInActionDropDownListField(data.get("HTML_DROPDOWN_SELECT_FIELD_IN_ACTION"));
    }

    /**
     * Unset value from Html Dropdown Select Field In Action Drop Down List field.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd unsetHtmlDropdownSelectFieldInActionDropDownListField(String htmlDropdownSelectFieldInActionValue) {
        new Select(htmlDropdownSelectFieldInAction).deselectByVisibleText(htmlDropdownSelectFieldInActionValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the dsfsd class instance.
     */
    public dsfsd verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
