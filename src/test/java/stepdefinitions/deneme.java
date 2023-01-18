package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class deneme {
AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon anasayfaya giderr")
    public void kullanici_amazon_anasayfaya_giderr() {
        Driver.getDriver().get("https://www.amazon.com");
    }
    @Then("amazon arama kutusuna Nutella yazip aratirr")
    public void amazon_arama_kutusuna_nutella_yazip_aratirr() {
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test ederr")
    public void arama_sonuclarinin_nutella_icerdigini_test_ederr() {
      Assert.assertTrue(amazonPage.aramaSonucuElementi.getText().contains("Nutella"));
    }
    @Then("sayfayi kapatirr")
    public void sayfayi_kapatirr() {
        Driver.quitDriver();

    }
}
