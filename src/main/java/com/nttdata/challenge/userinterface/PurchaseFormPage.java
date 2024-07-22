package com.nttdata.challenge.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseFormPage {
    public static final Target NAME_FIELD = Target.the("name field")
            .located(By.id("name"));
    public static final Target COUNTRY_FIELD = Target.the("country field")
            .located(By.id("country"));
    public static final Target CITY_FIELD = Target.the("city field")
            .located(By.id("city"));
    public static final Target CARD_FIELD = Target.the("card field")
            .located(By.id("card"));
    public static final Target MONTH_FIELD = Target.the("month field")
            .located(By.id("month"));
    public static final Target YEAR_FIELD = Target.the("year field")
            .located(By.id("year"));
    public static final Target PURCHASE_BUTTON = Target.the("purchase button")
            .located(By.xpath("//button[text()='Purchase']"));
}