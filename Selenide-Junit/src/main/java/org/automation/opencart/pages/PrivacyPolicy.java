package org.automation.opencart.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by shantonu on 3/20/17.
 */
public class PrivacyPolicy extends PageBase {
    public PrivacyPolicy(WebDriver aDriver) {
        super(aDriver);
    }

    public WebElement description;
    public WebElement title;
}
