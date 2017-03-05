/**
 * Created by Dave on 4/03/2017. (C)  all rights reserved
 */

const BODYTAG                  = 'body';
const INPUTTAG                  = 'input';
const INPUTNAMEATTRIBUTE        = 'name';
const INPUTIDATTRIBUTE          = 'id';
const INPUTNAMEATTRIBUTESAMPLE  = 'example_name';
const INPUTIDATTRIBUTESAMPLE    = 'example_id';


var elementCollection = document.createElement(BODYTAG);
var elementWithNameAndId = document.createElement(INPUTTAG);
var elementWithName = document.createElement(INPUTTAG);
var elementWithId = document.createElement(INPUTTAG);
elementWithNameAndId.setAttribute(INPUTNAMEATTRIBUTE, INPUTNAMEATTRIBUTESAMPLE);
elementWithNameAndId.setAttribute(INPUTIDATTRIBUTE, INPUTIDATTRIBUTESAMPLE);
elementWithName.setAttribute(INPUTNAMEATTRIBUTE, INPUTNAMEATTRIBUTESAMPLE);
elementWithId.setAttribute(INPUTIDATTRIBUTE, INPUTIDATTRIBUTESAMPLE);
elementCollection.appendChild(elementWithNameAndId);
elementCollection.appendChild(elementWithName);
elementCollection.appendChild(elementWithId);

console.log(createPageObjectHeader('this_is_my_page_title'));
//     //    class EBSLoginPage < Page
console.log(createPageObjectEnterMethod('this_is_my_field_name'));
//     //    self.user_name=user_name_value
//     //    enter @@user_name,user_name_value
console.log(createPageObjectClickMethod('this_is_my_button_name'));
//     //    self.login_button
//     //    click @@login_button
console.log(createPageObjectFooter());
//     //    end

console.log(getInputFieldName(elementWithNameAndId));
//     //    example_name
console.log(getInputFieldName(elementWithName));
//     //    example_name
console.log(getInputFieldName(elementWithId));
//     //    example_id


console.log(createPageObjectAnnotation(elementWithNameAndId));
//     //    @@example_name = {:platform => "Web", :id_type => :name, :id_value => "example_name" }
console.log(createPageObjectAnnotation(elementWithName));
//     //    @@example_name = {:platform => "Web", :id_type => :name, :id_value => "example_name" }
console.log(createPageObjectAnnotation(elementWithId));
//     //    @@example_id = {:platform => "Web", :id_type => :id, :id_value => "example_id" }


console.log(createPageObjectMethod(elementWithNameAndId));
//     //    def self.example_name=example_name_value
//     //    enter @@example_name,example_name_value
//     //    end
console.log(createPageObjectMethod(elementWithName));
//     //    def self.example_name=example_name_value
//     //    enter @@example_name,example_name_value
//     //    end
console.log(createPageObjectMethod(elementWithId));
//     //    def self.example_id=example_id_value
//     //    enter @@example_id,example_id_value
//     //    end


console.log(createPageObject(elementCollection, 'this_is_my_page_title'));
//     //    def self.example_id=example_id_value
//     //    enter @@example_id,example_id_value
//     //    end



/*
 See below for a Ruby pageobject sample supplied by Manood

 class EBSLoginPage < Page

 @@login_button = {:platform => "Web", :id_type => :id, :id_value => "SubmitButton" }
 @@user_name = {:platform => "Web", :id_type => :name, :id_value => "usernameField" }
 @@password = {:platform => "Web", :id_type => :name, :id_value => "passwordField" }

 def self.login_button
 click @@login_button
 end

 def self.user_name=userName
 enter @@user_name,userName
 end

 def self.password=passworsText
 enter @@password,passworsText
 end

 end
 */
// The below code is is samples from java of more complex interactions
// /**
//  * Set value to "Action" Drop Down List field.
//  *
//  * @return the dsfsd class instance.
//  */
// public dsfsd setActionDropDownListField(String ActionValue) {
//     new Select(Action).selectByVisibleText(ActionValue);
//     return this;
// }
//
//
// /**
//  * Set default value to Radio Button Group In Action Radio Button field.
//  *
//  * @return the dsfsd class instance.
//  */
// public dsfsd setRadioButtonGroupInAction1RadioButtonField() {
//     for (WebElement el : radioButtonGroupInAction1) {
//         if (el.getAttribute("value").equals(radioButtonGroupInAction1Value)) {
//             if (!el.isSelected()) {
//                 el.click();
//             }
//             break;
//         }
//     }
//     return this;
// }
//
//
// /**
//  * Unset value from Html Dropdown Select Field In Action Drop Down List field.
//  *
//  * @return the dsfsd class instance.
//  */
// public dsfsd unsetHtmlDropdownSelectFieldInActionDropDownListField(String htmlDropdownSelectFieldInActionValue) {
//     new Select(htmlDropdownSelectFieldInAction).deselectByVisibleText(htmlDropdownSelectFieldInActionValue);
//     return this;
// }
// public dsfsd setComments6CheckboxField() {
//     if (!comments6.isSelected()) {
//         comments6.click();
//     }
//     return this;
// }
// /**
//  * Unset Comments Checkbox field.
//  *
//  * @return the dsfsd class instance.
//  */
// public dsfsd unsetComments6CheckboxField() {
//     if (comments6.isSelected()) {
//         comments6.click();
//     }
//     return this;
// }
//
//
// /**
//  * Verify that the page loaded completely.
//  *
//  * @return the dsfsd class instance.
//  */
// public dsfsd verifyPageLoaded() {
//     (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
//         public Boolean apply(WebDriver d) {
//             return d.getPageSource().contains(pageLoadedText);
//         }
//     });
//     return this;
// }
//
// /**
//  * Verify that current page URL matches the expected URL.
//  *
//  * @return the dsfsd class instance.
//  */
// public dsfsd verifyPageUrl() {
//     (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
//         public Boolean apply(WebDriver d) {
//             return d.getCurrentUrl().contains(pageUrl);
//         }
//     });
//     return this;
// }
