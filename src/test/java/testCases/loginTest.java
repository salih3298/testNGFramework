package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class loginTest extends CommonMethods {
    /*
    testcase 1:
    login into the application
    verify the message Welcome Admin
     */
    @Test
    public void loginTest(){
        sendText(login.usernameTextField,"Admin");
        sendText(login.passwordTextField,"Hum@nhrm123");
        click(login.loginBtn);
//        verify the message
        String actualMessage = dash.welcomeAdminLocator.getText();
//        verification
        Assert.assertEquals(actualMessage,"Welcome Admin");
    }


}