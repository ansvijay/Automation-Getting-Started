package org.automation.opencart.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 4/27/17.
 */
public class ProductPageCommon extends PageBase{

    public String description_tab_css="a[href='#tab-description']";
    public String review_tab_css="a[href='#tab-review']";

    public void addToWishList(){
    }
    private String addToCart_id="button-cart";
    public void compareThis(){
        //its a java script event, so we need to call with product identifier
    }
    public void likeOnFB(){

    }
    public void tweet(){

    }

    public void pinit(){

    }
    //we need to special handler with JS
    public void shareIt(){

    }
}
