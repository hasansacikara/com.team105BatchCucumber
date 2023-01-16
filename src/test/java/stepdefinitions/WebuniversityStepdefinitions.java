package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WebuniversityPage;
import utilities.Driver;

import java.util.Set;

public class WebuniversityStepdefinitions {
   WebuniversityPage webuniversityPage= new WebuniversityPage();
   String ilkSayfaHandleDegeri;
   Faker faker= new Faker();

    @Then("login portal elementine kadar asagi iner")
    public void login_portal_elementine_kadar_asagi_iner() {
    }

    @Then("login portala tiklar")
    public void login_portala_tiklar() {
        ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        webuniversityPage.loginPortalButonu.click();

    }
    @Then("acilan yeni window a gecer")
    public void acilan_yeni_window_a_gecer() {
        // eger yeniwindow'a geciyorsa , yeni window acilmadan
        // ilk sayfanin window handle degerini kaydetmeliyiz

        Set<String> windowHandlesSeti = Driver.getDriver().getWindowHandles() ;
        String ikinciSayfaHandleDegeri="";
        for (String each : windowHandlesSeti) {
            if (!each.equals(ikinciSayfaHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }
            
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);

    }

    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {
        webuniversityPage.userNameKutusu.sendKeys(faker.name().username());

    }

    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {
        webuniversityPage.passwordKutusu.sendKeys(faker.internet().password());

    }

    @Then("webunuversity login butonuna basar")
    public void webunuversity_login_butonuna_basar() {
        webuniversityPage.loginButonu.click();

    }

    @Then("popup ta cikan yazinin  validation failf oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failf_oldugunu_test_eder() {
        String actualPopUpyazi= Driver.getDriver().switchTo().alert().getText();
        String expectedYazi="validation failed";
        Assert.assertEquals(actualPopUpyazi,expectedYazi);

    }

    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("ilk sayfaya geri döner")
    public void ilk_sayfaya_geri_döner() {
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);

    }

    @Then("ilk sayfaya döndügünü test eder")
    public void ilk_sayfaya_döndügünü_test_eder() {
        Assert.assertTrue(webuniversityPage.contacUsLinki.isDisplayed());

    }
}
