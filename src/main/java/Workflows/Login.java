    package Workflows;

import Base.BaseFunctions;

    public class Login extends BaseFunctions {
    
        public Login() {
    
        }
    
        /**
         * isLoginPage:
         * Methods that verifies if login page has appeared.
         * @param title The expected login welcome title
         */
        public void isLoginPage(String title) {
            manage.wait.isElementVisible(bootUI.loginPage.signInTitle);
            manage.wait.isTextPresentInElement(bootUI.loginPage.signInTitle, title);
        }
    
    
        /**
         * newLogin:
         * A method that performs new simple login
         * @param email The email address of the user
         * @param password The password of the user
         * @param isRememberMe A boolean param that decides rather checking remember me checkbox or not
         */
        public void newLogin(String email, String password, boolean isRememberMe) {
            // verify if email and password fields are available
            manage.wait.isElementClickable(bootUI.loginPage.emailField);
            manage.wait.isElementClickable(bootUI.loginPage.passwordField);
    
            // Set values in email and password fields
            manage.update.text(bootUI.loginPage.emailField, email);
            manage.update.text(bootUI.loginPage.passwordField, password);
    
            // Optional; Clicking on remember me checkbox
            if (isRememberMe)
                manage.click.on(bootUI.loginPage.rememberMeCheckBox);
    
            //Sing in
            manage.click.on(bootUI.loginPage.signInButton);
        }
    }
