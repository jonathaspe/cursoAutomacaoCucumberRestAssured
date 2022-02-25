package steps;

import io.cucumber.java.en.*;
import components.components;

public class crudapi {

    components component;

    @Given("que for acessado o endpoint {string}")
    public void queForAcessadoOEndpoint(String url) {
        component = new components(url);
    }

    @When("seja efetuado o CREATED")
    public void sejaEfetuadoOCREATED() {
        component.postEndpoint();
    }

    @When("seja efetuado o UPDATE")
    public void sejaEfetuadoOUPDATE() {
        component.updateEndpoint();
    }

    @Then("seja efetuado o DELETE")
    public void sejaEfetuadoODELETE() {
        component.deleteEndpoint();
    }
}
