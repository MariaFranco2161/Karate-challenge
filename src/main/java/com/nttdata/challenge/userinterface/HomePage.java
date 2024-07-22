package com.nttdata.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target CART_LINK = Target.the("cart link")
            .located(By.id("cartur"));

    public static Target productByName(String productName) {
        return Target.the("producto con nombre " + productName)
                .located(By.xpath("//a[text()='" + productName + "']"));
    }

    public static final Target BTN_ADD_TO_CART = Target.the("botón de agregar al carrito")
            .located(By.xpath("//a[text()='Add to cart']"));

    public static final Target BTN_GO_TO_HOME = Target.the("botón de ir al home")
            .located(By.xpath("//a[text()='Home ']"));

}


