

Feature: US1005 Kullanici configuration.properties'de yazilan datalari parametre olarak kullanir
  # 3 scenario olusturup, amazon,wisequarter ve walmart anasayfalarina gidiniz
  # ve o anasayfalara gittiginizi test ediniz
  # parametre olarak kullandigimiz kelimeler direk testte kullanilacak datalar olabilecegi gibi
  #configuration.properties'de bulunan key'ler de olabilir
  #Configreader'daki getProperty() kullanilip
  #configuration.Properies dosyasondaki value testte kullanilabilir


  Scenario: TC06 Kullanici amazon sitesine gidisini test eder

    Given kullanici "amazonUrl" anasayfaya gider
    Then url de "amazon" oldugunu test eder
    And sayfayi kapatir


  Scenario: TC07 Kullanici walmart sitesine gidisini test eder

    Given kullanici "wqUrl" anasayfaya gider
    Then url de "wisequarter" oldugunu test eder
    And sayfayi kapatir

  Scenario: TC08 Kullanici walmart sitesine gidisini test eder

    Given kullanici "walmartUrl" anasayfaya gider
    Then url de "walmart" oldugunu test eder
    And sayfayi kapatir