package com.Zara.pages;
import com.Zara.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public  class basePage {
    public basePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy (id = "APjFqb")
  public   WebElement googleSearchBox;

    @FindBy (xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    public WebElement AccptBtn;
@FindBy (xpath = "//h3[@class='LC20lb MBeuO DKV0Md']")
    public WebElement WikiPage;

public WebElement WikiPage(){
    WebElement WikiPageLoc=null;
    for (int i = 0; i <24; i++) {

        String WikiPageloc="(//h3[@class='LC20lb MBeuO DKV0Md'])[i]";
        WebElement WikiPageV=Driver.getDriver().findElement(By.xpath(WikiPageloc));
      if (WikiPageV.getText()=="Automatización - Wikipedia, la enciclopedia libre"){
          WikiPageLoc=WikiPageV;
          break;
      }

    }
    return WikiPageLoc;
    //h3[@class='LC20lb MBeuO DKV0Md']
}

@FindBy (xpath = "//h3[contains(text(), 'Automatización - Wikipedia, la enciclopedia libre')]")
    public WebElement WikiLoc;
}
