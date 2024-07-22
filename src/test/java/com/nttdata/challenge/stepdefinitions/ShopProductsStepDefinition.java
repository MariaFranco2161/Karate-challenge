package com.nttdata.challenge.stepdefinitions;


import com.nttdata.challenge.tasks.AddProductsToCart;
import com.nttdata.challenge.tasks.CompletePurchaseForm;
import com.nttdata.challenge.tasks.GoToPurchase;
import com.nttdata.challenge.tasks.ViewCart;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class ShopProductsStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario esta en la pagina principal de DemoBlaze")
    public void queElUsuarioEstaEnLaPaginaPrincipalDeDemoBlaze() {
        OnStage.theActorCalled("Usuario").attemptsTo(Open.url("http://demoblaze.com"));
    }

    @When("el usuario agrega los siguientes productos al carrito:")
    public void elUsuarioAgregaLosSiguientesProductosAlCarrito(DataTable productos) {
        List<String> productosList = productos.asList(String.class);
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductsToCart.add(productosList));
    }

    @When("el usuario visualiza el contenido del carrito")
    public void elUsuarioVisualizaElContenidoDelCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(ViewCart.view());
    }

    @And("el usuario va a realizar el pedido")
    public void elUsuarioVaARealizarElPedido() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToPurchase.goToPurchase());
    }

    @When("el usuario completa el formulario de compra con:")
    public void elUsuarioCompletaElFormularioDeCompraCon(Map<String, String> purchaseDetails) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletePurchaseForm.with(
                purchaseDetails.get("Nombre"),
                purchaseDetails.get("Pais"),
                purchaseDetails.get("Ciudad"),
                purchaseDetails.get("Tarjeta"),
                purchaseDetails.get("Mes"),
                purchaseDetails.get("Anio")
        ));
    }

    @Then("el usuario finaliza la compra exitosamente")
    public void elUsuarioFinalizaLaCompraExitosamente() {

    }


}