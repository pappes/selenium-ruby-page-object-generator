/**
 * Created by Dave on 4/03/2017. (C)  all rights reserved
 */


//  uncomment the below line (and two lines at the bottom)
//  to isolate the scope of the logic in a bookmarklet which will reduce naming conflicts
//javascript:(function(){


//TODO: add comment header to output file including a link to confluence and other instructions
//TODO: more element type specific logic (anchor)
//TODO: check boxes with values, check boxes without values
//TODO: select (combo box) elements
//TODO: unit testing using a framework

    function createPageObjectHeader(title) {
        //sample output:
        //    class EBSLoginPage < Page
        const HEADERPREFIX = 'class ';
        const HEADERSUFFIX = ' < Page\n\n';

        return HEADERPREFIX + title + HEADERSUFFIX;
    }
    function createPageObjectFooter() {
        //sample output:
        //    end
        const FOOTERLINE = '\n\nend\n';

        return FOOTERLINE;
    }
    function getInputFieldName(inputField) {
        //most buttons have a user readable id and no value for name
        //most input fields have a user readable name
        return inputField.name || inputField.id;
    }
    function createPageObjectAnnotation(inputField) {
        //sample output:
        //    @@login_button = {:platform => "Web", :id_type => :id, :id_value => "login_button" }
        //    @@user_name = {:platform => "Web", :id_type => :name, :id_value => "user_name" }
        const ANNOTATIONPREFIX  = '    @@';
        const ANNOTATIONIDMID   = ' = {:platform => "Web", :id_type => :id, :id_value => "';
        const ANNOTATIONNAMEMID = ' = {:platform => "Web", :id_type => :name, :id_value => "';
        const ANNOTATIONSUFFIX  = '" }\n';
        const ATTRIBUTENAME  = 'name';

        var annotations = '';
        var inputName = getInputFieldName(inputField);

        annotations += ANNOTATIONPREFIX;
        annotations += inputName;
        //most buttons have a user readable id and no value for name
        //most input fields have a user readable name
        annotations += inputField.hasAttribute(ATTRIBUTENAME) ? ANNOTATIONNAMEMID : ANNOTATIONIDMID;
        annotations += inputName;
        annotations += ANNOTATIONSUFFIX;
        return annotations;
    }
    function createPageObjectMethod(inputField) {
        const INPUTTYPEBUTTON  = 'button';
        const METHODPREFIX     = '\n    def self.';
        const METHODSUFFIX     = '\n    end\n';
        //sample input types are : button, checkbox, color, date, email, number, radio, submit, time, etc

        var method = METHODPREFIX;
        var inputName = getInputFieldName(inputField);

        if (inputName !== null) {
            var method = METHODPREFIX;
            if (inputField.type === INPUTTYPEBUTTON) {
                method += createPageObjectButtonMethod(inputName);
            } else {
                method += createPageObjectFieldMethod(inputName);
            }
            method += METHODSUFFIX;
        }
        return method;
    }
    function createPageObjectButtonMethod(buttonName) {
        //sample button method:
        //    def self.login_button
        //    click @@login_button
        //    end
        const CLICKMETHODMID    = '\n    click @@';

        return buttonName + CLICKMETHODMID + buttonName;
    }
    function createPageObjectFieldMethod(fieldName) {
        //sample text field method:
        //    def self.user_name=user_name_value
        //    enter @@user_name,user_name_value
        //    end
        const ENTERMETHODMID1   = '=';
        const ENTERMETHODMID2   = '\n    enter @@';
        const ENTERMETHODMID3   = ',';
        const VALUESUFFIX       = '_value';

        return fieldName + ENTERMETHODMID1 + fieldName + VALUESUFFIX + ENTERMETHODMID2 +fieldName + ENTERMETHODMID3 + fieldName + VALUESUFFIX;
    }
    function createPageObject(parentNode, pageObjectName) {
        // Get the list of user input fields from the current HTML page and build a Ruby page object file
        const INTERACTIVEELEMENTS   = 'a,button,input,select,textarea';
        var rubyPageObject ='';
        var inputFields = parentNode.querySelectorAll(INTERACTIVEELEMENTS);
        var i = 0;

        rubyPageObject += createPageObjectHeader(pageObjectName);
        for (i = 0; i < inputFields.length; ++i) {
            rubyPageObject += createPageObjectAnnotation(inputFields[i]);
        }
        for (i = 0; i < inputFields.length; ++i) {
            rubyPageObject += createPageObjectMethod(inputFields[i]);
        }
        rubyPageObject += createPageObjectFooter();
        return rubyPageObject;
    }
    function giveFileToUser(fileName, fileContents) {
        const ANCHORTAG                  = 'a';
        const ANCHORTARGETATTRIBUTE      = 'href';
        const ANCHORDESTINATIONATTRIBUTE = 'download';
        const PLAINTEXTENCODING          = 'data:text/plain;charset=utf-8,';
        const ELEMENTDISPLAYHIDDEN       = 'none';

        var element = document.createElement(ANCHORTAG);

        element.setAttribute(ANCHORTARGETATTRIBUTE, PLAINTEXTENCODING + encodeURIComponent(fileContents));
        element.setAttribute(ANCHORDESTINATIONATTRIBUTE, fileName);
        element.style.display = ELEMENTDISPLAYHIDDEN;
        document.body.appendChild(element);

        element.click();

        document.body.removeChild(element);
    }
    function constructPageObject(webPage) {

        const FILENAME = 'pageObject.rb';
        giveFileToUser(FILENAME, createPageObject(webPage), webPage.title);
    }

//  uncomment the below 2 lines to execute the logic immediately for the current page as a bookmarklet
//constructPageObject(document);
//})();



  /*
  See below for a Ruby pageobject sample

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
//
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
// public dsfsd setComments9CheckboxField() {
//     if (!comments9.isSelected()) {
//         comments9.click();
//     }
//     return this;
// }
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
