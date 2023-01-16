package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;

import java.util.NoSuchElementException;

public class HerokuappStepdefinitions {
    HerokuappPage herokuappPage= new HerokuappPage();


    @Then("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButonu.click();

    }

    @Then("Delete butonu görürnür oluncaya kadar bekler")
    public void delete_butonu_görürnür_oluncaya_kadar_bekler() throws InterruptedException {

        Thread.sleep(2000);

    }

    @Then("Delete butonu görürnür oldugunu test eder")
    public void delete_butonu_görürnür_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());

    }

    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButonu.click();

    }

    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        int flag=3;


        try {
            herokuappPage.deleteButonu.click();
            Assert.assertFalse(flag==3);
        } catch (NoSuchElementException e) {
            Assert.assertTrue(flag==3);

        }

    }
}