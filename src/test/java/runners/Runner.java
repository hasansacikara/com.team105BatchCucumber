package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html"},
        features = "src/test/resourcess/features" ,
        glue = "stepdefinitions" ,
        tags = "wip" ,
        dryRun = false
        // sorun neydı hocam. run edemiyorum classlar çalıyor fakat run çalışmıyor surekli hara alıyorm.sizde hocam
        // hocam sorun butun adımları benım yaptıgım gıbı yapmanız gerekıyor Runner ıse onceden calıstırdıgı US1009
        // hocam gordugun gıbı adımlar hatalı ben yenı bır ornek olsun dıye class olusturdum
        // runner calısmama nedenı feature onceden artık nasıl oldu ıse anlamadım tanımlı olanı calıstırmaya calsııyor
        //oda hatalı oldugu ıcın error  verıyordu
        // hatalı olanı ıptal ettım sımdı calısıyor sıze tavsıyem adımları tekrardan yapmanız sadece Feature lerı sılın
        //aynılarını tekrar yazın .
        // hocam gerçeten çok ama çook tesekkür ederim  .
        //goruyor elle mı yazdınız yoksa kodları kopyaladınız mı.
        // eski projeyi hata veriyor diye yeni bir proje olusturdum kodları ise ahmet hocanın videolarini izleyerek
        // tek tek yazdım bir hata olmasın diye adım adım uyguladım.
)
public class Runner {


    /*
        Cucumber'da Runner class'i bos bir class'tir
        Runner class'ini diger class'lardan farkli kilan
        ve TestNG'deki xml dosyalari gibi calismasini saglayan
        2 adet notasyon mevcuttur
        @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebibidir
        bu sayede runner class'larimiz cucumber ile calisir
        @CucumberOptions notasyonu ile istedigimiz ozellikleri Runner class'ina ekleyebiliriz
        Raporlama gibi ekstra option'lari da ileride ekleyecegiz
        Ancak
        oncelikli gorevi features dosyalari ile stepdefinitions'da bulunan
        Java method'larini ilisiklendirmektir
        tags : features classoru icerisinde yazilan tag(lari) aratip
        buldugu tum feature veya scenario'lari calistirir
        dryRun : iki deger alabilir
        true : secilirse, verilen tag ile isaretli olan Feature veya Scenario'daki
                eksik stepdefinitions'lari bulup
                ilgili method'lari olusturur
                Hic bir sekilde testimizi calistirmaz
                eksik adim yoksa test passed olarak isaretler
        false : secilirse, verilen tag ile isaretlenen
                Feature veya Scenario'lari calistirir




     */


}
