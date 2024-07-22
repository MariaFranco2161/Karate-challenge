package com.nttdata.challenge.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target BTN_PLACE_ORDER = Target.the("place order button")
            .located(By.xpath("//button[text()='Place Order']"));
}